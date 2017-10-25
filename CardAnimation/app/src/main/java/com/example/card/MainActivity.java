package com.example.card;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Toast;


import com.example.library.GalleryFlow;

import com.example.library.ImageAdapter;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Integer[] images = { R.mipmap.a, R.mipmap.b,
                R.mipmap.c, R.mipmap.d, R.mipmap.e,
                R.mipmap.f,  R.mipmap.g,R.mipmap.h };

        ImageAdapter adapter = new ImageAdapter(this, images);
        adapter.createReflectedImages();//创建倒影效果
        GalleryFlow galleryFlow = (GalleryFlow) this.findViewById(R.id.gallery);
        galleryFlow.setFadingEdgeLength(0);
        galleryFlow.setSpacing(-100); //图片之间的间距
        galleryFlow.setAdapter(adapter);

        galleryFlow.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
               // Toast.makeText(getApplicationContext(), String.valueOf(position), Toast.LENGTH_SHORT).show();
            }

        });
        galleryFlow.setSelection(4);
    }
}

