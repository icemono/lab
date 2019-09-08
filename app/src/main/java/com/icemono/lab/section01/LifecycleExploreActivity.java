package com.icemono.lab.section01;

import android.os.Bundle;
import android.util.Log;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * Created on 2019-09-06.
 *
 * @author ice
 */
public abstract class LifecycleExploreActivity extends AppCompatActivity {

    protected void log(String s) {
        Log.i(getTitle().toString(), s);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        log("onCreate");

        if (savedInstanceState != null) {
            String name = savedInstanceState.getString("name");
            log("name is " + name);
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        log("onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        log("onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        log("onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        log("onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        log("onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        log("onRestart");
    }

    /**
     * 重建时保存数据
     */
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("name", "Winter");
        log("onSaveInstanceState");
    }


}
