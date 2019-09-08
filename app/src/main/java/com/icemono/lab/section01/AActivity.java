package com.icemono.lab.section01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import com.icemono.lab.R;

/**
 * Created on 2019-09-06.
 *
 * @author ice
 */
public class AActivity extends LifecycleExploreActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
    }

    public void goB(View view) {
        startActivity(new Intent(this, BActivity.class));
    }

}
