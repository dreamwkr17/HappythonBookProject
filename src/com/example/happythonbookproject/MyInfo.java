package com.example.happythonbookproject;

import java.util.ArrayList;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MyInfo extends ListActivity implements OnClickListener{
	Button MyInfo;
	Button BookList;
	ListView listview_book;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myinfo);
		setLayout();
		
		// jsonarray = JSONfunctions.getJSONfromURL(URL + keyword);
				ArrayList<Person> m_orders = new ArrayList<Person>();

				//있는 책 리스트로 뿌림 
				Person p1 = new Person("myinfo book1", "민음사");
				Person p2 = new Person("myinfo 책2", "민음사사");

				m_orders.add(p1);
				m_orders.add(p2);

				BookAdapter m_adapter = new BookAdapter(this, R.layout.row, m_orders);
				setListAdapter(m_adapter);
	}

	private void setLayout() {
		 MyInfo = (Button)findViewById(R.id.btn_myinfo);
		 BookList = (Button)findViewById(R.id.btn_booklist);
		
	}
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
