package ru.sfedu.aston2.unit2;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;

public class Homework22 extends AppCompatActivity {

    private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    private int mCount = 0;
    private TextView mShowCount;
    Button buttonCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);



        setContentView(R.layout.activity_homework22);
        mShowCount = findViewById(R.id.show_count);
        buttonCount = findViewById(R.id.button_count);
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countUp();
            }
        });

        if(savedInstanceState != null){
            mCount = savedInstanceState.getInt("key int");
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    public void countUp(){
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));

        }
    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d(LOG_TAG, "onStart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOG_TAG, "onDestroy");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d(LOG_TAG, "onRestart");
    }
    @Override
    protected void onPause(){
        super.onPause();
        Log.d(LOG_TAG, "onPause");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.d(LOG_TAG, "onResume");
    }
    @Override
    protected void onStop(){
        super.onStop();
        Log.d(LOG_TAG, "onStop");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        outState.putInt("key int", mCount);
        //outState.putString("key string", mShowCount.getText().toString());
        super.onSaveInstanceState(outState);
    }
}