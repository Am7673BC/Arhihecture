package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button buttonThirdSide;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        buttonThirdSide = findViewById(R.id.ButtonToThirdSide);
        buttonThirdSide.setOnClickListener(view ->{
            Intent intent = new Intent(this,ThirdActivity.class);
            startActivity(intent);
        });
    }
}