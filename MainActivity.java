package edu.dtcc.cis282student.lifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.v("Matt", "onCreate");

        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();

    }


    @Override
     protected void onStart() {
        super.onStart();
         Log.v("Matt", "onStart");
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
    }



    @Override
    protected void onResume(){
        super.onResume();
        Log.v("Matt", "onREsume");
        Toast.makeText(getApplicationContext(), "onREsume", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v("Matt", "onREstart");
        Toast.makeText(getApplicationContext(), "onREstart", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("Matt", "onPause");
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("Matt", "onStop");
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("Matt", "onDestroy");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();

    }

}
