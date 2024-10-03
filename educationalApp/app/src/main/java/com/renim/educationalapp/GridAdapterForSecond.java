package com.renim.educationalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapterForSecond extends BaseAdapter {

    Context context;
    ArrayList<String> text;
    ArrayList<Integer> image;

    public GridAdapterForSecond(Context context, ArrayList<String> text, ArrayList<Integer> image){
        this.context = context;
        this.text = text;
        this.image = image;
    }

    @Override
    public int getCount() {
        return text.size();
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

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridview_layout, parent, false);
        ImageView imageView =view.findViewById(R.id.imageView);
        TextView textView =view.findViewById(R.id.textView2);

        textView.setText(text.get(position));
        imageView.setImageResource(image.get(position));

        return view;
    }
}
