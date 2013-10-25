package com.example.happythonbookproject;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.app.Activity;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.widget.ListView;

public class MainActivity extends Activity {

	// URL 주소 (임시)
	private String URL = "http://ec2-54-250-200-33.ap-northeast-1.compute.amazonaws.com/cafe_info/?CAFE_NAME=";
	String keyword;
	JSONObject jsonobject;
	JSONArray jsonarray;
	ArrayList<HashMap<String, String>> arraylist = new ArrayList<HashMap<String, String>>();

	
	ListView listview_book;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		arraylist = new ArrayList<HashMap<String, String>>();
		jsonarray = JSONfunctions.getJSONfromURL(URL + keyword);
		
		listview_book = (ListView) findViewById(R.id.listview);
		
		

	}


}
