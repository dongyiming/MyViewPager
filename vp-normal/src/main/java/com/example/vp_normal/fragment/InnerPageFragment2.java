package com.example.vp_normal.fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.example.vp_normal.R;
import com.example.vp_normal.view.RecommendHintView;
import com.example.vp_normal.viewpager.MyRollViewPager;
import com.jude.rollviewpager.RollPagerView;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/6 14:00
 */
public class InnerPageFragment2 extends BaseFragment {

    private RollPagerView rollpagerRecommend;

    @Override
    public View setRootView(LayoutInflater inflater) {

        Log.e("dongyiming", "InnerPageFragment2  setRootView");
        View view = inflater.inflate(R.layout.fragment_inner2, null);
        rollpagerRecommend = (RollPagerView) view.findViewById(R.id.rollpager_recommend);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {

        }
    }

    @Override
    public void initWidget() {
        //配置轮播图
        rollpagerRecommend.setAdapter(new MyRollViewPager(getActivity(), rollpagerRecommend));
        rollpagerRecommend.setHintView(new RecommendHintView(getActivity()
                , getActivity().getResources().getColor(R.color.color_rollpager_hint_bg)
                , getActivity().getResources().getColor(R.color.color_bg_top_white)
                , 4, 5));
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("dongyiming", "InnerPageFragment2  onResume");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("dongyiming", "InnerPageFragment2  onDetach");
    }
}
