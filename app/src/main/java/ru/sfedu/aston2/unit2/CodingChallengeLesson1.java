package ru.sfedu.aston2.unit2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import ru.sfedu.aston2.R;

public class CodingChallengeLesson1 extends AppCompatActivity {

    Button buttonBack;
    public static final String EXTRA_TEXT = "ru.sfedu.aston2.unit2.extra.TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coding_challenge_lesson1);

        buttonBack = findViewById(R.id.back);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(LessonChoice.class);
            }
        });

    }

    public void openTextOne(View view) {
        Intent intent = new Intent(this, CodingChallengeActivity2.class);
        String text = getString(R.string.for_button_1);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }

    public void openTextTwo(View view) {
        Intent intent = new Intent(this, CodingChallengeActivity2.class);
        String text = getString(R.string.for_button_2);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }

    public void openTextThree(View view) {
        Intent intent = new Intent(this, CodingChallengeActivity2.class);
        String text = getString(R.string.for_button_3);
        intent.putExtra(EXTRA_TEXT, text);
        startActivity(intent);
    }

    public void openActivity(Class<?> cls){
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }
}