package com.example.vp_normal.viewpager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.vp_normal.R;
import com.jude.rollviewpager.RollPagerView;
import com.jude.rollviewpager.adapter.LoopPagerAdapter;

/**
 * @version : 1.0
 * @Description : 推荐界面轮播图
 * @autho : dongyiming
 * @data : 2017/6/2 1:26
 */
public class MyRollViewPager extends LoopPagerAdapter {

    private Context mContext;
    private int[] imgs = new int[]{

            R.drawable.img_recommend_rollpager,
            R.drawable.img_rollpager_2,
            R.drawable.img_recommend_rollpager,
            R.drawable.img_rollpager_2,
            R.drawable.img_recommend_rollpager,
            R.drawable.img_rollpager_2,
            R.drawable.img_recommend_rollpager,
            R.drawable.img_rollpager_2
    };
    //private List<Drawable> imageList;

    public MyRollViewPager(Context mContext, RollPagerView viewPager) {
        super(viewPager);
        this.mContext = mContext;
        this.imgs = imgs;
        /*if (imageList == null) {
            imageList = new ArrayList<>();
            for (int i = 0; i < 7; i++) {
                imageList.add(mContext.getResources().getDrawable(R.drawable.img_recommend_rollpager));
            }
        }*/
    }

    @Override
    public View getView(ViewGroup container, int position) {
        ImageView view = new ImageView(mContext);
        //view.setImageDrawable(imageList.get(position));
        view.setImageResource(imgs[position]);
        view.setScaleType(ImageView.ScaleType.CENTER_CROP);
        view.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.MATCH_PARENT));
        return view;
    }

    @Override
    public int getRealCount() {
        return imgs.length;
    }
}
