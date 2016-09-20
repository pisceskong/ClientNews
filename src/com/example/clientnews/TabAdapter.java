package com.example.clientnews;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class TabAdapter extends FragmentPagerAdapter{
	
	//public String[] TITLES ;//= new String[] { "标题 1", "标题 2", "标题 3", "标题 4"}; 
	List<String> TITLES;
	
	public TabAdapter(FragmentManager fm, List<String> titles) {
		super(fm);
		this.TITLES = titles;
		// TODO Auto-generated constructor stub
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		MainFragment fragment = new MainFragment(arg0);  
        return fragment; 
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return TITLES.size();
	}

	@Override
	public CharSequence getPageTitle(int position) {
		// TODO Auto-generated method stub
		//return TITLES[position % TITLES.size()];
		return TITLES.get(position);
	}
	
	
	

}
