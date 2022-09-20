package ru.sfedu.aston2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.unit1.LessonChoice;

public class UnitChoice extends AppCompatActivity {

    Button buttonBack, buttonUnit1, buttonUnit2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_choice);

        buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(MainActivity.class);
            }
        });

        buttonUnit1 = findViewById(R.id.unit_1);
        buttonUnit1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(LessonChoice.class);
            }
        });

        buttonUnit2 = findViewById(R.id.unit_2);
        buttonUnit2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(ru.sfedu.aston2.unit2.LessonChoice.class);
            }
        });

    }

    public void openActivity(Class<?> cls){
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    public void openTextOne(View view) {
    }
}