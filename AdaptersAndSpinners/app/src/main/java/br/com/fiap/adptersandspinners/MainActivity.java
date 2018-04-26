package br.com.fiap.adptersandspinners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Spinner spnPaises;
    String[] paises = {
        "Angola",
        "Bulgária",
        "China",
        "Dinamarca",
        "Estônia",
        "França"
    };
    AutoCompleteTextView actEstadosBrasil;
    String[] estados = {
            "Amapá",
            "Bahia",
            "Ceará",
            "Distrito Federal",
            "Espírito Santo",
            "Goias"
    };

    DatePicker dtpDataNasc;
    TimePicker tmpHoraNasc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spnPaises = findViewById(R.id.spnPaises);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
            this,
            android.R.layout.simple_list_item_1,
            paises
        );

        spnPaises.setAdapter(adapter);
        actEstadosBrasil = findViewById(R.id.actEstadosBrasil);

        ArrayAdapter<String> adapterEstados = new ArrayAdapter<String>(
           this,
            android.R.layout.simple_list_item_1,
            estados
        );

        actEstadosBrasil.setAdapter(adapterEstados);
        dtpDataNasc = findViewById(R.id.dtpDataNasc);
        tmpHoraNasc = findViewById(R.id.tmpHoraNasc);

    }

    public void salva(View view) {
        int dia = dtpDataNasc.getDayOfMonth();
        int mes = dtpDataNasc.getMonth() + 1;
        int ano = dtpDataNasc.getYear();

        int hora = tmpHoraNasc.getCurrentHour();
        int minuto = tmpHoraNasc.getCurrentMinute();

        String msg = String.format("Você selecionou: %d/%d/%d as %d:%d", dia, mes, ano, hora, minuto);
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

}
