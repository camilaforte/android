package br.com.forte.dialogs;

import android.app.DatePickerDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abrirAlertDialog(View view) {

        //cai na prova
        //chamando a classe alertDialog
        //importar o pacote support
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        //um titulo para a msg e alt+enter extrair a msg
        builder.setTitle(R.string.importante);
        //a msg alt+anter extrair msg
        builder.setMessage(R.string.vc_deseja_excluir_o_registro);
        //botao positivo (parametros texto (extrair) e evento (criar um onClicklistener())
        builder.setPositiveButton(getString(R.string.sim), new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                //logica do botao positivo
                Toast.makeText(MainActivity.this, R.string.excluido, Toast.LENGTH_SHORT).show();
            }
        });
        //botao negativo
        builder.setNegativeButton(getString(R.string.nao), null);
        //aparecer
        builder.show();

    }

    public void abrirProgreDialog(View view) {
        //criar um objeto porgress dialog
        ProgressDialog pd = new ProgressDialog(this);
        //colocar titulo
        //antes de extrair pd.setTitle("Aguarde!");
        pd.setTitle(getString(R.string.aguarde));
        //msg
        //antes de extrair pd.setMessage("Estamos processando seus dados. =)");
        pd.setMessage(getString(R.string.processando));
        //mostrar
        pd.show();
    }


    public void abrirDatePickerDialog(View view) {
        //objeto (com mais parametro crtl+p new OnDateSetPicker (com tres parametros ano, mes, dia)
        DatePickerDialog dpd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                Toast.makeText(MainActivity.this, dayOfMonth + "/" + month + "/" + year, Toast.LENGTH_SHORT).show();
            }
        }, 2018, 5 - 1, 10);

        dpd.show();
    }
}
