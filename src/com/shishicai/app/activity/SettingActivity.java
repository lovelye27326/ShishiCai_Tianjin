package com.shishicai.app.activity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

import com.shishicai.R;
import com.shishicai.app.Constant;
import com.shishicai.app.service.HttpMethod;
import com.shishicai.app.utils.Base2Activity;
import com.shishicai.app.utils.PreferencesUtils;

public class SettingActivity extends Base2Activity implements OnClickListener {

	private TextView title;
	private ImageView titleimgLeft; // 标题信息
	private ToggleButton mTogBtn1;
	private ToggleButton mTogBtn2;
	private ToggleButton mTogBtn3;
	private EditText timeEt;
	private EditText timesEt;
	private boolean isChecked1 = true;
	private boolean isChecked2 = true;
	private int beforeTime = 30, playTimes = 5;
	private SharedPreferences settings;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_setting);
		TAG = "SettingActivity";
		title = (TextView) findViewById(R.id.title_top);
		title.setText("应用设置");
		titleimgLeft = (ImageView) findViewById(R.id.title_left);
		titleimgLeft.setImageResource(R.drawable.top_back);
		titleimgLeft.setOnClickListener(this);
		mTogBtn1 = (ToggleButton) findViewById(R.id.mTogBtn); // 获取到控件
		mTogBtn2 = (ToggleButton) findViewById(R.id.mTogBtn1);
		mTogBtn3 = (ToggleButton) findViewById(R.id.mTogBtn2);
		timeEt = (EditText) findViewById(R.id.time_et);
		timesEt = (EditText) findViewById(R.id.times_et);
		timeEt.setInputType(InputType.TYPE_CLASS_NUMBER| InputType.TYPE_NUMBER_VARIATION_NORMAL);//只允许输入数字（正整数）
		timesEt.setInputType(InputType.TYPE_CLASS_NUMBER| InputType.TYPE_NUMBER_VARIATION_NORMAL);//只允许输入数字（正整数）
		settings = getSharedPreferences(
				"AndroidCommon", Context.MODE_PRIVATE);
		isChecked1 = settings.getBoolean(Constant.IS_PLAY_BEEP, true);
		isChecked2 = settings.getBoolean(Constant.IS_VIBRATE, true);
		mTogBtn1.setChecked(isChecked1);
		mTogBtn2.setChecked(isChecked2);
		beforeTime = settings.getInt(Constant.PLAY_BEFORE_TIME, 30);
		playTimes = settings.getInt(Constant.PLAY_TIMES, 5);
		timeEt.setText(beforeTime + "");
		timesEt.setText(playTimes + "");
		mTogBtn1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
										 boolean isChecked) {
				isChecked1 = isChecked;
				if(isChecked){
					//选中
					mTogBtn3.setChecked(true);
					PreferencesUtils.putBoolean(SettingActivity.this, Constant.IS_PLAY_BEEP, true);
				}else{
					PreferencesUtils.putBoolean(SettingActivity.this, Constant.IS_PLAY_BEEP, false);
					//未选中
					if (!isChecked2)
					{
						mTogBtn3.setChecked(false);
					}
				}
			}
		});
		mTogBtn2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
										 boolean isChecked) {
				isChecked2 = isChecked;
				if(isChecked){
					//选中
					mTogBtn3.setChecked(true);
					PreferencesUtils.putBoolean(SettingActivity.this, Constant.IS_VIBRATE, true);
				}else{
					//未选中
					PreferencesUtils.putBoolean(SettingActivity.this, Constant.IS_VIBRATE, false);
					if (!isChecked1)
					{
						mTogBtn3.setChecked(false);
					}
				}
			}
		});
		mTogBtn3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
										 boolean isChecked) {
				if(isChecked){
					//选中
                    if (!isChecked1 && !isChecked2)
                    {
                        mTogBtn1.setChecked(true);
                        mTogBtn2.setChecked(true);
                    }
					String time = timeEt.getText().toString().trim();
					if (!TextUtils.isEmpty(time))
					{
						beforeTime = Integer.valueOf(time);
					} else {
						HttpMethod.Toast(SettingActivity.this, "设置参数不能为空");
					}
					PreferencesUtils.putInt(SettingActivity.this, Constant.PLAY_BEFORE_TIME, beforeTime);
					String times = timesEt.getText().toString().trim();
					if (!TextUtils.isEmpty(times))
					{
						playTimes = Integer.valueOf(times);
					} else {
						HttpMethod.Toast(SettingActivity.this, "设置参数不能为空");
					}
					PreferencesUtils.putInt(SettingActivity.this, Constant.PLAY_TIMES, playTimes);
				}else{
					//未选中
					mTogBtn1.setChecked(false);
					mTogBtn2.setChecked(false);

				}
			}
		});
	}

	@Override
	public void onClick(View v) {
		switch (v.getId())
		{

			case R.id.title_left:
				finish();
				break;
		}
	}
}
