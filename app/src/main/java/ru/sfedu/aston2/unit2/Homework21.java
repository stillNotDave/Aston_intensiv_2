package ru.sfedu.aston2.unit2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;

public class Homework21 extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    Button buttonCount;

    public static final String EXTRA_TEXT = "ru.sfedu.aston2.unit2.extra.TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homework21);

        buttonCount = findViewById(R.id.button_count);
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countUp();
            }
        });

        mShowCount = findViewById(R.id.show_count);

    }

    public void countUp(){
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));

        }
    }

    public void sayHello(View view) {
        Intent intent = new Intent(this, Homework21Activity2.class);
        String text = Integer.toString(mCount);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }
}