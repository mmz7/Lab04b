package com.zhangmegan.lab04b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    final int[] id = new int[1];
    Button enter;
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        enter = findViewById(R.id.enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intent);
            }
        });
    }
    public void onClickHwaa(View view) {
        intent = new Intent(getApplicationContext(), HwaaActivity.class);
    }

    public void onClickArirang(View view) {
        intent = new Intent(getApplicationContext(), ArirangActivity.class);
    }

    public void onClickRain(View view) {
        intent = new Intent(getApplicationContext(), IceRainActivity.class);
    }

    public void onClickK(View view) {
        intent = new Intent(getApplicationContext(), YoungKActivity.class);
    }
}