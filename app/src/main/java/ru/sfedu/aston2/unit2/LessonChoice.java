package ru.sfedu.aston2.unit2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;
import ru.sfedu.aston2.UnitChoice;

public class LessonChoice extends AppCompatActivity {

    Button buttonBack, buttonLesson21, buttonCodingChallenge21, buttonHomework21, buttonLesson22, buttonHomework22, buttonLesson23;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_choice2);

        buttonBack = findViewById(R.id.button_back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(UnitChoice.class);
            }
        });

        buttonLesson21 = findViewById(R.id.button_lesson_2_1);
        buttonLesson21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson1.class);
            }
        });

        buttonCodingChallenge21 = findViewById(R.id.coding_challenge2_1);
        buttonCodingChallenge21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(CodingChallengeLesson1.class);
            }
        });

        buttonHomework21 = findViewById(R.id.lesson_2_1_hw);
        buttonHomework21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Homework21.class);
            }
        });

        buttonLesson22 = findViewById(R.id.button_lesson_2_2);
        buttonLesson22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson2.class);
            }
        });

        buttonHomework22 = findViewById(R.id.lesson_2_2_hw);
        buttonHomework22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Homework22.class);
            }
        });

        buttonLesson23 = findViewById(R.id.button_lesson_2_3);
        buttonLesson23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(Lesson3.class);
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