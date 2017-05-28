package com.example.mina.tabhostwithviewpager;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class ViewPagerAdapter extends FragmentPagerAdapter {

    MainActivity.TabData[] tabs;
    List<Fragment> fragmentList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm, MainActivity.TabData[] tabs) {
        super(fm);
        this.tabs = tabs;
        for(MainActivity.TabData tab : tabs){
            Bundle bundle = new Bundle();
            bundle.putSerializable("URL", tab.getUrl());
            MyFragment fragment = new MyFragment();
            fragment.setArguments(bundle);
            fragmentList.add(fragment);
        }
    }
    @Override
    public Fragment getItem (int i) {
        return fragmentList.get(i);
    }
    @Override
    public int getCount() {
        return tabs.length;
    }
}