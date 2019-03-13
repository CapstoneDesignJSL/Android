package com.example.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.activity.Login;

public class Register extends AppCompatActivity {

//    패스워드 입력하는 화면으로 넘어감
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Button btn_register_2 =(Button) findViewById(R.id.btn_register_2);
        btn_register_2.setOnClickListener(new Button.OnClickListener()
                                          {
                                              @Override
                                              public void onClick(View v)
                                              {
                                                  Intent intent = new Intent(getApplicationContext(), Register_password.class);
                                                  startActivity(intent);
                                              }
                                          }

        );
    }
}
