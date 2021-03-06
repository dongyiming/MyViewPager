package com.example.vp_normal.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.vp_normal.action.IFragmentView;
import com.example.vp_normal.state.UIState;

import java.lang.ref.WeakReference;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/6 13:59
 */
public abstract class BaseFragment extends Fragment implements IFragmentView, View.OnClickListener {
    protected WeakReference<Context> mContext;
    protected UIState state;
    protected int visible = 4;

    public BaseFragment() {
    }

    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mContext = new WeakReference(activity);
        this.state = UIState.ATTACH;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.state = UIState.CREATE;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.state = UIState.CREATE_VIEW;
        return this.setRootView(inflater);
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.state = UIState.VIEW_CREATED;
        this.initWidget();
        this.registerWidgetEvent();
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        this.state = UIState.ACTIVITY_CREATED;
        this.initComponent();
    }

    public void onResume() {
        super.onResume();
        this.visible = 0;
        this.state = UIState.RESUME;
    }

    public void onPause() {
        super.onPause();
        this.visible = 4;
        this.state = UIState.PAUSE;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.state = UIState.DESTROY_VIEW;
    }

    public void onDestroy() {
        super.onDestroy();
        this.state = UIState.DESTROY;
    }

    public void onDetach() {
        super.onDetach();
        this.state = UIState.DETACH;
    }

    /**
     * 界面初始化
     *
     * @param inflater
     * @return
     */

    public View setRootView(LayoutInflater inflater) {
        return null;
    }

    /**
     * 控件初始化
     */
    public void initWidget() {
    }

    /**
     * 注册控件的点击事件
     */
    public void registerWidgetEvent() {
    }

    /**
     * view和controller的交互初始化
     */
    public void initComponent() {
    }

    /**
     * 控件的点击
     *
     * @param v
     */
    public void widgetClick(View v) {
    }

    public int getVisible() {
        return this.visible;
    }

    public UIState getState() {
        return this.state;
    }

    public Fragment getInteractionView() {
        return this;
    }

    public void onClick(View view) {
        this.widgetClick(view);
    }
}
