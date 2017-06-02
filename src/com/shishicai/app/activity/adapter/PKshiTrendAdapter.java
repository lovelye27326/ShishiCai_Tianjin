package com.shishicai.app.activity.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.shishicai.R;
import com.shishicai.app.domain.PKshiInfo;

import java.util.List;

public class PKshiTrendAdapter extends BaseAdapter {
	private Context context;
	private List<PKshiInfo.ItemsBean> list;
	private int index;
	public PKshiTrendAdapter(Context context, List<PKshiInfo.ItemsBean> list)
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
		TextView msgTitle, time, content0, content, content1, content2, content3, content4, content5, content6, content7, content8, content9;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder;
		if (convertView == null) {
			holder = new Holder();
			convertView = View.inflate(context,
					R.layout.pkshi_trend_item, null);
			holder.msgTitle = (TextView) convertView
					.findViewById(R.id.msg_title);
			holder.content0 = (TextView) convertView.findViewById(R.id.msg_zero);
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
		holder.msgTitle.setText(info.getPeriod());
		String[] numbers = info.getResult().split(",");
		int num = Integer.valueOf(numbers[index]);
		switch (num)
		{
			case 0:
				holder.content0.setBackgroundResource(R.drawable.ball_ten);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 1:
				holder.content.setBackgroundResource(R.drawable.ball_one);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 2:
				holder.content1.setBackgroundResource(R.drawable.ball_two);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 3:
				holder.content2.setBackgroundResource(R.drawable.ball_three);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 4:
				holder.content3.setBackgroundResource(R.drawable.ball_four);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 5:
				holder.content4.setBackgroundResource(R.drawable.ball_five);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 6:
				holder.content5.setBackgroundResource(R.drawable.ball_six);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 7:
				holder.content6.setBackgroundResource(R.drawable.ball_seven);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 8:
				holder.content7.setBackgroundResource(R.drawable.ball_eight);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 9:
				holder.content8.setBackgroundResource(R.drawable.ball_nine);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				holder.content9.setBackgroundResource(R.drawable.shape);
				break;
			case 10:
				holder.content9.setBackgroundResource(R.drawable.ball_ten);
				holder.content0.setBackgroundResource(R.drawable.shape);
				holder.content1.setBackgroundResource(R.drawable.shape);
				holder.content2.setBackgroundResource(R.drawable.shape);
				holder.content3.setBackgroundResource(R.drawable.shape);
				holder.content4.setBackgroundResource(R.drawable.shape);
				holder.content5.setBackgroundResource(R.drawable.shape);
				holder.content6.setBackgroundResource(R.drawable.shape);
				holder.content7.setBackgroundResource(R.drawable.shape);
				holder.content8.setBackgroundResource(R.drawable.shape);
				holder.content.setBackgroundResource(R.drawable.shape);
				break;
		}
		String timeStr = info.getTime();
		holder.time.setText(timeStr);
		return convertView;
	}

	public void setIndex(int index) {
		this.index = index;
	}
}
