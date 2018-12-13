package com.tianxiabuyi.ui.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.tianxiabuyi.ui.loadinglayout.LoadingLayout;


public class MainActivity extends AppCompatActivity {

    private LoadingLayout loadingLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loadingLayout = findViewById(R.id.loading_layout);
        TextView tv = findViewById(R.id.tv_success);

        loadingLayout.setBindView(tv);
        loadingLayout.showLoading();
    }

    public void loading(View view) {
        loadingLayout.showLoading();
    }

    public void empty(View view) {
        loadingLayout.showEmpty();
    }

    public void success(View view) {
        loadingLayout.showSuccess();
    }

    public void error(View view) {
        loadingLayout.showError();
    }

    public void netError(View view) {
        loadingLayout.showNetwork();
    }
}
