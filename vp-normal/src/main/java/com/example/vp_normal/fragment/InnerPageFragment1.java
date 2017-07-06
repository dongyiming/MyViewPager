package com.example.vp_normal.fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.vp_normal.R;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/6 14:00
 */
public class InnerPageFragment1 extends BaseFragment {

    private Button btn_01;

    @Override
    public View setRootView(LayoutInflater inflater) {

        Log.e("dongyiming", "InnerPageFragment1  setRootView");
        View view = inflater.inflate(R.layout.fragment_inner1, null);
        btn_01 = (Button) view.findViewById(R.id.btn_01);
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
        btn_01.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_01) {
            Toast.makeText(getActivity(), "点我呀", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("dongyiming", "InnerPageFragment1  onResume");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e("dongyiming", "InnerPageFragment1  onDetach");
    }
}
