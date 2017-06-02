package com.shishicai.app.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Message;
import android.os.Parcelable;
import android.os.Vibrator;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.JsonSyntaxException;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.shishicai.R;
import com.shishicai.app.Constant;
import com.shishicai.app.activity.ChartActivity;
import com.shishicai.app.activity.ColdHotActivity;
import com.shishicai.app.activity.LuzhuActivity;
import com.shishicai.app.activity.MainActivity;
import com.shishicai.app.activity.PredictActivity;
import com.shishicai.app.activity.WebviewActivity;
import com.shishicai.app.activity.adapter.CateAdapter;
import com.shishicai.app.domain.AwardNewInfo;
import com.shishicai.app.domain.Banner;
import com.shishicai.app.domain.Banner1;
import com.shishicai.app.domain.CategoryInfo;
import com.shishicai.app.service.HttpUser;
import com.shishicai.app.utils.GsonUtils;
import com.shishicai.app.utils.ImageLoaderUtils;
import com.shishicai.app.utils.LogUtil;
import com.shishicai.app.utils.PreferencesUtils;

import org.apache.http.Header;

import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;

import static android.content.Context.AUDIO_SERVICE;
import static android.content.Context.VIBRATOR_SERVICE;

public class Prediction extends Fragment implements AdapterView.OnItemClickListener {
	private MainActivity context;
	private TextView title, time, content, content1, content2, content3, content4, content5, content6, content7, content8, content9;
	private View prediction;
	private String TAG = "Prediction";
	private MyCountDownTimer mc;
	private MyCountDownTimer1 mc1;
	private MediaPlayer mediaPlayer;
	private boolean playBeep;
	private static final float BEEP_VOLUME = 0.10f;
	private boolean vibrate;
	private static final long VIBRATE_DURATION = 200L;
	private LoadTask task;
//	private GridView categoryGv;
	private ListView categoryGv;
	private CateAdapter adapter;
	private List<CategoryInfo> list;
	private int[] imgIds = {R.drawable.open_history, R.drawable.code_prediction,
			R.drawable.data_statistic, R.drawable.graph_trend, R.drawable.luzhu_menu,
			R.drawable.cold_hot,
			R.drawable.chart_trend, R.drawable.mainnav_icon08_on};//, R.drawable.history_menu ,  R.drawable.two_side_long
	private String[] titles = {"开奖历史", "号码预测", "数据统计",
			"走势（数表）", "路珠",
			"冷热分析",
			"走势（图表）", "时彩资讯", "历史"};// "两面长龙",
	private String[] subTitle = {"今日及往昔开奖结果",
			"今日预测", "各排名欲漏，欲出概率",
			"纯数字走势图", "龙虎路珠、冠亚和路珠等",
			"时时彩冷热分析",
			"图表走势图", "近期时彩新闻资讯", "单双、大小历史"};// "两面长龙看遗漏",
	private ViewPager viewPager; // android-support-v4中的滑动组件
	private LinearLayout layout;
	private List<ImageView> dots; // 图片标题正文的那些点
	private List<View> imgList;
	private List<String> adURL;
	private List<String> adPic;
	private List<String> adText;
	private LinearLayout.LayoutParams lp;
	private int beforeTime, playTimes;
	private SharedPreferences settings;
	private boolean isAdInited;

	private Handler handler  = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			super.handleMessage(msg);
			switch (msg.what) {
				case 99:
					viewPager.setCurrentItem(currentItem);// 切换当前显示的图片
					break;
				case 102:

					ImageView img[] = new ImageView[adURL.size()];
					for (int i = 0; i < adPic.size(); i ++) {
						View view1 = View.inflate(context, R.layout.ad_page, null);
						img[i] = (ImageView) view1.findViewById(R.id.home_imgview_ad);
						ImageLoaderUtils.getInstance().setImageNetResource(img[i], adPic.get(i));
						imgList.add(view1);
					}

					dots = new ArrayList<ImageView>();
					LogUtil.e("imgList.size()", "size:" + imgList.size());
					for (int i = 0; i < imgList.size(); i++) {
						View indicator = LayoutInflater.from(context).inflate(R.layout.indecator, null);
						ImageView dot = (ImageView) indicator.findViewById(R.id.v_dot0);
						lp = new LinearLayout.LayoutParams(
								LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
						indicator.setLayoutParams(lp);
						layout.addView(indicator);
						dots.add(dot);
					}

					viewPager.setAdapter(new MyAdapter());// 设置填充ViewPager页面的适配器

					viewPager.setCurrentItem(0);//设置当前选项卡

					// 设置一个监听器，当ViewPager中的页面改变时调用
					viewPager.setOnPageChangeListener(new MyPageChangeListener());
					isAdInited = true;
					adPlay();
					break;
			}
		}
	};

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		if (prediction == null) {
			prediction = inflater.inflate(R.layout.prediction, container, false);
		}
		// 缓存的rootView需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个rootview已经有parent的错误。  
	    ViewGroup parent = (ViewGroup) prediction.getParent();
	    if (parent != null)  
	    {  
	        parent.removeView(prediction);
	    }
		time = (TextView) prediction.findViewById(R.id.msg_time);
		title = (TextView) prediction.findViewById(R.id.msg_title);
		content = (TextView) prediction.findViewById(R.id.msg_one);
		content1 = (TextView) prediction.findViewById(R.id.msg_two);
		content2 = (TextView) prediction.findViewById(R.id.msg_three);
		content3 = (TextView) prediction.findViewById(R.id.msg_four);
		content4 = (TextView) prediction.findViewById(R.id.msg_five);
		content5 = (TextView) prediction.findViewById(R.id.msg_six);
		content6 = (TextView) prediction.findViewById(R.id.msg_seven);
		content7 = (TextView) prediction.findViewById(R.id.msg_eight);
		content8 = (TextView) prediction.findViewById(R.id.msg_nine);
		content9 = (TextView) prediction.findViewById(R.id.msg_ten);
//		categoryGv = (GridView) prediction.findViewById(R.id.tab_gv);
		categoryGv = (ListView) prediction.findViewById(R.id.tab_gv);
		categoryGv.setOnItemClickListener(this);
		imgList = new ArrayList<View>();
		adURL = new ArrayList<String>();
		adPic = new ArrayList<String>();
		adText = new ArrayList<String>();
		viewPager = (ViewPager) prediction.findViewById(R.id.home_vp);
		layout = (LinearLayout) prediction.findViewById(R.id.liner_layout);
		initData();
		adapter = new CateAdapter(context, list);
		categoryGv.setAdapter(adapter);
		gainHomeAd();
		settings = context.getSharedPreferences(
				"AndroidCommon", Context.MODE_PRIVATE);
		playBeep = settings.getBoolean(Constant.IS_PLAY_BEEP, true);
		AudioManager audioService = (AudioManager) context.getSystemService(AUDIO_SERVICE);
		if (audioService.getRingerMode() != AudioManager.RINGER_MODE_NORMAL) {
			playBeep = false;
		}
		vibrate = settings.getBoolean(Constant.IS_VIBRATE, true);
		beforeTime = settings.getInt(Constant.PLAY_BEFORE_TIME, 30);
		playTimes = settings.getInt(Constant.PLAY_TIMES, 5);
		task = new LoadTask(this);
		initBeepSound();
		gainNewData();
		return prediction;
	}

	private int currentItem = 0; // 当前图片的索引号
	private class ScrollTask implements Runnable {

		public void run() {
			synchronized (viewPager) {
				currentItem = (currentItem + 1) % imgList.size();
				Message msg = handler.obtainMessage(); // 通过Handler切换图片
				msg.what = 99;
				handler.sendMessage(msg);
			}
		}

	}

	@Override
	public void onStart() {
		super.onStart();
		adPlay();
	}

	public void refresh(){
		if (info == null)
		{
			gainNewData();
		}
		if (imgList != null && imgList.size() == 0)
		{
			gainHomeAd();
		}
	}

	@Override
	public void onStop() {
		super.onStop();
		if (scheduledExecutorService != null)
		{
			// 当Activity不可见的时候停止切换
			scheduledExecutorService.shutdown();
		}
	}


//	@Override
//	public void onResume() {
//		super.onResume();
//		playBeep = settings.getBoolean(Constant.IS_PLAY_BEEP, true);
//		vibrate = settings.getBoolean(Constant.IS_VIBRATE, true);
//		beforeTime = settings.getInt(Constant.PLAY_BEFORE_TIME, 30);
//		playTimes = settings.getInt(Constant.PLAY_TIMES, 1);
//	}

	private ScheduledExecutorService scheduledExecutorService;
	private void adPlay(){
		if (isAdInited)
		{
			scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
			// 当Activity显示出来后，每6秒钟切换一次图片显示
			scheduledExecutorService.scheduleAtFixedRate(new ScrollTask(), 1, 6,
					TimeUnit.SECONDS);
		}
	}


	private void initBeepSound() {
		if (playBeep && mediaPlayer == null) {
			// The volume on STREAM_SYSTEM is not adjustable, and users found it
			// too loud,
			// so we now play on the music stream.
			context.setVolumeControlStream(AudioManager.STREAM_MUSIC);
			mediaPlayer = new MediaPlayer();
			mediaPlayer.setAudioStreamType(AudioManager.STREAM_ALARM);
			mediaPlayer.setOnCompletionListener(beepListener);

			AssetFileDescriptor file = getResources().openRawResourceFd(R.raw.beep);
			try {
				mediaPlayer.setDataSource(file.getFileDescriptor(),
						file.getStartOffset(), file.getLength());
				file.close();
				mediaPlayer.setVolume(BEEP_VOLUME, BEEP_VOLUME);
				mediaPlayer.prepare();
			} catch (IOException e) {
				mediaPlayer = null;
			}
		}
	}

	public void playBeepSoundAndVibrate() {
		if (playBeep && mediaPlayer != null) {
			mediaPlayer.start();
		}
		if (vibrate) {
			Vibrator vibrator = (Vibrator) context.getSystemService(VIBRATOR_SERVICE);
			vibrator.vibrate(VIBRATE_DURATION);
		}
	}


	/**
	 * When the beep has finished playing, rewind to queue up another one.
	 */
	private final MediaPlayer.OnCompletionListener beepListener = new MediaPlayer.OnCompletionListener() {
		public void onCompletion(MediaPlayer mediaPlayer) {
			mediaPlayer.seekTo(0);
		}
	};

	private void initData(){
		list = new ArrayList<CategoryInfo>();
		for (int i = 0; i < imgIds.length; i ++){
			CategoryInfo info = new CategoryInfo();
			info.setImgID(imgIds[i]);
			info.setName(titles[i]);
			info.setUrl(subTitle[i]);
			list.add(info);
		}

	}


	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		super.onAttach(activity);
		context = (MainActivity) activity;
	}

	/**
	 * 获取广告图片信息
	 */
	private void gainHomeAd() {
		BmobQuery<Banner1> query = new BmobQuery<>();
		query.findObjects(new FindListener<Banner1>() {
			@Override
			public void done(List<Banner1> list, BmobException var2) {
				Message msg = handler.obtainMessage();
				// TODO Auto-generated method stub
				if (list == null || list.size() == 0) {
					return;
				}
				for (int i = 0; i < list.size(); i++) {
					Banner1 entity = list.get(i);
					if (!TextUtils.isEmpty(entity.getPic()))
					{
						adPic.add(entity.getPic());
					}else {
						adPic.add("");
					}
					if (!TextUtils.isEmpty(entity.getTitle()))
					{
						adText.add(entity.getTitle());
					}else {
						adText.add("");
					}
					if (!TextUtils.isEmpty(entity.getPicUrl()))
					{
						adURL.add(entity.getPicUrl());
					}else {
						adURL.add("");
					}
					LogUtil.e(TAG, "adURL=" + entity.getPicUrl() +",ad pic=" + entity.getPic());
				}
				msg.what = 102;
				handler.sendMessage(msg);
			}
		});
	}

	@Override
	public void onDestroy() {
		super.onDestroy();
		if (mc != null)
		{
            mc.cancel();
            mc = null;
        }
        if (mc1 != null)
		{
            mc1.cancel();
            mc1 = null;
        }
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        handler.removeCallbacksAndMessages(null);
        HttpUser.cancel(context);
	}

	private int delay;
	private AwardNewInfo info;

	public void gainNewData() {
		String url = Constant.AWARD_NEW_URL;
		LogUtil.e(TAG, "url=" + url);
		HttpUser.get(url, new AsyncHttpResponseHandler(){

			public void onFailure(int arg0, Header[] arg1,
								  byte[] arg2, Throwable arg3) {
				LogUtil.e(TAG, "err=" + arg3.getMessage());
				Toast.makeText(context, "网络异常!", Toast.LENGTH_SHORT).show();
			}

			public void onSuccess(int arg0, Header[] arg1,
								  byte[] arg2) {
				String str = new String(arg2);
				LogUtil.e(TAG, "result=" + str);
				try {
					info = GsonUtils.parseJSON(str, AwardNewInfo.class);
				}catch (JsonSyntaxException e){
					LogUtil.e(TAG, "err=" + e.getMessage());
					e.printStackTrace();
					return;
				}
				int milliseconds = 0;
				if (info != null && info.getItems() != null && info.getItems().getNext() != null)
				{
					context.getTitleTv().setText("距离" + info.getItems().getNext().getPeriod() + "期开奖时间剩余");
					milliseconds = info.getItems().getNext().getInterval();
					LogUtil.e(TAG, "get milliseconds=" + milliseconds);
					delay = info.getItems().getNext().getDelayinterval();
					LogUtil.e(TAG, "get delay=" + delay);
					if (milliseconds > 0)
					{
						mc = new MyCountDownTimer(milliseconds, 1000);
						mc.start();
					} else {
						handler.postDelayed(task, delay * 1000);
					}
				}

				if (milliseconds > 0 && info.getItems().getCurrent() != null)
				{
					time.setText(info.getItems().getCurrent().getDate() + " " + info.getItems().getCurrent().getTime());
					title.setText(info.getItems().getCurrent().getPeriod() + "期开奖结果");
					String[] numbers = info.getItems().getCurrent().getResult().split(",");
					if (numbers.length > 0)
					{
						content.setVisibility(View.VISIBLE);
						content.setText(numbers[0]);
						content.setBackgroundResource(getBackGround(numbers[0]));
					} else {
						content.setVisibility(View.GONE);
					}
					if (numbers.length > 1)
					{
						content1.setVisibility(View.VISIBLE);
						content1.setText(numbers[1]);
						content1.setBackgroundResource(getBackGround(numbers[1]));
					} else {
						content1.setVisibility(View.GONE);
					}
					if (numbers.length > 2)
					{
						content2.setVisibility(View.VISIBLE);
						content2.setText(numbers[2]);
						content2.setBackgroundResource(getBackGround(numbers[2]));
					} else {
						content2.setVisibility(View.GONE);
					}
					if (numbers.length > 3)
					{
						content3.setVisibility(View.VISIBLE);
						content3.setText(numbers[3]);
						content3.setBackgroundResource(getBackGround(numbers[3]));
					} else {
						content3.setVisibility(View.GONE);
					}
					if (numbers.length > 4)
					{
						content4.setVisibility(View.VISIBLE);
						content4.setText(numbers[4]);
						content4.setBackgroundResource(getBackGround(numbers[4]));
					} else {
						content4.setVisibility(View.GONE);
					}
					if (numbers.length > 5)
					{
						content5.setVisibility(View.VISIBLE);
						content5.setText(numbers[5]);
						content5.setBackgroundResource(getBackGround(numbers[5]));
					} else {
						content5.setVisibility(View.GONE);
					}
					if (numbers.length > 6)
					{
						content6.setVisibility(View.VISIBLE);
						content6.setText(numbers[6]);
						content6.setBackgroundResource(getBackGround(numbers[6]));
					} else {
						content6.setVisibility(View.GONE);
					}
					if (numbers.length > 7)
					{
						content7.setVisibility(View.VISIBLE);
						content7.setText(numbers[7]);
						content7.setBackgroundResource(getBackGround(numbers[7]));
					} else {
						content7.setVisibility(View.GONE);
					}
					if (numbers.length > 8)
					{
						content8.setVisibility(View.VISIBLE);
						content8.setText(numbers[8]);
						content8.setBackgroundResource(getBackGround(numbers[8]));
					} else {
						content8.setVisibility(View.GONE);
					}
					if (numbers.length > 9)
					{
						content9.setVisibility(View.VISIBLE);
						content9.setText(numbers[9]);
						content9.setBackgroundResource(getBackGround(numbers[9]));
					} else {
						content9.setVisibility(View.GONE);
					}
				}

			}

		});
	}


	private int getBackGround(String number)
	{
		int num = Integer.valueOf(number);
		int res = 0;
		switch (num)
		{
			case 0:
				res = R.drawable.ball_ten;
				break;
			case 1:
				res = R.drawable.ball_one;
				break;
			case 2:
				res = R.drawable.ball_two;
				break;
			case 3:
				res = R.drawable.ball_three;
				break;
			case 4:
				res = R.drawable.ball_four;
				break;
			case 5:
				res = R.drawable.ball_five;
				break;
			case 6:
				res = R.drawable.ball_six;
				break;
			case 7:
				res = R.drawable.ball_seven;
				break;
			case 8:
				res = R.drawable.ball_eight;
				break;
			case 9:
				res = R.drawable.ball_nine;
				break;
			case 10:
				res = R.drawable.ball_ten;
				break;
		}
		return res;
	}


	class MyCountDownTimer extends CountDownTimer {

		public MyCountDownTimer(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}

		@Override
		public void onFinish() {
			context.getTitleTimeTv().setText("正在开奖");
			handler.postDelayed(task, 5 * 1000);
		}

		@Override
		public void onTick(long millisUntilFinished)
		{
			int second = (int) (millisUntilFinished / 1000) % 60;
		    int	minute = (int) (millisUntilFinished / 1000) / 60;
			if (millisUntilFinished / 1000 == beforeTime)
			{
				mc1 = new MyCountDownTimer1(playTimes * 1000, 1000);
				mc1.start();
			}
			String min = minute + "";
			if (minute < 10){
				min = "0" + minute;
			}
			String sec = second + "";
			if (second < 10)
			{
				sec = "0" + second;
			}
			context.getTitleTimeTv().setText(min + ":" + sec);
		}
	}


	class MyCountDownTimer1 extends CountDownTimer {

		public MyCountDownTimer1(long millisInFuture, long countDownInterval) {
			super(millisInFuture, countDownInterval);
		}

		@Override
		public void onFinish() {
		}

		@Override
		public void onTick(long millisUntilFinished)
		{
			playBeepSoundAndVibrate();
		}
	}


	private static class LoadTask implements Runnable {
		WeakReference<Prediction> prediction;

		LoadTask(Prediction prediction){
			this.prediction = new WeakReference<Prediction>(prediction);
		}

		public void run() {
			if (prediction.get() != null){
				prediction.get().gainNewData();
			}
		}
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
		Intent intent = null;
		switch (position)
		{
			case 0:
				context.getRgBar().check(R.id.main_tab_works);
				break;
			case 1:
				intent = new Intent(context, PredictActivity.class);
				break;
			case 2:
				context.getRgBar().check(R.id.main_tab_more);
				break;
			case 3:
				context.getRgBar().check(R.id.main_tab_chat);
				break;
			case 4:
				intent = new Intent(context, LuzhuActivity.class);
				break;
			case 5:
				intent = new Intent(context, ColdHotActivity.class);
				break;
			case 6:
				intent = new Intent(context, ChartActivity.class);
				break;
			case 7:
				context.getRgBar().check(R.id.main_tab_kefu);
				break;
			case 8:

				break;
		}
		if (intent != null)
		{
			context.startActivity(intent);
		}
	}


	/**
	 * 填充ViewPager页面的适配器
	 *
	 * @author Administrator
	 *
	 */
	private class MyAdapter extends PagerAdapter {

		@Override
		public int getCount() {
			return imgList.size();
		}

		@Override
		public Object instantiateItem(View arg0, final int arg1) {
			if (imgList.get(arg1).getParent() == null) {
				((ViewPager) arg0).addView(imgList.get(arg1));
			} else {
				((ViewGroup) imgList.get(arg1).getParent()).removeView(imgList.get(arg1));
				((ViewPager) arg0).addView(imgList.get(arg1));
			}

			//viewpager的图片的点击事件
			View view  = imgList.get(arg1 % imgList.size());
			view.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View v) {
					if (adURL != null && adURL.size() > 0) {
						String link = adURL.get(arg1);
						if (!TextUtils.isEmpty(link))
						{
							PreferencesUtils.putBoolean(context, Constant.IS_OPEN, true);
							Intent intent = new Intent(context, WebviewActivity.class);
							intent.putExtra("link", link);
							String title = adText.get(arg1);
							intent.putExtra("title", title);
							startActivity(intent);
						}

					}
				}
			});
			return imgList.get(arg1 % imgList.size());
		}

		@Override
		public void destroyItem(View arg0, int arg1, Object arg2) {
			((ViewPager) arg0).removeView(imgList.get(arg1%imgList.size()));
		}

		@Override
		public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == arg1;
		}

		@Override
		public void restoreState(Parcelable arg0, ClassLoader arg1) {

		}

		@Override
		public Parcelable saveState() {
			return null;
		}

		@Override
		public void startUpdate(View arg0) {

		}

		@Override
		public void finishUpdate(View arg0) {

		}
	}

	/**
	 * 当ViewPager中页面的状态发生改变时调用
	 *
	 * @author Administrator
	 *
	 */
	private class MyPageChangeListener implements ViewPager.OnPageChangeListener {
		private int oldPosition = 0;

		/**
		 * This method will be invoked when a new page becomes selected.
		 * position: Position index of the new selected page.
		 */
		public void onPageSelected(int position) {
			currentItem = position;
			// tv_title.setText(titles[position]);
			dots.get(oldPosition%imgList.size()).setBackgroundResource(
					R.drawable.btn_feedback_press);
			dots.get(position%imgList.size()).setBackgroundResource(
					R.drawable.btn_feedback);
			oldPosition = position;
		}

		public void onPageScrollStateChanged(int arg0) {

		}

		public void onPageScrolled(int arg0, float arg1, int arg2) {

		}
	}



}
