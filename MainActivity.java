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

        Log.v("Matt", "");

        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

    }




    @Override
     protected void onStart() {
        super.onStart();
         Log.v("Matt", "");
        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
    }




    @Override
    protected void onResume(){
        super.onResume();
        Log.v("Matt", "");
        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.v("Matt", "");
        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.v("Matt", "");
        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.v("Matt", "");
        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.v("Matt", "");
        Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();

    }

}
