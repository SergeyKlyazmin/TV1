package com.example.tv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void onClick(View v) {

        EditText nameText = findViewById(R.id.name);

        EditText messageText = findViewById(R.id.message);

        String name = nameText.getText().toString();

        String message = messageText.getText().toString();


        Intent intent = new Intent(this, MainActivity3.class);
        intent.putExtra("name", name);

        intent.putExtra("message", message);
        startActivity(intent);
    }
}