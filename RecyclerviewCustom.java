package com.example.shreeji.recyclerviewdemo;

import android.app.LauncherActivity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;


/**
 * Created by Shreeji on 06-Sep-17.
 */
public class RecyclerviewCustom extends RecyclerView.Adapter<RecyclerviewCustom.MyViewHolder>
{

    public RecyclerviewCustom(ArrayList<String> name, ArrayList<String> price) {
        this.name = name;
        this.price = price;
    }

    ArrayList<String> name,price;
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.recyclercustom,null);
        MyViewHolder mvh=new MyViewHolder(view);
        return mvh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {



        try{
            holder.textView1.setText(name.get(position));
            holder.textView2.setText(price.get(position));

        }
        catch (Exception e)
        {

        }
        // holder.chke.setTag(position);

    }

    @Override
    public int getItemCount() {
        return name.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView1,textView2;
        CheckBox chke;
        public MyViewHolder(View itemView) {
            super(itemView);

            textView1= (TextView) itemView.findViewById(R.id.textView);
            textView2= (TextView) itemView.findViewById(R.id.textView2);
            chke= (CheckBox) itemView.findViewById(R.id.chk);

            chke.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                   textView1.setText("dda");
                   textView2.setText("ds");
                }
            });

        }
    }


}
