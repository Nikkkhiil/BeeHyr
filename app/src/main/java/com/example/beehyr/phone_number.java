package com.example.beehyr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class phone_number extends AppCompatActivity {
Button otp_enter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_number);
        otp_enter=(Button) findViewById(R.id.otp_b);
        otp_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myotp=new Intent(phone_number.this,otp.class);
                phone_number.this.startActivity(myotp);

            }
        });
    }
}
