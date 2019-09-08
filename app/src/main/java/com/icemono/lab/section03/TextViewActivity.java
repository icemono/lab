package com.icemono.lab.section03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.icemono.lab.R;

/**
 * Created on 2019-09-06.
 *
 * @author ice
 */
public class TextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);

        TextView tv = findViewById(R.id.marquee_tv);
        tv.setSelected(true);
    }

}
