package com.swipetab.thanhtran.swipetablayout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import com.astuetz.PagerSlidingTabStrip.IconTabProvider;


/**
 * Created by admin on 8/6/15.
 */
public class FragmentAdapter extends FragmentPagerAdapter implements IconTabProvider {
    final int PAGE_COUNT = 3;
    private int[] imageResId = {R.drawable.love, R.drawable.chart, R.drawable.settings};
    public FragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        switch (i){
            case 0: return new LoveMsgFragment();
            case 1: return new LoveChartFragment();
            case 2: return new SettingsFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return PAGE_COUNT;
    }
    @Override
    public int getPageIconResId(int position) {
        return imageResId[position];
    }
}
