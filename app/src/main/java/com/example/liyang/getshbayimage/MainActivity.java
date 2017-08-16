package com.example.liyang.getshbayimage;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener{
    private GridAdapter gridAdapter;
    private GridView gridView;
    private int[] images = new int[]{R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,
                                R.drawable.a7,R.drawable.a8,R.drawable.a9,R.drawable.a10,R.drawable.a11,R.drawable.a12};
    private String[] titles = new String[]{"备忘录", "签名","电话","钢琴","旅游","地图","路由","头条","相册","推特","联系人","开眼"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        init();
    }
    private void init()
    {
        gridView = (GridView) findViewById(R.id.gridview);
        gridAdapter = new GridAdapter(titles,images,this);
        gridView.setAdapter(gridAdapter);
        gridView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if(titles[position].equals("头条"))
        {
            Intent  intent = new Intent();
            intent.setClass(this,ToutiaoActivity.class);
            startActivity(intent);
        }

    }
}
