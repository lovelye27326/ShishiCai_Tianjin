package com.shishicai.app.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.shishicai.R;
import com.shishicai.app.utils.Base2Activity;

public class AboutAsActivity extends Base2Activity implements OnClickListener {

	private TextView title;
	private ImageView titleimgLeft; // 标题信息

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about_us);
		TAG = "AboutAsActivity";
		title = (TextView) findViewById(R.id.title_top);
		title.setText("关于");
		titleimgLeft = (ImageView) findViewById(R.id.title_left);
		titleimgLeft.setImageResource(R.drawable.top_back);
		titleimgLeft.setOnClickListener(this);
		findViewById(R.id.introduction_ll).setOnClickListener(this);
		findViewById(R.id.help_center_ll).setOnClickListener(this);
		findViewById(R.id.declare_ll).setOnClickListener(this);
		findViewById(R.id.about_us_ll).setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		Intent intent = null;
		String title = "", content = "";
		switch (v.getId())
		{
			case R.id.introduction_ll:
				intent = new Intent(this, AboutActivity.class);
				title = "应用简介";
				content = getResources().getString(R.string.app_name) + "是一款集历史开奖、统计信息、推荐数据于一体的时时彩信息应用。\n" + getResources().getString(R.string.app_name) + "通过大量的数据，以及运用自主研发的分析" +
						getResources().getString(R.string.name) +  "的方法，\n率先实现了时时彩各玩法的推荐。\n" + getResources().getString(R.string.app_name) + "是具有资源占有低、操作简捷、资料齐全等特点，是目前国内受欢迎的全能时时彩信息应用。\n临沧信安富创投科技有限公司是专业研发各种棋牌游戏及彩票统计相关的科技公司，如果阁下对彩票有独特的预测经验或计算方法，我们很乐意与您洽谈，并按您的想法开发出自动\n" +
						"统计及模拟程序供您使用，同时本公司的专业团队也提供各方面的建议及更多的经验分享。";
				break;

			case R.id.help_center_ll:
				intent = new Intent(this, AboutActivity.class);
				title = "帮助中心";
				content = "1、这是什么软件？\n" + getResources().getString(R.string.app_name) + "应用是一款集数据功能于一体的应用软件，通过软件可以查看即时的开奖结果。\n2、这软件怎样用？\n" + getResources().getString(R.string.app_name) + "提供多种\n" +
						"数据统计，每类型数据统计都有各自的参考价值，能更好的辅助选号。\n3，什么是历史开奖?\n历史开奖是统计所选择日期里面的开奖结果，包括总和，总和大小。\n4，什么是路珠?\n“路" +
						"珠”也称“缆”，是用来记录之前开奖结果的输赢记录，\n彩票开奖号码是随机生成的，所开号码概率长时间内会达到一个持平的状态，在这个过程可以通过路珠记录来辅助。\n5，什么是大小" +
						"路珠?\n大小路珠是以路珠形式显示不同位置所开出的大小记录。\n6，什么是单双路珠？\n单双路珠是以路珠形式显示不同位置所开出的单双记录。";
				break;

			case R.id.declare_ll:
				intent = new Intent(this, AboutActivity.class);
				title = "免责声明";
				content = "\t" + getResources().getString(R.string.app_name) + "是临沧信安富创投科技有限公司研发的一款统计资讯推荐数据的应用，此应用仅供中国大陆购买官方彩票进行相关的参考，对于使用本应用出现的\n" +
						"任何问题，临沧信安富创投科技有限公司不承担责任。\n用户必须留意本身所处之地区及相关法律，不得利用本软件进行任何非法活动，任何情况下导致触犯所属地区之法律，用户须自行承\n" +
						"担责任，一切后果临沧信安富创投科技有限公司概不负责。";
				break;

			case R.id.about_us_ll:
				intent = new Intent(this, AboutActivity.class);
				title = "关于我们";
				content = "临沧信安富创投科技有限公司的愿景：最受欢迎的娱乐互联网企业。\n临沧信安富创投科技有限公司的使命：通过互联网服务提升娱乐生活新品质\n深圳博宇科技有" +
						"限公司肩负着重要的使命，美好的愿景，不断的努力，提供科技化的人性服务，开拓市场新领土。\n公司一直持续的进行市场资讯的收集和研究，持续拓展业务和开拓全新的服务领域，加强发" +
						"展技术，至力于新产品的开发、合作。\n我们每一项产品和软件设计思念，都要求最简单最实用最方便，所以大大的满足用户和家户的娱乐要求，我们不断的为目标市场创造机会和话题，将新" +
						"产品推向我们的合作伙伴、用户，创造双赢、多赢的局面。";
				break;

			case R.id.title_left:
				finish();
				break;
		}
		if (intent != null)
		{
			intent.putExtra("title", title);
			intent.putExtra("content", content);
			startActivity(intent);
		}
	}



}
