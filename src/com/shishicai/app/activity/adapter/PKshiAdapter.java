package com.shishicai.app.activity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.shishicai.R;
import com.shishicai.app.domain.DataBean;
import com.shishicai.app.domain.PKshiInfo;

import java.util.List;

public class PKshiAdapter extends BaseAdapter {
	private Context context;
	private List<PKshiInfo.ItemsBean> list;
	public PKshiAdapter(Context context, List<PKshiInfo.ItemsBean> list)
	{
		this.context = context;
		this.list = list;
	}
	
	@Override
	public int getCount() {
		return list.size();
	}

	@Override
	public Object getItem(int position) {
		return position;
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	private class Holder {
		TextView msgTitle, time, content, content1, content2, content3, content4, content5, content6, content7, content8, content9;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder;
		if (convertView == null) {
			holder = new Holder();
			convertView = View.inflate(context,
					R.layout.pkshi_item, null);
			holder.msgTitle = (TextView) convertView
					.findViewById(R.id.msg_title);
			holder.content = (TextView) convertView.findViewById(R.id.msg_one);
			holder.content1 = (TextView) convertView.findViewById(R.id.msg_two);
			holder.content2 = (TextView) convertView.findViewById(R.id.msg_three);
			holder.content3 = (TextView) convertView.findViewById(R.id.msg_four);
			holder.content4 = (TextView) convertView.findViewById(R.id.msg_five);
			holder.content5 = (TextView) convertView.findViewById(R.id.msg_six);
			holder.content6 = (TextView) convertView.findViewById(R.id.msg_seven);
			holder.content7 = (TextView) convertView.findViewById(R.id.msg_eight);
			holder.content8 = (TextView) convertView.findViewById(R.id.msg_nine);
			holder.content9 = (TextView) convertView.findViewById(R.id.msg_ten);
			holder.time = (TextView) convertView
					.findViewById(R.id.msg_time);
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}
		PKshiInfo.ItemsBean info = list.get(position);
		holder.msgTitle.setText("  " + info.getPeriod() + "  ");
		String[] numbers = info.getResult().split(",");
		if (numbers.length > 0)
		{
			holder.content.setVisibility(View.VISIBLE);
			holder.content.setText(numbers[0]);
			holder.content.setBackgroundResource(getBackGround(numbers[0]));
		} else {
			holder.content.setVisibility(View.GONE);
		}
		if (numbers.length > 1)
		{
			holder.content1.setVisibility(View.VISIBLE);
			holder.content1.setText(numbers[1]);
			holder.content1.setBackgroundResource(getBackGround(numbers[1]));
		} else {
			holder.content1.setVisibility(View.GONE);
		}
		if (numbers.length > 2)
		{
			holder.content2.setVisibility(View.VISIBLE);
			holder.content2.setText(numbers[2]);
			holder.content2.setBackgroundResource(getBackGround(numbers[2]));
		} else {
			holder.content2.setVisibility(View.GONE);
		}
		if (numbers.length > 3)
		{
			holder.content3.setVisibility(View.VISIBLE);
			holder.content3.setText(numbers[3]);
			holder.content3.setBackgroundResource(getBackGround(numbers[3]));
		} else {
			holder.content3.setVisibility(View.GONE);
		}
		if (numbers.length > 4)
		{
			holder.content4.setVisibility(View.VISIBLE);
			holder.content4.setText(numbers[4]);
			holder.content4.setBackgroundResource(getBackGround(numbers[4]));
		} else {
			holder.content4.setVisibility(View.GONE);
		}
		if (numbers.length > 5)
		{
			holder.content5.setVisibility(View.VISIBLE);
			holder.content5.setText(numbers[5]);
			holder.content5.setBackgroundResource(getBackGround(numbers[5]));
		} else {
			holder.content5.setVisibility(View.GONE);
		}
		if (numbers.length > 6)
		{
			holder.content6.setVisibility(View.VISIBLE);
			holder.content6.setText(numbers[6]);
			holder.content6.setBackgroundResource(getBackGround(numbers[6]));
		} else {
			holder.content6.setVisibility(View.GONE);
		}
		if (numbers.length > 7)
		{
			holder.content7.setVisibility(View.VISIBLE);
			holder.content7.setText(numbers[7]);
			holder.content7.setBackgroundResource(getBackGround(numbers[7]));
		} else {
			holder.content7.setVisibility(View.GONE);
		}
		if (numbers.length > 8)
		{
			holder.content8.setVisibility(View.VISIBLE);
			holder.content8.setText(numbers[8]);
			holder.content8.setBackgroundResource(getBackGround(numbers[8]));
		} else {
			holder.content8.setVisibility(View.GONE);
		}
		if (numbers.length > 9)
		{
			holder.content9.setVisibility(View.VISIBLE);
			holder.content9.setText(numbers[9]);
			holder.content9.setBackgroundResource(getBackGround(numbers[9]));
		} else {
			holder.content9.setVisibility(View.GONE);
		}
		String timeStr = info.getTime();
		holder.time.setText("  " + timeStr + "  ");
		return convertView;
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
	
}
