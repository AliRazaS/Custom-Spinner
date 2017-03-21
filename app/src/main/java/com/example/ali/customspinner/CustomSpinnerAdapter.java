package com.example.ali.customspinner;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by ali on 3/21/17.
 */

public class CustomSpinnerAdapter extends BaseAdapter {

    Activity activity;
    String [] countries;
    LayoutInflater inflater;


    public CustomSpinnerAdapter(Activity activity, String [] countries){

        this.activity  = activity;
        this.countries = countries;
        inflater       = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return countries.length;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = inflater.inflate(R.layout.spinner_row,null);
        TextView titleTV = (TextView)row.findViewById(R.id.title);
        titleTV.setText(countries[position]);
        return row;
    }
}
