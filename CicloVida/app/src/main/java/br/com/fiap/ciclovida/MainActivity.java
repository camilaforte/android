package br.com.fiap.ciclovida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("TDSS", "Passei pelo onCreat");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("TDSS", "Passei pelo onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("TDSS", "Passei pelo onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("TDSS", "Passei pelo onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("TDSS", "Passei pelo onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("TDSS", "Passei pelo onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("TDSS", "Passei pelo onDestroy");
    }


}
