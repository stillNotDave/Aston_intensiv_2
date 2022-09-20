package ru.sfedu.aston2.unit1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import ru.sfedu.aston2.R;

public class Lesson3 extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;
    Button buttonToast, buttonCount, buttonPutZero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit1_lesson2);
        //setContentView(R.layout.activity_unit1_lesson2);

        buttonToast = findViewById(R.id.button_toast);
        buttonToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast();
            }
        });

        buttonCount = findViewById(R.id.button_count);
        buttonCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                countUp();
                checkCount();
            }
        });

        mShowCount = findViewById(R.id.show_count);

        buttonPutZero = findViewById(R.id.button_put_zero);
        buttonPutZero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                putZero();
                //Серая изначально
                //При первом нажатии желтая - кнопка готова к использованию
                //При четности - purple_500
                //При нечетности - purple_200
            }
        });


    }
    public void showToast(){
        Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT).show();
    }

    public void countUp(){
        mCount++;
        if(mShowCount != null){
            mShowCount.setText(Integer.toString(mCount));
        }

    }

    public void putZero(){
        mShowCount.setText(Integer.toString(0));
        mCount = 0;
        // Сброс цвета
        buttonPutZero.setBackgroundColor(getResources().getColor(R.color.light_gray));
    }

    public void checkCount(){
        // Если Count был нажат 1 раз, меняем цвет кнопки Zero чтобы показать, что она активна
        if(mCount==1){
            buttonPutZero.setBackgroundColor(getResources().getColor(R.color.yellow));
        }
        // Меняем цвет кнопки Zero в зависимости от четности Count
        else if(mCount%2 == 0){
            buttonPutZero.setBackgroundColor(getResources().getColor(R.color.purple_500));
        }
        else{
            buttonPutZero.setBackgroundColor(getResources().getColor(R.color.purple_200));
        }
    }

    public void openActivity(Class<?> cls){
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

}