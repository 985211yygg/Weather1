package com.example.yungui.weather.ui.wxmm.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import com.example.yungui.weather.ui.welfare.adapter.ViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yungui on 2017/7/30.
 */

public class WxmmPagerAdapter extends ViewPagerAdapter{
    private List<Fragment> fragments = new ArrayList<>();
    private List<String> titles = new ArrayList<>();

    public WxmmPagerAdapter(FragmentManager fragmentManager) {
        super(fragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return titles.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles.get(position);
    }

    @Override
    public void addFragment(Fragment fragment, String title) {
        super.addFragment(fragment, title);
        fragments.add(fragment);
        titles.add(title);
    }

}
