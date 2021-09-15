package com.nuryadincjr.intent;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.nuryadincjr.intent.databinding.ActivityExpilistBinding;

public class ExpilistActivity extends AppCompatActivity {

    private ActivityExpilistBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_expilist);

        binding = ActivityExpilistBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Intent intent = getIntent();
        String txt = intent.getStringExtra("txt");
        if(txt != null) {
            binding.textView.setText(txt);
        }
    }
}