package com.example.xiyou.newtest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.AdapterView;

import android.view.View;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<Inter> interList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initInter();
        final RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        InterAdapter adapter=new InterAdapter(this,interList);
        recyclerView.setAdapter(adapter);
    }

    private void initInter() {
        Inter baidu=new Inter("baidu","https://www.baidu.com",R.drawable.baidu_pic);
        interList.add(baidu);

        Inter sohu=new Inter("sohu","https://m.sohu.com",R.drawable.sohu_pic);
        interList.add(sohu);

        Inter google=new Inter("google","https://www.google.com",R.drawable.guge_pic);
        interList.add(google);

        Inter quark=new Inter("quark","https://www.myquark.cn",R.drawable.quark_pic);
        interList.add(quark);

        Inter firefox=new Inter("firefox","https://www.firefox.com.cn",R.drawable.firefox_pic);
        interList.add(firefox);

        Inter qq=new Inter("qq","https://hao.qq.com",R.drawable.qq_pic);
        interList.add(qq);

        Inter sogou=new Inter("sogou","https://mse.sogou.com",R.drawable.sogou_pic);
        interList.add(sogou);

        Inter via=new Inter("via","http://via.lyear.cc",R.drawable.via_pic);
        interList.add(via);
    }

}
