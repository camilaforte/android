package br.com.fiap.radioecheckbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chkEstouAprendendo;
    RadioGroup rdgDificuldade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        chkEstouAprendendo = findViewById(R.id.chkEstouAprendendo);
        rdgDificuldade = findViewById(R.id.rdgDificuldade);
    }

    public void salvar(View view) {
        boolean chkChecked = chkEstouAprendendo.isChecked();

        Toast.makeText(this, "Estou aprendendo Android? " + chkChecked,
                Toast.LENGTH_LONG).show();

        String msg = "";
        int selecionado = rdgDificuldade.getCheckedRadioButtonId();

        switch (selecionado) {
            case R.id.rdbFacil:
                msg = "Você selecionou o fácil";
                break;
            case R.id.rdbMedio:
                msg = "Você selecionou o médio";
                break;
            case R.id.rdbDificil:
                msg = "Você selecionou o difícil";
                break;
        }

        Toast.makeText(this, msg, Toast.LENGTH_LONG).show();

    }

}
