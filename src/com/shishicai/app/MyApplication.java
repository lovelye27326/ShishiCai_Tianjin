package com.shishicai.app;

import android.text.TextUtils;

import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.ImageLoaderConfiguration;

import cn.bmob.push.BmobPush;
import cn.bmob.v3.BmobInstallation;
import cn.jpush.android.api.JPushInterface;
import com.shishicai.BuildConfig;
import com.shishicai.app.utils.LogUtil;
import com.shishicai.app.utils.PreferencesUtils;
import cn.bmob.v3.Bmob;
import org.litepal.LitePalApplication;

public class MyApplication extends LitePalApplication {

	
	@Override
	public void onCreate() {
		super.onCreate();
		//初始化极光推送sdk
		JPushInterface.setDebugMode(BuildConfig.DEBUG);
		JPushInterface.init(this);
		Bmob.initialize(this, Constant.Bmob_APPID);
		// 使用推送服务时的初始化操作
		BmobInstallation.getCurrentInstallation().save();
		// 启动推送服务
		BmobPush.startWork(this);
		// 向服务端发送推送请求,手动进行推送
//        BmobPushManager manager = new BmobPushManager(this);
//        manager.pushMessage("test");
		//创建默认的ImageLoader配置参数
//        ImageLoaderConfiguration configuration = ImageLoaderConfiguration  
//                .createDefault(this);  
        //创建默认的ImageLoader配置参数  
        ImageLoaderConfiguration configuration = new ImageLoaderConfiguration.Builder(this)  
        .writeDebugLogs() //打印log信息  
        .build();  
        //Initialize ImageLoader with configuration.  
        ImageLoader.getInstance().init(configuration);
		String registrationId = PreferencesUtils.getString(this, Constant.DEVICE_ID);
		if (TextUtils.isEmpty(registrationId)){
			registrationId = JPushInterface.getRegistrationID(this);
			if (!TextUtils.isEmpty(registrationId)){
				LogUtil.e("MyApplication", "Registration Id : " + registrationId);
				PreferencesUtils.putString(this, Constant.DEVICE_ID, registrationId);
			}
		}
	}
	

	
}
