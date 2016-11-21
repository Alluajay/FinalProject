package com.example.androidjokeslib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    TextView joketext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);

        String joke=getIntent().getStringExtra("joke");
        joketext=(TextView)findViewById(R.id.joketxt12);
        joketext.setText(joke);
    }
}
