package com.nuryadincjr.intent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.nuryadincjr.intent.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.btnExplisit.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ExpilistActivity.class);
//                intent.setData(Uri.parse("https://nuryadincjr.github.io"));
            startActivity(intent);
        });

        binding.btnImplisit.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.setAction(Intent.ACTION_SEND);
            intent.putExtra(Intent.EXTRA_TEXT,"https://nuryadincjr.github.io");
            intent.setType("text/plain");

            if(intent.resolveActivity(getPackageManager()) != null)
                System.out.println(getPackageManager());
                startActivity(intent);
        });

        binding.btnExtra.setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, ExpilistActivity.class);
            intent.putExtra("txt", binding.txtEkstra.getText().toString());
            startActivity(intent);
        });
    }
}