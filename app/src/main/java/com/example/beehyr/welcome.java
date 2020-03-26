package com.example.beehyr;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.ViewCompat;

import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.TextView;
import android.widget.Toast;
import static com.example.beehyr.about_u.a;
import static com.example.beehyr.about_u.b;
import static com.example.beehyr.about_u.c;

public class welcome extends AppCompatActivity {
    public static ImageView imageView;
    GridView grid;
    String[] web = {
            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",

            "वितरण",
            "चालक",
            "पलम्बर",


    } ;
    int[] imageId = {
            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

            R.drawable.dlivery,
            R.drawable.driver,
            R.drawable.plumber,

    };

    public  TextView naam,date,pata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        customGrid adapter = new customGrid(welcome.this, web, imageId);
        grid=(GridView)findViewById(R.id.grid);
        naam=(TextView) findViewById(R.id.a_name);
        date=(TextView) findViewById(R.id.a_dob);
        pata=(TextView) findViewById(R.id.a_add);
        naam.setText(a);
        date.setText(b);
        pata.setText(c);
        imageView=(ImageView) findViewById(R.id.profile_image);
        grid.setAdapter(adapter);
        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(welcome.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();

                startActivity(new Intent(welcome.this, ques3.class));
            }
        });

    }
}
