package com.ricky.utils.view;

import android.app.Activity;
import android.app.ProgressDialog;
import android.util.Log;

import com.ricky.utils.utils.DialogUtil;


/**
 * @Author :  Created by Ricky at 2018/6/21.
 * @Email :  yuoy@allinpay.com
 */
public class CustomSystemDialog {

	private static final String TAG = CustomSystemDialog.class.getSimpleName();
	private volatile static CustomSystemDialog instance;
	public static Activity mActivity;//宿主Activity
	private static ProgressDialog mProgressDialog;

	private CustomSystemDialog(Activity mActivity) {
		this.mActivity = mActivity;
		Log.i(TAG, "Singleton has loaded");
	}

	/**
	 * 双重校验锁
	 *
	 * @return
	 */
	public static CustomSystemDialog getInstance(Activity mActivity) {
		if (instance == null) {
			synchronized (CustomSystemDialog.class) {
				if (instance == null) {
					instance = new CustomSystemDialog(mActivity);
				}
			}
		}
		return instance;
	}


	public static void showProgressDialog() {
		showProgressDialog("加载中，请稍后");
	}

	public static void showProgressDialog(String message) {
		showProgressDialog(message, true);
	}

	public static void showProgressDialog(String message, boolean cancelable) {
		if (mProgressDialog == null)
			mProgressDialog = DialogUtil.createProgressDialog(mActivity, message, cancelable);
		if (mProgressDialog.isShowing()) {
			hideDialog();
			return;
		} else {
			mProgressDialog.show();
		}
	}

	public static void hideDialog() {
		if (mProgressDialog != null) {
			mProgressDialog.dismiss();
			mProgressDialog = null;
		}
	}
}
