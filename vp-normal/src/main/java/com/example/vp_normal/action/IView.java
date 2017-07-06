package com.example.vp_normal.action;

import android.view.View;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/6 13:57
 */
public interface IView<T> {
    T getInteractionView();

    void initWidget();

    void registerWidgetEvent();

    void widgetClick(View var1);

    void initComponent();
}