package com.example.horizontallistview;

import android.app.Activity;
import android.os.Bundle;
import android.widgetx.HorizontalListView;

public class SampleActivity extends Activity {

	private static String[] items = new String[] { "Text #1", "Text #2",
		"Text #3", "Text #4", "Text #5", "Text #6", "Text #7", "Text #8",
		"Text #9", "Text #10", "Text #10", "Text #10", "Text #10",
		"Text #10", "Text #10", "Text #101" };
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sample);
		
		CompatibleArrayAdapter<String> adapter = new CompatibleArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1);
		HorizontalListView lv = (HorizontalListView) findViewById(R.id.list);
		lv.setAdapter(adapter);
		
		adapter.addAll(items);
	}
	
	

}
