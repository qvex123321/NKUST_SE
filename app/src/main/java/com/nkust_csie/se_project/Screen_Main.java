package com.nkust_csie.se_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Screen_Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_main);

        // 隱藏title Bar
        getSupportActionBar().hide();
    }
}
