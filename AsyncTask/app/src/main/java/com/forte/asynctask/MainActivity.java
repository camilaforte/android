package com.forte.asynctask;

import android.app.ProgressDialog;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.InputStream;
import java.net.URL;

public class MainActivity extends AppCompatActivity {

    ImageView imgBaixada;
    ProgressDialog progressDialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgBaixada = findViewById(R.id.imgBaixada);

    }

    public void download(View view) {

        //criei a classe Download agora devo chama-la
        DownloadAsynkTask dat = new DownloadAsynkTask();
        dat.execute("https://www.douglascabral.com.br/aula-api/img/01.png");



    }

    //criar classe privada
    //Bitmap classe que cuida das imagens
    private class DownloadAsynkTask extends AsyncTask<String, Void, Bitmap>{

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            progressDialog = ProgressDialog.show(MainActivity.this, "Aguarde...", "O download está sendo efetuado!" );
        }

        @Override
        protected Bitmap doInBackground(String... strings) {
            try {
                InputStream input;          //vou trabalhar com entrada de arquivo
                Bitmap imagem;              //neste caso uma imagem
                URL endereco = new URL(strings[0]);     //preciso da URL da imagem
                input = endereco.openStream();
                imagem = BitmapFactory.decodeStream(input);

                input.close();              //se open, close
                return imagem;

            }catch (Exception t){
                t.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            super.onPostExecute(bitmap);

            if(bitmap != null){
                imgBaixada.setImageBitmap(bitmap);
            }
            //fecha o dialog
            progressDialog.dismiss();

        }
    }
}
