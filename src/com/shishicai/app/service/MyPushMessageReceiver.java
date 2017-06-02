package com.shishicai.app.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.google.gson.JsonSyntaxException;
import com.shishicai.R;
import com.shishicai.app.activity.MainActivity;
import com.shishicai.app.domain.PushInfo;
import com.shishicai.app.utils.GsonUtils;
import com.shishicai.app.utils.LogUtil;

import cn.bmob.push.PushConstants;

/**
 * Created by Administrator on 2017/5/30 0030.
 */

public class MyPushMessageReceiver  extends BroadcastReceiver {
    private static final String TAG = "MyPushMessageReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {

        String message = intent.getStringExtra(PushConstants.EXTRA_PUSH_MESSAGE_STRING);
        LogUtil.e(TAG, "message=" + message);

        /*推送的数据格式，json格式，alert为标题，articleurl为传递为要显示的网页内容
        {
            "alert": "xxxx",
            "articleurl": "http://xxx"
        }*/

        PushInfo pushInfo = null;
        try {
            pushInfo = GsonUtils.parseJSON(message, PushInfo.class);
        }catch (JsonSyntaxException e){
            LogUtil.e(TAG, "err=" + e.getMessage());
            e.printStackTrace();
        }
        String content, alert;
        String articleUrl;
        if (pushInfo != null)
        {
            alert = pushInfo.getAlert();
            articleUrl = pushInfo.getArticleurl();
            content = alert + " " + articleUrl;
        }else {
            content = message;
        }

        NotificationManager manager = (NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);

//        Notification notify = new Notification.Builder(context)
//                .setSmallIcon(R.drawable.ic_launcher)
//                .setContentTitle("收到一条推送")
//                .setContentText(content)
//                .build();
//        manager.notify(1, notify);//不跳转

        Notification.Builder builder1 = new Notification.Builder(context);
        builder1.setSmallIcon(R.drawable.ic_launcher); //设置图标
        builder1.setTicker("显示通知");
        builder1.setContentTitle("收到一条推送"); //设置标题
        builder1.setContentText(content); //消息内容
        builder1.setWhen(System.currentTimeMillis()); //发送时间
        builder1.setDefaults(Notification.DEFAULT_ALL); //设置默认的提示音，振动方式，灯光
        builder1.setAutoCancel(true);//打开程序后图标消失
        Intent intent1 =new Intent (context, MainActivity.class);
        PendingIntent pendingIntent =PendingIntent.getActivity(context, 0, intent1, 0);
        builder1.setContentIntent(pendingIntent);
        Notification notification1 = builder1.build();
        manager.notify(124, notification1); // 通过通知管理器发送通知
    }
}
