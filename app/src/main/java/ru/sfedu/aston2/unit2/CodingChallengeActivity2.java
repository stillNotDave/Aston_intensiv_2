package ru.sfedu.aston2.unit2;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;

public class CodingChallengeActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_challenge2);

        receiveText();

    }

    public void receiveText(){
        Intent intent = getIntent();
        String message = intent.getStringExtra(CodingChallengeLesson1.EXTRA_TEXT);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }
}