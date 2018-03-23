package com.tianxiabuyi.ui.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import ui.tianxiabuyi.com.loadinglayout.LoadingLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoadingLayout loadingLayout = LoadingLayout.wrap(this);
        loadingLayout.showContent();
        loadingLayout.showLoading();
    }
}
