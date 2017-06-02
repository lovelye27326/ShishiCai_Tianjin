package com.shishicai.app.fragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

import com.google.gson.JsonSyntaxException;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.shishicai.R;
import com.shishicai.app.Constant;
import com.shishicai.app.activity.MainActivity;
import com.shishicai.app.activity.adapter.AwardStatisticsAdapter;
import com.shishicai.app.domain.AwardStatisticInfo;
import com.shishicai.app.service.HttpUser;
import com.shishicai.app.ui.PullToRefreshView;
import com.shishicai.app.utils.GsonUtils;
import com.shishicai.app.utils.LogUtil;

import org.apache.http.Header;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2017/5/8 0008.
 */

public class AwardStatisticsCategory extends Fragment implements PullToRefreshView.OnHeaderRefreshListener, PullToRefreshView.OnFooterRefreshListener {
    private MainActivity context;
    private View awardStatisticsCategory;
    private PullToRefreshView mPullToRefreshView1;
    private ListView mListView1;
    private LinearLayout msgLayout;
    private LinearLayout linear;
    private AwardStatisticsAdapter mAdapter1;
    private String TAG = "AwardStatisticsCategory";
    private List<AwardStatisticInfo.ItemsBean> list;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (awardStatisticsCategory == null) {
            awardStatisticsCategory = inflater.inflate(R.layout.category_single_list, container, false);
        }
        // 缓存的rootView需要判断是否已经被加过parent，如果有parent需要从parent删除，要不然会发生这个rootview已经有parent的错误。
        ViewGroup parent = (ViewGroup) awardStatisticsCategory.getParent();
        if (parent != null)
        {
            parent.removeView(awardStatisticsCategory);
        }
        mListView1 = (ListView) awardStatisticsCategory.findViewById(R.id.msg_listview);
        mPullToRefreshView1 = (PullToRefreshView) awardStatisticsCategory.findViewById(R.id.pullToRefreshView1);
        msgLayout = (LinearLayout) awardStatisticsCategory.findViewById(R.id.msg_layout);
        linear = (LinearLayout) awardStatisticsCategory.findViewById(R.id.msg_load);
        mPullToRefreshView1.setOnHeaderRefreshListener(this);
        mPullToRefreshView1.setOnFooterRefreshListener(this);
        msgLayout.setVisibility(View.GONE);
        linear.setVisibility(View.VISIBLE);
        list = new ArrayList<>();
        mAdapter1 = new AwardStatisticsAdapter(context, list);
        mListView1.setAdapter(mAdapter1);
        gainData();
        return awardStatisticsCategory;
    }

    @Override
    public void onAttach(Activity activity) {
        // TODO Auto-generated method stub
        super.onAttach(activity);
        context = (MainActivity) activity;
    }

    @Override
    public void onHeaderRefresh(PullToRefreshView view)
    {
        msgLayout.setVisibility(View.GONE);
        linear.setVisibility(View.VISIBLE);
        gainData();
        mPullToRefreshView1.onHeaderRefreshComplete();
    }

    @Override
    public void onFooterRefresh(PullToRefreshView view) {
        mPullToRefreshView1.onFooterRefreshComplete();
    }


    private void gainData() {
        if (list.size() > 0){
            list.clear();
        }
        String url = Constant.AWARD_STATISTICS_URL;
        LogUtil.e(TAG, "url=" + url);
        HttpUser.get(url, new AsyncHttpResponseHandler(){

            public void onFailure(int arg0, Header[] arg1,
                                  byte[] arg2, Throwable arg3) {
                LogUtil.e(TAG, "err=" + arg3.getMessage());
                msgLayout.setVisibility(View.VISIBLE);
                linear.setVisibility(View.GONE);
                Toast.makeText(context, "网络异常!", Toast.LENGTH_SHORT).show();
            }

            public void onSuccess(int arg0, Header[] arg1,
                                  byte[] arg2) {
                String str = new String(arg2);
                LogUtil.e(TAG, "result=" + str);
                AwardStatisticInfo info;
                try {
                    info = GsonUtils.parseJSON(str, AwardStatisticInfo.class);
                }catch (JsonSyntaxException e){
                    LogUtil.e(TAG, "err=" + e.getMessage());
                    e.printStackTrace();
                    return;
                }
                if (info != null){
                        if (info.getItems() != null && info.getItems().size() > 0)
                        {
                            list.addAll(info.getItems());
                            msgLayout.setVisibility(View.VISIBLE);
                            linear.setVisibility(View.GONE);
                            mAdapter1.notifyDataSetChanged();
                        } else
                        {
                            msgLayout.setVisibility(View.VISIBLE);
                            linear.setVisibility(View.GONE);
                            Toast.makeText(context, "暂无数据!", Toast.LENGTH_SHORT).show();
                        }
                }else
                    {
                        msgLayout.setVisibility(View.VISIBLE);
                        linear.setVisibility(View.GONE);
                        Toast.makeText(context, "暂无数据!", Toast.LENGTH_SHORT).show();
                }
            }

        });

    }


    public void refresh(){
        if (list != null && list.size() == 0){
            msgLayout.setVisibility(View.GONE);
            linear.setVisibility(View.VISIBLE);
            gainData();
        }
    }

}
