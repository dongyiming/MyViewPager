package com.example.vp_normal.action;

import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/6 13:57
 */
public interface IFragmentView<T> extends IView<Fragment> {
    View setRootView(LayoutInflater var1);
}

