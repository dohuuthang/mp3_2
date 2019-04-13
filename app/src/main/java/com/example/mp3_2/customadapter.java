package com.example.mp3_2;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static com.example.mp3_2.R.id.tvso;

public class customadapter extends ArrayAdapter<song> {

    private Context context;
    private int resource;
    private ArrayList<song> arraysong;

    public customadapter(Context context, int resource, ArrayList<song> objects) {
        super(context, resource, objects);
        this.context = context;
        this.resource = resource;
        this.arraysong = objects;
    }



    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {

        convertView= LayoutInflater.from(context).inflate(R.layout.item_name,parent,false);

        TextView tvso =convertView.findViewById(R.id.tvso);
        TextView tvname =convertView.findViewById(R.id.tvname);

        song context=arraysong.get(position);
        tvname.setText(context.getTbh());
        tvso.setText((position+1)+"");

        return convertView;
    }
}
