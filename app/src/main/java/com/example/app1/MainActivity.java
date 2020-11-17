package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    Button btn;
    EditText edt;
    static String EXTRA_MESSAGE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button)findViewById(R.id.send);
        edt= (EditText) findViewById(R.id.text1);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Second.EXTRA_MESSAGE1);

        edt.setText(message);


    }


    public void Send(View view) {

        Intent intent = new Intent(this, Second.class);
        String message = edt.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
}}
