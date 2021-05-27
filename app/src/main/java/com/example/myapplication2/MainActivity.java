package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        Intent intent = getIntent();
    }
    public void sendMessage1(View view) {
        Button button1 = (Button) findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher",1);
        startActivity(intent1);
    }
    public void sendMessage2(View view) {
        Button button2 = (Button) findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher",2);
        startActivity(intent1);
    }
    public void sendMessage3(View view) {
        Button button3 = (Button) findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher",3);
        startActivity(intent1);
    }
    public void sendMessage4(View view) {
        Button button4 = (Button) findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        Intent intent1 = new Intent(this, goCipher.class);
        intent1.putExtra("cipher",4);
        startActivity(intent1);
    }


}