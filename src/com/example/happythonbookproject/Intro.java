package com.example.happythonbookproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

public class Intro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.intro);
		initialize();
	}

	private void initialize() {
		Handler handler = new Handler() {
			public void handleMessage(Message msg) {
				finish();
				Intent intent = new Intent(Intro.this, MainActivity.class);
				startActivity(intent);
			}
		};
		handler.sendEmptyMessageDelayed(0, 2000);
	}
	@Override
	public void onBackPressed(){}
}
