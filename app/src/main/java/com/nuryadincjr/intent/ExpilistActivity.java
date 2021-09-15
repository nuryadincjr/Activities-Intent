package com.nuryadincjr.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ExpilistActivity extends AppCompatActivity {
    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expilist);

        textView = findViewById(R.id.textView);

        Intent intent = getIntent();
        String txt = intent.getStringExtra("txt");
        if(txt != null) {
            textView.setText(txt);
        }
    }
}