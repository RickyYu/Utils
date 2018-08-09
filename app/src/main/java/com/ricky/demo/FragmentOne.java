package com.ricky.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ricky.utils.view.CustomSystemDialog;

/**
 * @Author :  Created by Ricky at 2018/8/9.
 * @Email :  yuoy@allinpay.com
 */
public class FragmentOne extends Fragment {

	@Nullable
	@Override
	public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_one, container, false);

		view.findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				CustomSystemDialog.getInstance(getActivity()).showProgressDialog();
			}
		});

		view.findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				CustomSystemDialog.getInstance(getActivity()).hideDialog();
			}
		});

		return view;

	}
}
