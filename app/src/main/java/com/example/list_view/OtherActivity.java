package com.example.list_view;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class OtherActivity extends AppCompatActivity {

    ListView listView;
    CustomAdapter adapter;
    String name[]={"Virat Kohli","Suryakumar Yadav","Sachin Tendulkar","Sachin Tendulkar","Hardik Pandya","Rohit Sharma","Seven","Eight","Nine","Ten","Eleven","Twelve","One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};
    String num[]={"BATSMAN","BATSMAN","ALL RAUNDER","ALL RAUNDER","BATSMAN","BATSMAN","3423","1234","4343","788","4253","3433","34213","341","6754","Four","Five","Six","Seven","Eight","Nine","Ten","Eleven","Twelve"};

    int imgArr[]={R.drawable.img,R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,
            R.drawable.img,R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,
            R.drawable.img,R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4,R.drawable.img_5,
            R.drawable.img,R.drawable.img_1, R.drawable.img_2,
            R.drawable.img_3,R.drawable.img_4,R.drawable.img_5};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        listView=findViewById(R.id.other_Listview);
        adapter=new CustomAdapter(OtherActivity.this,name,num,imgArr);
        listView.setAdapter(adapter);
    }
}