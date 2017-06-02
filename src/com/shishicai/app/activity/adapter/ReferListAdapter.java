package com.shishicai.app.activity.adapter;

import android.content.Context;
import android.text.Html;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.shishicai.R;
import com.shishicai.app.domain.AwardReferInfo;
import com.shishicai.app.domain.CategoryInfo;
import com.shishicai.app.utils.LogUtil;

import java.util.List;

public class ReferListAdapter extends BaseAdapter {
	private Context context;
	private List<AwardReferInfo.ItemsBean.DataBeanX> list;
	public ReferListAdapter(Context context, List<AwardReferInfo.ItemsBean.DataBeanX> list)
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
		TextView nameTv, codeTv, singleDoubleTv, bigSmallTv;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		Holder holder;
		if (convertView == null) {
			holder = new Holder();
			convertView = View.inflate(context,
					R.layout.refer_item, null);
			holder.nameTv = (TextView) convertView.findViewById(R.id.name_tv);
			holder.codeTv = (TextView) convertView.findViewById(R.id.code_tv);
			holder.singleDoubleTv = (TextView) convertView.findViewById(R.id.single_double_tv);
			holder.bigSmallTv = (TextView) convertView.findViewById(R.id.big_small_tv);
			convertView.setTag(holder);
		} else {
			holder = (Holder) convertView.getTag();
		}
		AwardReferInfo.ItemsBean.DataBeanX info = list.get(position);
		String name = info.getName();
		holder.nameTv.setText(name);
		if (info.getData() != null && info.getData().size() > 0)
		{
			int state;
			String result;
			List<AwardReferInfo.ItemsBean.DataBeanX.DataBean> data = info.getData();
			if (data.size() > 0 && !TextUtils.isEmpty(data.get(0).getResult()))
			{
				state = data.get(0).getState();
				result = data.get(0).getResult();
				if (state == 1)
				{
					holder.codeTv.setText(Html.fromHtml(result + "<font color=\"red\"> " + "（赢）" + " </font>"));
				} else {
					holder.codeTv.setText(result);
				}
			}
			if (data.size() > 1 && !TextUtils.isEmpty(data.get(1).getResult()))
			{
				state = data.get(1).getState();
				result = data.get(1).getResult();
				if (state == 1)
				{
					holder.singleDoubleTv.setText(Html.fromHtml(result + "<font color=\"red\"> " + "（赢）" + " </font>"));
				} else {
					holder.singleDoubleTv.setText(result);
				}
			}

			if (data.size() > 2 && !TextUtils.isEmpty(data.get(2).getResult()))
			{
				state = data.get(2).getState();
				result = data.get(2).getResult();
				if (state == 1)
				{
					holder.bigSmallTv.setText(Html.fromHtml(result + "<font color=\"red\"> " + "（赢）" + " </font>"));
				} else {
					holder.bigSmallTv.setText(result);
				}
			}
			if (position == list.size() - 1)
			{
				holder.singleDoubleTv.setVisibility(View.GONE);
				holder.bigSmallTv.setVisibility(View.GONE);
			}
		}

		return convertView;
	}
	
}
