package com.example.nhapson;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView txthienthi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        txthienthi = (TextView) findViewById(R.id.txthienthi);

        Intent intent = getIntent();
        txthienthi.setText(intent.getStringExtra("SoLe"));
    }


    public void Back(View v)
    {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
        txthienthi.setText("");
    }
    public void exit(View view) {
        System.exit(0);
    }
}