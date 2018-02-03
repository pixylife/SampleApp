package com.sample.sampleapp.ui;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.sample.sampleapp.R;
import com.sample.sampleapp.network.ApiInterface;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    ApiInterface apiInterface;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
