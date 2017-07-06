package com.example.vp_normal.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.vp_normal.factory.FragmentFactory;


/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/6 13:55
 */
public class HomePageAdapter extends FragmentPagerAdapter {

    private int count;

    public void setPagerCount(int count) {

        this.count = count;
    }

    public HomePageAdapter(FragmentManager fm) {
        super(fm);
    }

    public Fragment getItem(int position) {

        return FragmentFactory.buildFragment(position);
    }

    public int getCount() {
        return this.count;
    }
}
