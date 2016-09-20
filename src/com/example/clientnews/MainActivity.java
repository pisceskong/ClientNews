package com.example.clientnews;

import java.util.Arrays;
import java.util.List;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.Window;

public class MainActivity extends FragmentActivity {
	
	
	private ViewPagerIndicator mIndicator;
	private ViewPager mViewPager;
	private TabAdapter mAdapter;
	
	private List<String> mDatas = Arrays.asList("短信1", "短信2", "短信3", "短信4");

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        
        mIndicator = (ViewPagerIndicator)findViewById(R.id.id_indicator);
        mViewPager = (ViewPager)findViewById(R.id.container);
        
        
        mAdapter = new TabAdapter(getSupportFragmentManager(), mDatas);
        mViewPager.setAdapter(mAdapter);
        mIndicator.setTabItemTitles(mDatas);
        
        mIndicator.setViewPager(mViewPager, 0);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
