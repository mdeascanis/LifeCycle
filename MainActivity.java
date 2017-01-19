package edu.dtcc.cis282student.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("Matt", "");
    }

    @Override
    protected void onStart(){
        Log.v("Matt", "");

    }

    @Override
    protected void onResume(){
        Log.v("Matt", "");

    }

    @Override
    protected void onRestart(){
        Log.v("Matt", "");

    }

    @Override
    protected void onPause(){
        Log.v("Matt", "");

    }

    @Override
    protected void onStop(){
        Log.v("Matt", "");

    }

    @Override
    protected void onDestroy(){
        Log.v("Matt", "");

    }




}
