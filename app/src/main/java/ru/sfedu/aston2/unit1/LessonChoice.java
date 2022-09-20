package ru.sfedu.aston2.unit1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;
import ru.sfedu.aston2.UnitChoice;

public class LessonChoice extends AppCompatActivity {

    Button buttonBack, buttonLesson1, buttonLesson12a, buttonLesson12b,buttonLesson13, buttonLesson14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_choice);

        buttonBack = findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(UnitChoice.class);
            }
        });

        buttonLesson1 = findViewById(R.id.button_lesson_1);
        buttonLesson1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson1.class);
            }
        });

        buttonLesson12a = findViewById(R.id.button_lesson_1_2_a);
        buttonLesson12a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson2.class);
            }
        });

        buttonLesson12b = findViewById(R.id.button_lesson_1_2_b);
        buttonLesson12b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson3.class);
            }
        });

        buttonLesson13 = findViewById(R.id.button_lesson_1_3);
        buttonLesson13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson4.class);
            }
        });

        buttonLesson14 = findViewById(R.id.button_lesson_1_4);
        buttonLesson14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson5.class);
            }
        });

    }

    public void openActivity(Class<?> cls){
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}