package com.example.beehyr;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class list_jobs extends AppCompatActivity {
RecyclerView recyclerView;
product_adapter product_adapter;
List<product> productList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_jobs);
        productList=new ArrayList<>();
        recyclerView=(RecyclerView) findViewById(R.id.rv);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        productList.add(
                new product("पलम्बर","1000/--2000","लखनऊ",R.drawable.zomato));
        productList.add(new product("पलम्बर","1000/--2000","लखनऊ",R.drawable.zomato));
    }
}
