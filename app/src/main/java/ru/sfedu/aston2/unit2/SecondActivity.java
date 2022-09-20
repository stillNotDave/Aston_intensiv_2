package ru.sfedu.aston2.unit2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_REPLY = "ru.sfedu.aston2.unit2.extra.REPLY";

    private EditText mReply;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        receiveMessage();

        mReply = findViewById(R.id.editText_second);

    }

    public void receiveMessage(){
        Intent intent = getIntent();
        String message = intent.getStringExtra(Lesson1.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.text_message);
        textView.setText(message);
    }

    public void returnReply(View view) {
        String reply = mReply.getText().toString();
        Intent replyIntent = new Intent();
        replyIntent.putExtra(EXTRA_REPLY, reply);
        setResult(RESULT_OK,replyIntent);
        finish();
    }
}