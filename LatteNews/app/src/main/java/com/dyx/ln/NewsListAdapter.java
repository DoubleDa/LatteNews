package com.dyx.ln;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Author：dayongxin
 * Function：
 */
public class NewsListAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;
    private List<String> menus;

    public NewsListAdapter(FragmentManager fm, List<Fragment> fragments, List<String> menus) {
        super(fm);
        this.fragments = fragments;
        this.menus = menus;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return menus.get(position);
    }
}
