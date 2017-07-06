package com.example.vp_normal.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.vp_normal.R;
import com.example.vp_normal.factory.InnerFragmentFactory;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/5/24 19:44
 */
public class InnerPagerAdapter extends FragmentStatePagerAdapter {

    private int count;
    private String[] titles;
    private Context mContext;

    public InnerPagerAdapter(FragmentManager fm, Context mContext) {

        super(fm);
        this.mContext = mContext;
        this.titles = new String[]{mContext.getResources().getString(R.string.fragment_tab_recommend)
                , mContext.getResources().getString(R.string.fragment_tab_chat)
                , mContext.getResources().getString(R.string.fragment_tab_owner)
                , mContext.getResources().getString(R.string.fragment_tab_hottop)};
        ;
        count = 4;
    }

    public void setPagerCount(int count) {

        this.count = count;
    }

    public Fragment getItem(int position) {

        return InnerFragmentFactory.buildFragment(position);
    }

    public int getCount() {
        return this.count;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
