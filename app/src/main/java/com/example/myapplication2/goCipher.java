package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class goCipher extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_cipher);
        getSupportActionBar().hide();
        Intent intent1 = getIntent();
        int What = intent1.getIntExtra("cipher", 0);
        if (What == 2) disableEditText(findViewById(R.id.editText2));
        if (What == 3) disableEditText(findViewById(R.id.editText));
        if (What == 4) {
            disableEditText(findViewById(R.id.editText));
            disableEditText(findViewById(R.id.editText2));
        } //отключение ненужных editText

        goTo(What);
    }
    private void goTo(int W) {
        int a=W;
    }
        private void disableEditText(EditText editText) {
        editText.setFocusable(false);
        editText.setEnabled(false);
        editText.setCursorVisible(false);
        editText.setKeyListener(null);
        editText.setVisibility(View.INVISIBLE);
    }
    public void sendMessage(View view) {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }

        });
        Intent intent1 = getIntent();
        int What = intent1.getIntExtra("cipher", 0);
        Intent intent2 = new Intent(this, MessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String key = editText.getText().toString();
        intent2.putExtra("message", key);
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        String m = editText1.getText().toString();
        intent2.putExtra("message1", m);
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        String alf = editText2.getText().toString();
        if (alf.isEmpty()) alf="а";
        intent2.putExtra("message2", alf);
        intent2.putExtra("message3",What);
        startActivity(intent2);

    }
}