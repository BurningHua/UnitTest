package com.example.unittest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String msg;
    private EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt = findViewById(R.id.editText);





    }

    public void btn_onclick(View view){
        //Intent intent = new Intent();
        //intent.setClass(this,SecondActivity.class);
        //startActivity(intent);
        msg = edt.getText().toString();
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();

    }


}
