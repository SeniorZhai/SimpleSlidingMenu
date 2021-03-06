package com.zoe.slidingmenudemo;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.view.View;

import com.zoe.slidingmenu.view.SlidingMenu;
import com.zoe.slidingmenudemo.fragment.CenterFragment;
import com.zoe.slidingmenudemo.fragment.CenterFragment.OnViewPagerChangeListener;
import com.zoe.slidingmenudemo.fragment.LeftFragment;
import com.zoe.slidingmenudemo.fragment.RightFragment;

public class MainActivity extends FragmentActivity {
	private SlidingMenu mSlidingMenu;
	private LeftFragment mLeftFragment;
	private RightFragment mRightFragment;
	private CenterFragment mCenterFragment;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findView();
		initView();
	}

	private void findView() {
		mSlidingMenu = (SlidingMenu) findViewById(R.id.sm);
	}

	private void initView() {
		View leftView = View.inflate(this, R.layout.frame_left, null);
		View rightView = View.inflate(this, R.layout.frame_right, null);
		View centerView = View.inflate(this, R.layout.frame_center, null);
		
		//	添加SlidingMenu的左右菜单，设置其宽度
		mSlidingMenu.setView(leftView, rightView, centerView, 200, 250);

		FragmentTransaction transaction = getSupportFragmentManager()
				.beginTransaction();
		mLeftFragment = new LeftFragment();
		transaction.replace(R.id.fl_left, mLeftFragment);
		mRightFragment = new RightFragment();
		transaction.replace(R.id.fl_right, mRightFragment);
		mCenterFragment = new CenterFragment();
		transaction.replace(R.id.fl_center, mCenterFragment);
		transaction.commit();
		//	根据Page的位置设置是否响应侧滑菜单
		mCenterFragment
				.setOnViewPagerChangeListener(new OnViewPagerChangeListener() {
					
					@Override
					public void onPageChage(int position) {
						if (mCenterFragment.isFirst()) {
							mSlidingMenu.setWhichSideCanShow(true, false);
						} else if (mCenterFragment.isLast()) {
							mSlidingMenu.setWhichSideCanShow(false, true);
						} else {
							mSlidingMenu.setWhichSideCanShow(false, false);
						}
					}
				});
	}

	public void showLeftViewToogle() {
		mSlidingMenu.showLeftViewToogle();
	}

	public void showRightViewToogle() {
		mSlidingMenu.showRightViewToogle();
	}

}
