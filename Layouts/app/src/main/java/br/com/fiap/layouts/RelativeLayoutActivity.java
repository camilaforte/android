package br.com.fiap.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class RelativeLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
    }

    public void sair(View view) {
        finish(); //fecha a activity atual e exibe a que esta "embaixo" (as activitys funcionam com a ideia de pilha)
    }

}
