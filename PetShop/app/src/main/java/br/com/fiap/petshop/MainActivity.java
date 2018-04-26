package br.com.fiap.petshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rdgRaca;
    CheckBox femea;
    CheckBox adestrado;
    CheckBox vacinas;
    TextView preco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdgRaca = findViewById(R.id.rdgRaca);
        femea = findViewById(R.id.femea);
        adestrado = findViewById(R.id.adestrado);
        vacinas = findViewById(R.id.vacinas);
        preco = findViewById(R.id.preco);

    }

    public void calcular(View view) {

        int selecionado = rdgRaca.getCheckedRadioButtonId();
        double soma = 0;

        switch (selecionado) {
            case R.id.rdbBorderCollie:
                soma = 800;
                break;
            case R.id.rdbPitBull:
                soma = 750;
                break;
            case R.id.rdbPastorAlemao:
                soma = 700;
                break;
            case R.id.rdbPastorCanadense:
                soma = 800;
                break;
        }

        if (femea.isChecked()) {
            soma += 180;
        }

        if (adestrado.isChecked()) {
            soma += 400;
        }

        if (vacinas.isChecked()) {
            soma += 200;
        }

        preco.setText(String.format("R$ %.2f", soma));

    }
}
