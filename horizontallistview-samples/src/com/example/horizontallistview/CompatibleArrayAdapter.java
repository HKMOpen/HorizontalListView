package com.example.horizontallistview;

import java.util.Collection;
import java.util.List;

import android.content.Context;
import android.widget.ArrayAdapter;

public class CompatibleArrayAdapter<T> extends ArrayAdapter<T> {

	public CompatibleArrayAdapter(Context context, int resource,
			int textViewResourceId, List<T> objects) {
		super(context, resource, textViewResourceId, objects);
	}

	public CompatibleArrayAdapter(Context context, int resource,
			int textViewResourceId, T[] objects) {
		super(context, resource, textViewResourceId, objects);
	}

	public CompatibleArrayAdapter(Context context, int resource,
			int textViewResourceId) {
		super(context, resource, textViewResourceId);
	}

	public CompatibleArrayAdapter(Context context, int textViewResourceId,
			List<T> objects) {
		super(context, textViewResourceId, objects);
	}

	public CompatibleArrayAdapter(Context context, int textViewResourceId,
			T[] objects) {
		super(context, textViewResourceId, objects);
	}

	public CompatibleArrayAdapter(Context context, int textViewResourceId) {
		super(context, textViewResourceId);
	}
	
	public void addAll(Collection<? extends T> collection) {
		setNotifyOnChange(false);
		for(T item : collection){
			add(item);
		}
		setNotifyOnChange(true);
		notifyDataSetChanged();
	}

}
