package com.udacity.gradle.builditbigger.free;

import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.util.Pair;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.JokeSmith;
import com.example.allu.myapplication.backend.myApi.MyApi;
import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.udacity.gradle.builditbigger.R;

import java.io.IOException;


public class MainActivity extends ActionBarActivity {
    JokeSmith jokeSmith;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Free","yes");
        jokeSmith=new JokeSmith();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void tellJoke(View view) {
        Toast.makeText(this, jokeSmith.getJokes()+"alluuuu", Toast.LENGTH_SHORT).show();
    }

    public void Intentjoke(View view){
        Intent i=new Intent(MainActivity.this, com.example.androidjokeslib.JokeActivity.class);
        i.putExtra("joke",jokeSmith.getJokes());
        startActivity(i);
    }

    public void GCPbackend(View view){
        new EndPointsAsyncTask(this).execute(new Pair<Context, String>(this,"Allu"));

    }



}
