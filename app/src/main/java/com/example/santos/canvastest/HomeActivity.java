package com.example.santos.canvastest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private Button btn5;
    private Button btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        initViews();
    }

    private void initViews() {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
        btn5.setOnClickListener(this);
        btn6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = null;
        switch (v.getId()) {
            case R.id.btn1:
                intent = new Intent(this, MainActivity.class);
                break;
            case R.id.btn2:
                intent = new Intent(this, Main2Activity.class);
                break;
            case R.id.btn3:
                intent = new Intent(this, Main3Activity.class);
                break;
            case R.id.btn4:
                intent = new Intent(this, Main4Activity.class);
                break;
            case R.id.btn5:
                intent = new Intent(this, Main5Activity.class);
                break;
            case R.id.btn6:
                intent = new Intent(this, Main6Activity.class);
                break;
        }
        startActivity(intent);
    }
}
