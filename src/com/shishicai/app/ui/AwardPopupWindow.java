package com.shishicai.app.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.shishicai.R;

public class AwardPopupWindow extends PopupWindow {
	private LinearLayout font1;
	private LinearLayout font2;
	private LinearLayout font3;
	private LinearLayout font4;
	private LinearLayout font5;
	private LinearLayout font6;
	private LinearLayout font7;
	private LinearLayout font8;
	private LinearLayout font9;
	private LinearLayout font10;

	public AwardPopupWindow(Activity context, OnClickListener itemsOnClick, int length) {
		super(context);
		LayoutInflater inflater = (LayoutInflater) context
				.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		final View mMenuView = inflater.inflate(R.layout.award_trend_item, null);
		font1 = (LinearLayout) mMenuView.findViewById(R.id.font1);
		font2 = (LinearLayout) mMenuView.findViewById(R.id.font2);
		font3 = (LinearLayout) mMenuView.findViewById(R.id.font3);
		font4 = (LinearLayout) mMenuView.findViewById(R.id.font4);
		font5 = (LinearLayout) mMenuView.findViewById(R.id.font5);
		font6 = (LinearLayout) mMenuView.findViewById(R.id.font6);
		font7 = (LinearLayout) mMenuView.findViewById(R.id.font7);
		font8 = (LinearLayout) mMenuView.findViewById(R.id.font8);
		font9 = (LinearLayout) mMenuView.findViewById(R.id.font9);
		font10 = (LinearLayout) mMenuView.findViewById(R.id.font10);
		font1.setOnClickListener(itemsOnClick);
		font2.setOnClickListener(itemsOnClick);
		font3.setOnClickListener(itemsOnClick);
		font4.setOnClickListener(itemsOnClick);
		font5.setOnClickListener(itemsOnClick);
		font6.setOnClickListener(itemsOnClick);
		font7.setOnClickListener(itemsOnClick);
		font8.setOnClickListener(itemsOnClick);
		font9.setOnClickListener(itemsOnClick);
		font10.setOnClickListener(itemsOnClick);
		setBackgroundDrawable(new ColorDrawable(0x00000000));// 设置背景透明，点击back退出pop
		//设置SelectPicPopupWindow的View
		this.setContentView(mMenuView);
		//设置SelectPicPopupWindow弹出窗体的宽
		this.setWidth(LayoutParams.FILL_PARENT);
		//设置SelectPicPopupWindow弹出窗体的高
		this.setHeight(LayoutParams.WRAP_CONTENT);
		//设置SelectPicPopupWindow弹出窗体可点击
		this.setFocusable(true);
		//设置SelectPicPopupWindow弹出窗体动画效果
		this.setAnimationStyle(R.style.AnimBottom);
		//mMenuView添加OnTouchListener监听判断获取触屏位置如果在选择框外面则销毁弹出框
		mMenuView.setOnTouchListener(new OnTouchListener() {
			
			public boolean onTouch(View v, MotionEvent event) {
				
				int height = mMenuView.findViewById(R.id.popup).getTop();
				int right = mMenuView.findViewById(R.id.popup).getRight();
				int y = (int) event.getY();
				int x = (int) event.getX();
				if(event.getAction() == MotionEvent.ACTION_UP){
					if(y > height || x < right){
						dismiss();
					}
				}				
				return true;
			}
		});

		if (length == 1)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.GONE);
			font3.setVisibility(View.GONE);
			font4.setVisibility(View.GONE);
			font5.setVisibility(View.GONE);
			font6.setVisibility(View.GONE);
			font7.setVisibility(View.GONE);
			font8.setVisibility(View.GONE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 2)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.GONE);
			font4.setVisibility(View.GONE);
			font5.setVisibility(View.GONE);
			font6.setVisibility(View.GONE);
			font7.setVisibility(View.GONE);
			font8.setVisibility(View.GONE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 3)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.GONE);
			font5.setVisibility(View.GONE);
			font6.setVisibility(View.GONE);
			font7.setVisibility(View.GONE);
			font8.setVisibility(View.GONE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 4)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.VISIBLE);
			font5.setVisibility(View.GONE);
			font6.setVisibility(View.GONE);
			font7.setVisibility(View.GONE);
			font8.setVisibility(View.GONE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 5)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.VISIBLE);
			font5.setVisibility(View.VISIBLE);
			font6.setVisibility(View.GONE);
			font7.setVisibility(View.GONE);
			font8.setVisibility(View.GONE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 6)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.VISIBLE);
			font5.setVisibility(View.VISIBLE);
			font6.setVisibility(View.VISIBLE);
			font7.setVisibility(View.GONE);
			font8.setVisibility(View.GONE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 7)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.VISIBLE);
			font5.setVisibility(View.VISIBLE);
			font6.setVisibility(View.VISIBLE);
			font7.setVisibility(View.VISIBLE);
			font8.setVisibility(View.GONE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 8)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.VISIBLE);
			font5.setVisibility(View.VISIBLE);
			font6.setVisibility(View.VISIBLE);
			font7.setVisibility(View.VISIBLE);
			font8.setVisibility(View.VISIBLE);
			font9.setVisibility(View.GONE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 9)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.VISIBLE);
			font5.setVisibility(View.VISIBLE);
			font6.setVisibility(View.VISIBLE);
			font7.setVisibility(View.VISIBLE);
			font8.setVisibility(View.VISIBLE);
			font9.setVisibility(View.VISIBLE);
			font10.setVisibility(View.GONE);
		} else
		if (length == 10)
		{
			font1.setVisibility(View.VISIBLE);
			font2.setVisibility(View.VISIBLE);
			font3.setVisibility(View.VISIBLE);
			font4.setVisibility(View.VISIBLE);
			font5.setVisibility(View.VISIBLE);
			font6.setVisibility(View.VISIBLE);
			font7.setVisibility(View.VISIBLE);
			font8.setVisibility(View.VISIBLE);
			font9.setVisibility(View.VISIBLE);
			font10.setVisibility(View.VISIBLE);
		}

	}

}
