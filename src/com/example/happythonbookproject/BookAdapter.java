package com.example.happythonbookproject;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class BookAdapter extends ArrayAdapter<Person> {

	private ArrayList<Person> items;
	private Context context;

	public BookAdapter(Context context, int textViewResourceId,
			ArrayList<Person> items) {
		super(context, textViewResourceId, items);
		this.items = items;
		this.context = context;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		View v = convertView;
		if (v == null) {
			LayoutInflater vi = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = vi.inflate(R.layout.row, null);
		}
		Person p = items.get(position);
		if (p != null) {
			TextView tt = (TextView) v.findViewById(R.id.textView1);
			TextView bt = (TextView) v.findViewById(R.id.textView2);
			if (tt != null) {
				tt.setText(p.getName());
			}
			if (bt != null) {
				bt.setText("전화번호: " + p.getNumber());
			}
		}
		return v;
	}
}
