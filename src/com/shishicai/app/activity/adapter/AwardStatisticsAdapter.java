package com.shishicai.app.activity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.shishicai.R;
import com.shishicai.app.domain.AwardStatisticInfo;

import java.util.List;

public class AwardStatisticsAdapter extends BaseAdapter {
	private Context context;
	private List<AwardStatisticInfo.ItemsBean> list;
	public AwardStatisticsAdapter(Context context, List<AwardStatisticInfo.ItemsBean> list)
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
		TextView openTime, content, content1, content2, content3, content4, content5, content6, content7, content8, content9;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder;
		if (convertView == null) {
			holder = new Holder();
			convertView = View.inflate(context,
					R.layout.pkshi_statistics_item, null);
			holder.openTime = (TextView) convertView.findViewById(R.id.msg_time);
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
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}
		AwardStatisticInfo.ItemsBean info = list.get(position);
		String date = info.getDate();
		date = date.replace("-", "");
		holder.openTime.setText(date);
		String[] numbers = info.getData().split(",");
		if (numbers.length > 0)
		{
			holder.content.setVisibility(View.VISIBLE);
			holder.content.setText(numbers[0]);
		} else {
			holder.content.setVisibility(View.GONE);
		}
		if (numbers.length > 1)
		{
			holder.content1.setVisibility(View.VISIBLE);
			holder.content1.setText(numbers[1]);
		} else {
			holder.content1.setVisibility(View.GONE);
		}
		if (numbers.length > 2)
		{
			holder.content2.setVisibility(View.VISIBLE);
			holder.content2.setText(numbers[2]);
		} else {
			holder.content2.setVisibility(View.GONE);
		}
		if (numbers.length > 3)
		{
			holder.content3.setVisibility(View.VISIBLE);
			holder.content3.setText(numbers[3]);
		} else {
			holder.content3.setVisibility(View.GONE);
		}
		if (numbers.length > 4)
		{
			holder.content4.setVisibility(View.VISIBLE);
			holder.content4.setText(numbers[4]);
		} else {
			holder.content4.setVisibility(View.GONE);
		}
		if (numbers.length > 5)
		{
			holder.content5.setVisibility(View.VISIBLE);
			holder.content5.setText(numbers[5]);
		} else {
			holder.content5.setVisibility(View.GONE);
		}
		if (numbers.length > 6)
		{
			holder.content6.setVisibility(View.VISIBLE);
			holder.content6.setText(numbers[6]);
		} else {
			holder.content6.setVisibility(View.GONE);
		}
		if (numbers.length > 7)
		{
			holder.content7.setVisibility(View.VISIBLE);
			holder.content7.setText(numbers[7]);
		} else {
			holder.content7.setVisibility(View.GONE);
		}
		if (numbers.length > 8)
		{
			holder.content8.setVisibility(View.VISIBLE);
			holder.content8.setText(numbers[8]);
		} else {
			holder.content8.setVisibility(View.GONE);
		}
		if (numbers.length > 9)
		{
			holder.content9.setVisibility(View.VISIBLE);
			holder.content9.setText(numbers[9]);
		} else {
			holder.content9.setVisibility(View.GONE);
		}
		return convertView;
	}
}
