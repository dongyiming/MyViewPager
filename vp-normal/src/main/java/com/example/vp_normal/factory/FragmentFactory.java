package com.example.vp_normal.factory;

import com.example.vp_normal.fragment.BaseFragment;
import com.example.vp_normal.fragment.HomePageFragment1;
import com.example.vp_normal.fragment.HomePageFragment2;
import com.example.vp_normal.fragment.HomePageFragment3;
import com.example.vp_normal.fragment.HomePageFragment4;

import java.util.HashMap;
import java.util.Map;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/6 13:56
 */
public class FragmentFactory {

    public static final int PAGE_ONE = 0;
    public static final int PAGE_TWO = 1;
    public static final int PAGE_THREE = 2;
    public static final int PAGE_FOUR = 3;

    public static Map<Integer, BaseFragment> fragments = new HashMap<>();


    /**
     * 生成相应的Fragment
     *
     * @param page
     * @return
     */
    public static BaseFragment buildFragment(int page) {

        BaseFragment mFragmentFactory = fragments.get(page);
        if (mFragmentFactory == null) {
            switch (page) {

                case PAGE_ONE:
                    mFragmentFactory = new HomePageFragment1();
                    break;
                case PAGE_TWO:
                    mFragmentFactory = new HomePageFragment2();
                    break;
                case PAGE_THREE:
                    mFragmentFactory = new HomePageFragment3();
                    break;
                case PAGE_FOUR:
                    mFragmentFactory = new HomePageFragment4();
                    break;

            }
            fragments.put(page, mFragmentFactory);
        }
        return mFragmentFactory;
    }
}
