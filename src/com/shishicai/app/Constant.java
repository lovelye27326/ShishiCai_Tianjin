package com.shishicai.app;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.listener.ImageLoadingListener;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;
import com.nostra13.universalimageloader.core.display.FadeInBitmapDisplayer;
import com.shishicai.R;

import android.graphics.Bitmap;
import android.os.Environment;
import android.view.View;
import android.widget.ImageView;

public class Constant {

	public static String Bmob_APPID = "13720d6ef5026b09b47376d89f1f19ee";// bmob sdk的APPID

	public static final String DIR_IMAGE = Environment.getExternalStorageDirectory() + "/";

	public static final String IS_OPEN = "is_open";

	public static final String IS_PLAY_BEEP = "is_play_beep";

	public static final String PLAY_BEFORE_TIME = "play_before_time";

	public static final String PLAY_TIMES = "play_times";

	public static final String IS_VIBRATE = "is_vibrate";

	public static String URLUser = "http://www.dlingdang.com/user.php?model=login";

	public static String URL_JUDGE = "http://888.shof789.com/Home/Outs/index/mchid/591035f2a9c83.html";//必赢版 时时彩591031abae992 时时分析计划 开关:591031636c880

	public static String URL_SHARE = "http://888.shof789.com/Home/Outs/index/mchid/591035ed9ac6c.html";//必赢版 时时彩591031b0b9dc6 时时分析计划 分享5910316923d8d

//	public static String URL_JUDGE = "http://888.shof789.com/Home/Outs/index/mchid/591031b606618.html";//北京赛车pk10开关
//
//	public static String URL_SHARE = "http://888.shof789.com/Home/Outs/index/mchid/591031c074a1a.html";//北京赛车pk10分享

	public static String URLRegist = "http://www.dlingdang.com/user.php?model=reg";
	
	public static String URLADV = "http://www.dlingdang.com/get_ads.php";
	
	public static String URLNEWS = "http://888.shof789.com/Home/Outs/article/type/1";//时时中彩票新闻

	public static String AWARD_URL = "http://m.1396mo.com/ssc/History?version=3000";//天津时时彩必赢版tjssc 重庆时时彩历史开奖:http://m.1396mo.com/ssc/History?version=3000 北京赛车pk10:http://www.301.hk/pk10/data/

	public static String TWO_SIDE_LONG_URL = "http://m.1396mp.com/ssc/TwoFaceAnalysisStat?version=3000";//北京赛车pk10两面长龙http://m.1396mp.com/api/pk10/twofaceanalysis

	public static String AWARD_REFER_URL = "http://m.1396mo.com/ssc/BetGame?version=3000";//  北京赛车pk10投注参考http://m.1396mp.com/api/pk10/betgame?Period=0&count=10&version=2.0.0.0

	public static String AWARD_NEW_URL = "http://m.1396mp.com/ssc/GetAwardData?version=3000";//重庆时时彩：http://m.1396mp.com/ssc/GetAwardData?version=3000 北京赛车最新开奖结果：http://m.1396mo.com/api/pk10/getawarddata

	public static String AWARD_STATISTICS_URL = "http://m.1396mp.com/ssc/NumberStat?version=3000";//号码统计 北京赛车统计http://www.301.hk/pk10/data/pk10_omit.xml

	public static String COLD_HOT_ANALYSIS = "http://m.1396mp.com/ssc/HotColdNumber?version=3000";// 北京赛车冷热分析http://m.1396mp.com/api/pk10/hotcoldnumber

	public static String TREND_CHART = "http://m.1396mo.com/ssc/NumberTrend";//走势图

	public static String LONGHU_LUZHU = "http://m.1396mo.com/ssc/LongHuRoadmap?version=3000";//龙虎路珠

	public static String SUM_LUZHU = "http://m.1396mo.com/ssc/SumRoadmap?version=3000";//总和 冠亚和路珠

	public static String CODE_LUZHU = "http://m.1396mo.com/ssc/NumberRoadmap?version=3000";//号码（前后）路珠

	public static String BIG_SMALL_LUZHU = "http://m.1396mo.com/ssc/BigorSmallRoadmap?version=3000";//大小路珠

	public static String ODD_EVEN_LUZHU = "http://m.1396mo.com/ssc/OddorEvenRoadmap?version=3000";//单双路珠

	public static String TULING_ROBOT = "http://www.tuling123.com/openapi/api";//图灵机器人

	public static String TULING_KEY = "5a4b5c8bbf2c8a9dd02861999fa0d45c";

	public static String URLDomain = "http://www.dlingdang.com/user.php";

	public static String session_id;

	public static String DEVICE_ID = "device_id";
	
	public static boolean isLogin;
	
	public static String GrnDomain = "http://grn.paofu.com/";
	
	public static String URL_SAVE = "url";

	public static String EXIT_TIME = "time";

	public static DisplayImageOptions options = new DisplayImageOptions.Builder()
	 .imageScaleType(com.nostra13.universalimageloader.core.assist.ImageScaleType.EXACTLY)
     .showStubImage(R.drawable.g_car_sample)    //在ImageView加载过程中显示图片
     .showImageForEmptyUri(R.drawable.empty_photo)  //image连接地址为空时
     .showImageOnFail(R.drawable.empty_photo)  //image加载失败
     .cacheInMemory(true)  //加载图片时会在内存中加载缓存
     .cacheOnDisc(true)   //加载图片时会在磁盘中加载缓存 
      .bitmapConfig(Bitmap.Config.RGB_565)  
     .build();
	
	public static ImageLoadingListener animateFirstListener = new AnimateFirstDisplayListener();
	
	/**图片加载监听事件**/
  private static class AnimateFirstDisplayListener extends SimpleImageLoadingListener {
        static final List<String> displayedImages = Collections.synchronizedList(new LinkedList<String>());
        @Override
        public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
            if (loadedImage != null) {
                ImageView imageView = (ImageView) view;
                boolean firstDisplay = !displayedImages.contains(imageUri);
                if (firstDisplay) {
                    FadeInBitmapDisplayer.animate(imageView, 500); //设置image隐藏动画500ms
                    displayedImages.add(imageUri); //将图片uri添加到集合中
                }
            }
        }
    }
}
