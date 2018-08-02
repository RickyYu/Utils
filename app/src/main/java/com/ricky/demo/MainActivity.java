package com.ricky.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.ricky.utils.view.CustomSystemDialog;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn_start).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				CustomSystemDialog.getInstance(MainActivity.this).showProgressDialog();
			}
		});

		findViewById(R.id.btn_stop).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				CustomSystemDialog.getInstance(MainActivity.this).hideDialog();
			}
		});
	}
}
