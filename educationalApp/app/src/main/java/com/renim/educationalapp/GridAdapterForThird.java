package com.renim.educationalapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapterForThird extends BaseAdapter {
    Context context;
    ArrayList<String> textThird;
    ArrayList<Integer> imageThird;

    public GridAdapterForThird(Context context, ArrayList<String> text, ArrayList<Integer> image){
        this.context = context;
        this.textThird = text;
        this.imageThird = image;
    }

    @Override
    public int getCount() {
        return textThird.size();
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
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridviewthird_layout, parent, false);
        ImageView imageView =view.findViewById(R.id.imageView2);
        TextView textView =view.findViewById(R.id.textView3);

        textView.setText(textThird.get(position));
        imageView.setImageResource(imageThird.get(position));

        return view;
    }
}
