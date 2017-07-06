package com.example.vp_normal.viewpager;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * @version : 1.0
 * @Description :屏蔽最外部的viewpager左右滑动
 * @autho : dongyiming
 * @data : 2017/7/6 16:33
 */
public class ParentViewPager extends ViewPager {
    public boolean isIntercept;

    public ParentViewPager(Context context) {
        super(context);
    }

    public ParentViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setIntercept(boolean isIntercept) {
        this.isIntercept = isIntercept;
    }

    /**
     * 默认false允许事件向内部viewpager分发
     *
     * @param ev
     * @return
     */
    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        if (!isIntercept) {

            return false;
        }
        return true;
    }

    /**
     * 重写该方法，屏蔽掉外部事件的消耗，不能左右滑动，删除该方法，允许滑动
     *
     * @param ev
     * @return
     */
    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        if (!isIntercept) {

            return false;
        }
        return true;
    }
}
