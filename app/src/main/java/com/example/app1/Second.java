package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Second extends AppCompatActivity {
    static String EXTRA_MESSAGE1;
    EditText tst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tst =(EditText) findViewById(R.id.secondtv);



        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        tst.setText(message);




    }


    public void Sendone(View view) {

        Intent intent = new Intent(this, MainActivity.class);
        String message = tst.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message);
        startActivity(intent);
    }


}
