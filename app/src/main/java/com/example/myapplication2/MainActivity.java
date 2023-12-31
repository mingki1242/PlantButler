package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        moveLogin(2); //2초후에 로그인 화면으로 넘어감
    }

    private void moveLogin(int sec){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //로그인 처음 화면으로 이동할 액티비티 생성
                Intent intent = new Intent(getApplicationContext(), B_LoginActivity.class);

                startActivity(intent);
                finish(); //현재 액티비티 종료
            }
        }, 1000*sec);
    }
}