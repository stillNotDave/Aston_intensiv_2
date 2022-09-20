package ru.sfedu.aston2.unit2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;

public class Homework21Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_work212);

        receiveText();
    }

    public void receiveText(){
        Intent intent = getIntent();
        String message = intent.getStringExtra(Homework21.EXTRA_TEXT);
        TextView textView = findViewById(R.id.count);
        textView.setText(message);
    }

}