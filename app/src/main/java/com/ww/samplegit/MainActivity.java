package com.ww.samplegit;

import android.app.AlertDialog;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP){
            Toast.makeText(this, "lollipop.. ", Toast.LENGTH_SHORT).show();
        }

        Log.d("LOG_TAG", System.currentTimeMillis() + "" );
        Log.d("LOG_TAG", "로그 추가");

    }
}
