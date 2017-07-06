package com.example.vp_normal.state;

/**
 *  @Description :
 *  @autho : dongyiming
 *  @version : 1.0
 *  @data : 2017/7/6 13:58
 */
public enum UIState {
    ATTACH,
    CREATE,
    CREATE_VIEW,
    VIEW_CREATED,
    ACTIVITY_CREATED,
    RESTART,
    START,
    RESUME,
    PAUSE,
    STOP,
    DESTROY_VIEW,
    DESTROY,
    DETACH;

    private UIState() {
    }
}
