package com.ricky.demo;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.ricky.utils.view.CustomTabBar;

public class MainActivity extends AppCompatActivity {
	private CustomTabBar mb;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mb=(CustomTabBar)findViewById(R.id.bottom_tab_bar);

		mb.init(getSupportFragmentManager())
				.setImgSize(50,50)
				.setFontSize(8)
				.setTabPadding(4,6,10)
				.setChangeColor(Color.RED,Color.DKGRAY)
				.addTabItem("首页", R.mipmap.jkqb_foot_icon004_focused, FragmentOne.class)
				.addTabItem("通讯录", R.mipmap.jkqb_foot_icon003_focused, FragmentTwo.class)
				.addTabItem("发现", R.mipmap.jkqb_foot_icon002_focused, FragmentOne.class)
				.addTabItem("更多", R.mipmap.jkqb_foot_icon001_focused, FragmentTwo.class)
				.isShowDivider(false)
				.setOnTabChangeListener(new CustomTabBar.OnTabChangeListener() {
					@Override
					public void onTabChange(int position, String name) {

					}
				});

	}

}
