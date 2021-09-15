package com.nuryadincjr.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btnExplisit, btnImplisit, btnExtra;
    private EditText txtInput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnExplisit = findViewById(R.id.btnExplisit);
        btnImplisit = findViewById(R.id.btnImplisit);
        btnExtra = findViewById(R.id.btnExtra);
        txtInput = findViewById(R.id.txtEkstra);

        btnExplisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExpilistActivity.class);
//                intent.setData(Uri.parse("https://nuryadincjr.github.io"));
                startActivity(intent);
            }
        });

        btnImplisit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_SEND);
                intent.putExtra(Intent.EXTRA_TEXT,"https://nuryadincjr.github.io");
                intent.setType("text/plain");

                if(intent.resolveActivity(getPackageManager()) != null)
                    System.out.println(getPackageManager());
                    startActivity(intent);
            }
        });

        btnExtra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ExpilistActivity.class);
                intent.putExtra("txt", txtInput.getText().toString());
                startActivity(intent);
            }
        });


    }
}