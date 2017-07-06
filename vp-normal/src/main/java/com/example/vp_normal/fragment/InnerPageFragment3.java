package com.example.vp_normal.fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;

import com.example.vp_normal.R;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/6 14:00
 */
public class InnerPageFragment3 extends BaseFragment {

    @Override
    public View setRootView(LayoutInflater inflater) {

        Log.e("dongyiming", "InnerPageFragment3  setRootView");
        View view = inflater.inflate(R.layout.fragment_inner3, null);
        return view;
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {

        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("dongyiming", "InnerPageFragment3  onResume");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("dongyiming", "InnerPageFragment3  onDetach");
    }
}
