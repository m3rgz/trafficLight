package com.example.traffic_light;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;


public class MainActivity extends AppCompatActivity {

    private LinearLayout mLinearLayout;
    private static final String KEY_COLOR = "COLOR";
    private Integer color = R.color.white;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLinearLayout = findViewById(R.id.rootLayout);
        if(savedInstanceState != null && savedInstanceState.containsKey(KEY_COLOR)) {
            color = savedInstanceState.getInt(KEY_COLOR);
            mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(KEY_COLOR, color);
    }

    @SuppressLint("ResourceAsColor")
    public void OnClickBtnRedBackground(View view){
        color = R.color.red_text_background;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

    @SuppressLint("ResourceAsColor")
    public void OnClickBtnYellowBackground(View view){
        color = R.color.yellow_text_background;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

    @SuppressLint("ResourceAsColor")
    public void OnClickBtnGreenBackground(View view){
        color = R.color.green_text_background;
        mLinearLayout.setBackgroundColor(ContextCompat.getColor(this, color));
    }

}