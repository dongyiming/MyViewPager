package com.example.vp_normal.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.vp_normal.R;
import com.example.vp_normal.adapter.HomePageAdapter;
import com.example.vp_normal.viewpager.ParentViewPager;

/**
 * @version : 1.0
 * @Description :
 * @autho : dongyiming
 * @data : 2017/7/6 13:38
 */
public class NormalActivity extends AppCompatActivity {

    RadioButton rdobtnUnname1;
    RadioButton rdobtnUnname2;
    RadioButton rdobtnUnname3;
    RadioButton rdobtnUnname4;
    RadioGroup rdogroupHomepage;
    ParentViewPager viewpagerHomepage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        initView();
        initWidget();
        initCompant();
    }

    private void initView() {

        viewpagerHomepage = (ParentViewPager) findViewById(R.id.viewpager_homepage);
        rdobtnUnname1 = (RadioButton) findViewById(R.id.rdobtn_unname1);
        rdobtnUnname2 = (RadioButton) findViewById(R.id.rdobtn_unname2);
        rdobtnUnname3 = (RadioButton) findViewById(R.id.rdobtn_unname3);
        rdobtnUnname4 = (RadioButton) findViewById(R.id.rdobtn_unname4);
        rdogroupHomepage = (RadioGroup) findViewById(R.id.rdogroup_homepage);
    }

    private void initWidget() {

        rdogroupHomepage.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                if (checkedId == R.id.rdobtn_unname1) {

                    viewpagerHomepage.setCurrentItem(0, false);
                } else if (checkedId == R.id.rdobtn_unname2) {
                    viewpagerHomepage.setCurrentItem(1, false);
                } else if (checkedId == R.id.rdobtn_unname3) {
                    viewpagerHomepage.setCurrentItem(2, false);
                } else if (checkedId == R.id.rdobtn_unname4) {
                    viewpagerHomepage.setCurrentItem(3, false);
                }
                switchColor(checkedId);

            }
        });

        rdogroupHomepage.check(R.id.rdobtn_unname1);

        viewpagerHomepage.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {

                switch (position) {
                    case 0:
                        rdogroupHomepage.check(R.id.rdobtn_unname1);
                        break;
                    case 1:
                        rdogroupHomepage.check(R.id.rdobtn_unname2);
                        break;
                    case 2:
                        rdogroupHomepage.check(R.id.rdobtn_unname3);
                        break;
                    case 3:
                        rdogroupHomepage.check(R.id.rdobtn_unname4);
                        break;
                }
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initCompant() {

        HomePageAdapter adapter = new HomePageAdapter(getSupportFragmentManager());
        adapter.setPagerCount(4);
        viewpagerHomepage.setAdapter(adapter);
    }

    public void switchColor(int id) {
        if (id == R.id.rdobtn_unname1) {
            rdobtnUnname1.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_pressed));
            rdobtnUnname2.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname3.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname4.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
        } else if (id == R.id.rdobtn_unname2) {
            rdobtnUnname1.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname2.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_pressed));
            rdobtnUnname3.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname4.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
        } else if (id == R.id.rdobtn_unname3) {
            rdobtnUnname1.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname2.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname3.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_pressed));
            rdobtnUnname4.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
        } else if (id == R.id.rdobtn_unname4) {
            rdobtnUnname1.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname2.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname3.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_normal));
            rdobtnUnname4.setTextColor(NormalActivity.this.getResources().getColor(R.color.color_btn_homepage_pressed));
        }
    }
}
