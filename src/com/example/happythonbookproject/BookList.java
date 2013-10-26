package com.example.happythonbookproject;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class BookList extends ListActivity implements OnClickListener {

	Button MyInfo;
	Button BookList;
	ListView listview_book;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.booklist);
		setLayout();
	}

	private void setLayout() {
		 MyInfo = (Button)findViewById(R.id.btn_myinfo);
		 BookList = (Button)findViewById(R.id.btn_booklist);
	
		MyInfo.setOnClickListener((OnClickListener) this);
		BookList.setOnClickListener((OnClickListener) this);
		
	}
	@Override
	public void onClick(View v) {
		Intent intent;
		switch (v.getId()) {
		case R.id.btn_myinfo: // info
			//finish();
			overridePendingTransition(0, 0);
			intent = new Intent(this, MyInfo.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			startActivity(intent);
			break;

		case R.id.btn_booklist:
			//finish(); // list
			overridePendingTransition(0, 0);
			intent = new Intent(this, BookList.class);
			intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
			startActivity(intent);
			break;
		}
	}

}
