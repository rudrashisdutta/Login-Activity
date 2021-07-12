package com.android.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText usern;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        usern=(EditText)findViewById(R.id.Username);
        final EditText pass=(EditText)findViewById(R.id.Password);
        Button loginb=(Button)findViewById(R.id.loginbtn);
        loginb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                click(view);
            }
        });
        loginb.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                pass.setText("");
                usern.setText("");
                return true;
            }
        });
    }
    public void click(View v){
        EditText pass=(EditText)findViewById(R.id.Password);
        Log.i("username:",usern.getText().toString());
        Log.i("password:",pass.getText().toString());
    }
}
/*
 TODO:
    Integrate with firebase
 */