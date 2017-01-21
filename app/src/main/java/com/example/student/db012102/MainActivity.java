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
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        setContentView(layout);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1.0f);
        LinearLayout aa1 = new LinearLayout(this);
        aa1.setOrientation(LinearLayout.HORIZONTAL);
        Button btn = new Button(MainActivity.this);
        btn.setLayoutParams(params);
        btn.setText("Click Me");
        aa1.addView(btn);
        Button btn2 = new Button(MainActivity.this);
        btn2.setLayoutParams(params);
        btn2.setText("Click Me 2");
        aa1.addView(btn2);
        Button btn3 = new Button(MainActivity.this);
        btn3.setLayoutParams(params);
        btn3.setText("Click Me 3");
        aa1.addView(btn3);
        layout.addView(aa1);
        LinearLayout bb2 = new LinearLayout(this);
        aa1.setOrientation(LinearLayout.HORIZONTAL);
        Button btn4 = new Button(MainActivity.this);
        btn4.setLayoutParams(params);
        btn4.setText("Click Me");
        bb2.addView(btn4);
        Button btn5 = new Button(MainActivity.this);
        btn5.setLayoutParams(params);
        btn5.setText("Click Me 2");
        bb2.addView(btn5);
        Button btn6 = new Button(MainActivity.this);
        btn6.setLayoutParams(params);
        btn6.setText("Click Me 3");
        bb2.addView(btn6);
        layout.addView(bb2);
    }
}
