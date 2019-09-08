package com.icemono.lab;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import com.icemono.lab.section01.AActivity;
import com.icemono.lab.section02.LayoutActivity;
import com.icemono.lab.section03.TextViewActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void go(Class clazz) {
        startActivity(new Intent(this, clazz));
    }

    public void open01(View view) {
        go(AActivity.class);
    }

    public void open02(View view) {
        go(LayoutActivity.class);
    }

    public void open03(View view) {
        go(TextViewActivity.class);
    }
}
