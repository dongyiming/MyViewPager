package com.example.vp_normal.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.example.vp_normal.R;
import com.example.vp_normal.adapter.InnerPagerAdapter;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/6 14:00
 */
public class HomePageFragment1 extends BaseFragment {

    ViewPager viewpagerCatfound;

    private TabLayout tablayout;

    @Override
    public View setRootView(LayoutInflater inflater) {

        Log.e("dongyiming", "HomePageFragment1  setRootView");
        View view = inflater.inflate(R.layout.fragment_home1, null);
        viewpagerCatfound = (ViewPager) view.findViewById(R.id.viewpager_catfound);
        tablayout = (TabLayout) view.findViewById(R.id.tablayout_top);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {

        }
    }

    @Override
    public void initComponent() {
        //解决子view滑动出现空白并且跟parentviewpager滑动的问题--getChildFragmentManager
        viewpagerCatfound.setAdapter(new InnerPagerAdapter(getChildFragmentManager(), getActivity()));
        tablayout.setupWithViewPager(viewpagerCatfound);
        tablayout.getTabAt(0).select();
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("dongyiming", "HomePageFragment1  onResume");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("dongyiming", "HomePageFragment1  onDetach");
    }
}
