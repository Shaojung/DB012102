package com.example.student.db012102;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutCompat;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = new Button(MainActivity.this);
        btn.setText("Click Me");
        LinearLayout layout = (LinearLayout) findViewById(R.id.activity_main);
        layout.addView(btn);
    }
}
