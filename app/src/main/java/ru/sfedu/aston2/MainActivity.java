package ru.sfedu.aston2;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button buttonNext;
    private final Context context = this;
    private long backPressedTime;
    private Toast backToast;

    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(getString(R.string.main_activity), getString(R.string.hello_world));
//        Log.d(LOG_TAG, "-------");
//        Log.d(LOG_TAG, "onCreate");

        buttonNext = findViewById(R.id.buttonNext);
        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity(UnitChoice.class);

            }
        });
    }

    public void openActivity(Class<?> cls) {
        Intent intent = new Intent(this, cls);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed() {
        if (backPressedTime + 2000 > System.currentTimeMillis()) {
            backToast.cancel();
            super.onBackPressed();
            return;
        } else {
            backToast = Toast.makeText(getBaseContext(), R.string.back_toast, Toast.LENGTH_SHORT);
            backToast.show();
        }
        backPressedTime = System.currentTimeMillis();
    }
//    @Override
//    public void onStart(){
//        super.onStart();
//        Log.d(LOG_TAG, "onStart");
//    }
//
//    @Override
//    protected void onDestroy() {
//        super.onDestroy();
//        Log.d(LOG_TAG, "onDestroy");
//    }
//    @Override
//    protected void onRestart(){
//        super.onRestart();
//        Log.d(LOG_TAG, "onRestart");
//    }
//    @Override
//    protected void onPause(){
//        super.onPause();
//        Log.d(LOG_TAG, "onPause");
//    }
//    @Override
//    protected void onResume(){
//        super.onResume();
//        Log.d(LOG_TAG, "onResume");
//    }
//    @Override
//    protected void onStop(){
//        super.onStop();
//        Log.d(LOG_TAG, "onStop");
//    }
}