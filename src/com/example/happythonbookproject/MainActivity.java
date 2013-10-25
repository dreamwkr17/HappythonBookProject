package com.example.happythonbookproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class MainActivity extends Activity implements OnClickListener {
	ImageButton MyInfo;
	ImageButton BookList;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setLayout();
		
		
		
	}
	void setLayout() {
		MyInfo = (ImageButton)findViewById(R.id.);
		BookList = (ImageButton)findViewById(R.id.);
		MyInfo.setOnClickListener(this);
		BookList.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
		case R.id.:  //info
			finish();
			overridePendingTransition(0, 0);
			intent = new Intent(this, MyInfo.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			startActivity(intent);
			break;

		case R.id.:
			finish(); //list
			overridePendingTransition(0, 0);
			intent = new Intent(this, BookList.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			startActivity(intent);
			break;
		}
	}

}
