package com.example.happythonbookproject;

import java.util.ArrayList;
import java.util.HashMap;




import org.json.JSONArray;
import org.json.JSONObject;





import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;

public class MainActivity extends ListActivity implements OnClickListener{
	Button btn_MyInfo;
	Button btn_BookList;
	ListView list;
	ListView listview_book2;
	 private String URL ="http://test.repang.net/books/2.json";
	// "http://ec2-54-250-200-33.ap-northeast-1.compute.amazonaws.com/cafe_info/?CAFE_NAME=";
	//しけしいかいしぉ
			 String keyword;
	JSONObject jsonobject;
	JSONArray jsonarray;
	ArrayList<HashMap<String, String>> arraylist = new ArrayList<HashMap<String, String>>();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setLayout();
		
		// jsonarray = JSONfunctions.getJSONfromURL(URL + keyword);
		ArrayList<Person> m_orders = new ArrayList<Person>();

		//赤澗 奪 軒什闘稽 姿顕 
		Person p1 = new Person("奪1", "肯製紫");
		Person p2 = new Person("奪2", "肯製紫紫");

		m_orders.add(p1);
		m_orders.add(p2);

		BookAdapter m_adapter = new BookAdapter(this, R.layout.row, m_orders);
		setListAdapter(m_adapter);

	}

	void setLayout() {
		btn_MyInfo = (Button) findViewById(R.id.btn_myinfo);
		btn_BookList = (Button) findViewById(R.id.btn_booklist);
		
		btn_MyInfo.setOnClickListener(this);
		btn_BookList.setOnClickListener(this);

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

