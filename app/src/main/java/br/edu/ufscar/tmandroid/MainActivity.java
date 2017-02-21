package br.edu.ufscar.tmandroid;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.File;

/**
 * Created by danilocbueno on 09/02/17.
 */

public class MainActivity extends Activity {

    //variaveis para os elementos da view
    private EditText nomeEditText;
    private TextView saudacaoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //referenciando os elementos
        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
    }

    public void surpreenderUsuario(View v) {
        Editable texto = this.nomeEditText.getText();

        Intent intent = new Intent(SaudacaoActivity.ACAO_EXIBIR_SAUDACAO);
        intent.addCategory(SaudacaoActivity.CATEGORIA_EXIBIR_SAUDACAO);
        intent.putExtra(SaudacaoActivity.EXTRA_NOME_USUARIO, texto.toString());
        startActivity(intent);
    }

    public void abrirNavegador(View v) {
        Uri	uri	=	Uri.parse("http://www.android.com");
        Intent	intent	=	new	Intent(Intent.ACTION_VIEW,	uri);
        startActivity(intent);
    }

    public void tirarFoto(View v) {
        Uri uri = Uri.fromFile(new File("/sdcard/hello.jpg"));
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        intent.putExtra(MediaStore.EXTRA_OUTPUT, uri);
        startActivity(intent);
    }
}
