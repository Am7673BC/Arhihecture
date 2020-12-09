package com.test.architecture;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Button ButtonFinishGame;

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        ButtonFinishGame = findViewById(R.id.FinishGame);
        ButtonFinishGame.setOnClickListener(view ->{
            Intent intent = new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
    }
