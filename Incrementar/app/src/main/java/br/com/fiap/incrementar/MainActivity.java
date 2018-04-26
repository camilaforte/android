package br.com.fiap.incrementar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView txtNumero;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNumero = findViewById(R.id.numero);
    }

    public void somar(View view) {
        if (count < 10) {
            count++;
            txtNumero.setText(String.valueOf(count));
        } else {
            Toast.makeText(this, "Não pode incrementar mais que 10.", Toast.LENGTH_SHORT).show();
        }
    }


    public void subtrair(View view) {
        if (count > 0) {
            count--;
            txtNumero.setText(String.valueOf(count));
        } else {
            Toast.makeText(this, "Não pode decrementar menos que 0.", Toast.LENGTH_SHORT).show();
        }
    }

}
