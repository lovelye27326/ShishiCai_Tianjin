package com.shishicai.app.domain;

import cn.bmob.v3.BmobObject;

public class Banner extends BmobObject
{
	private String pic;
	private String title;
	private String picUrl;

	public String getPic() {
		return pic;
	}

	public void setPic(String pic) {
		this.pic = pic;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
}
