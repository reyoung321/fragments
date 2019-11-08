package com.kishor_bhattarai.fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.kishor_bhattarai.fragments.adapter.ViewPageAdapter;

public class ViewPagerActivity extends AppCompatActivity {
private ViewPager viewpager;
private TabLayout tabLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewpager= findViewById(R.id.viewPager);
        tabLayout=findViewById(R.id.tabId);
        tabLayout.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPageAdapter viewPagerAdapter= new ViewPageAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new FirstFragments(),"Sum");
        viewPagerAdapter.addFragment(new SecondFragment(),"Sub");
        viewpager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewpager);


    }
}
