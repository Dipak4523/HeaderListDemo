package com.example.shreeji.recyclerviewdemo;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView=(RecyclerView)findViewById(R.id.recycler1);

        Button btnnext= (Button) findViewById(R.id.button);
        ArrayList<String> productName=new ArrayList<>();
        ArrayList<String> productPrice=new ArrayList<>();


        productName.add("Computer");
        productName.add("Laptop");
        productName.add("Mobile");
        productName.add("Tablate");
        productName.add("Iphone");


        productPrice.add("25000");
        productPrice.add("35000");
        productPrice.add("7000");
        productPrice.add("10000");
        productPrice.add("60000");


        RecyclerviewCustom rvc=new RecyclerviewCustom(productName,productPrice);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(rvc);

       btnnext.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        try
        {

            //CheckBox ch= (CheckBox) view.findViewById(R.id.chk);
            //TextView txt= (TextView) view.findViewById(R.id.textView);

            /*if(ch.isChecked())
            {
                String str=txt.getText().toString();
                Toast.makeText(getApplicationContext(),str,Toast.LENGTH_SHORT).show();

            }*/
        }
        catch (Exception e)
        {

        }


    }
}
