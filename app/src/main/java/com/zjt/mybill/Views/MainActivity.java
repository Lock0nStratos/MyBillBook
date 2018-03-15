package com.zjt.mybill.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zjt.mybill.R;

public class MainActivity extends AppCompatActivity implements IViewMain{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void Refresh() {

    }
}
