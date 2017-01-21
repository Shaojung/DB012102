package com.example.student.db012102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1.0f);

        Button btn = new Button(MainActivity.this);
        btn.setLayoutParams(params);
        btn.setText("Click Me");
        layout.addView(btn);
        Button btn2 = new Button(MainActivity.this);
        btn2.setLayoutParams(params);
        btn2.setText("Click Me 2");
        layout.addView(btn2);
        Button btn3 = new Button(MainActivity.this);
        btn3.setLayoutParams(params);
        btn3.setText("Click Me 3");
        layout.addView(btn3);
    }
}
