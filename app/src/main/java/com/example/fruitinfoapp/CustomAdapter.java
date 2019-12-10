package com.example.fruitinfoapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] name;
    int[] image;

    CustomAdapter(Context context, String[] name, int[] image){
        this.context = context;
        this.name = name;
        this.image = image;
    }

    @Override
    public int getCount() {
        return name.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater;
        if(convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.fruit_details_sample,parent,false);
        }
        ImageView imageView = convertView.findViewById(R.id.detailImageViewId);
        TextView textView = convertView.findViewById(R.id.detailTextViewId);
        imageView.setImageResource(image[position]);
        textView.setText(name[position]);

        return convertView;
    }
}
