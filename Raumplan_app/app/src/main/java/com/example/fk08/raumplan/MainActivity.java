package com.example.fk08.raumplan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.view.MenuItem;

import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends Activity implements View.OnClickListener{

    ImageView eg;
    ImageView og1;
    ImageView og2;
    ImageView og3;
    ImageView og4;
    ImageView ug;
    Button eg_b;
    Button og1_b;
    Button og2_b;
    Button og3_b;
    Button og4_b;
    Button ug_b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eg=(ImageView)findViewById(R.id.eg);
        og1=(ImageView)findViewById(R.id.og1);
        og2=(ImageView)findViewById(R.id.og2);
        og3=(ImageView)findViewById(R.id.og3);
        og4=(ImageView)findViewById(R.id.og4);
        ug=(ImageView)findViewById(R.id.ug);
        eg_b=(Button)findViewById(R.id.eg_btn);
        og1_b=(Button)findViewById(R.id.og1_btn);
        og2_b=(Button)findViewById(R.id.og2_btn);
        og3_b=(Button)findViewById(R.id.og3_btn);
        og4_b=(Button)findViewById(R.id.og4_btn);
        ug_b=(Button)findViewById(R.id.ug_btn);
        eg_b.setOnClickListener(this);
        og1_b.setOnClickListener(this);
        og2_b.setOnClickListener(this);
        og3_b.setOnClickListener(this);
        og4_b.setOnClickListener(this);
        ug_b.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        switch(v.getId())
        {
            case R.id.ug_btn:
                ug.setVisibility(View.VISIBLE);
                eg.setVisibility(View.GONE);
                og1.setVisibility(View.GONE);
                og2.setVisibility(View.GONE);
                og3.setVisibility(View.GONE);
                og4.setVisibility(View.GONE);
                //eg.setImageResource(R.drawable.eg);
                break;

            case R.id.eg_btn:
                ug.setVisibility(View.GONE);
                eg.setVisibility(View.VISIBLE);
                og1.setVisibility(View.GONE);
                og2.setVisibility(View.GONE);
                og3.setVisibility(View.GONE);
                og4.setVisibility(View.GONE);
                //eg.setImageResource(R.drawable.eg);
                break;

            case R.id.og1_btn:
                ug.setVisibility(View.GONE);
                eg.setVisibility(View.GONE);
                og1.setVisibility(View.VISIBLE);
                og2.setVisibility(View.GONE);
                og3.setVisibility(View.GONE);
                og4.setVisibility(View.GONE);
                break;

            case R.id.og2_btn:
                ug.setVisibility(View.GONE);
                eg.setVisibility(View.GONE);
                og1.setVisibility(View.GONE);
                og2.setVisibility(View.VISIBLE);
                og3.setVisibility(View.GONE);
                og4.setVisibility(View.GONE);
                break;

            case R.id.og3_btn:
                ug.setVisibility(View.GONE);
                eg.setVisibility(View.GONE);
                og1.setVisibility(View.GONE);
                og2.setVisibility(View.GONE);
                og3.setVisibility(View.VISIBLE);
                og4.setVisibility(View.GONE);
                break;

            case R.id.og4_btn:
                ug.setVisibility(View.GONE);
                eg.setVisibility(View.GONE);
                og1.setVisibility(View.GONE);
                og2.setVisibility(View.GONE);
                og3.setVisibility(View.GONE);
                og4.setVisibility(View.VISIBLE);
                break;

        }
    }
}




