package br.edu.ufscar.tmandroid;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by danilocbueno on 21/02/17.
 */

public class SaudacaoActivity extends Activity {

    public static final String EXTRA_NOME_USUARIO = "tmandroid.EXTRA_NOME_USUARIO";

    public static final String ACAO_EXIBIR_SAUDACAO =  "tmandroid.ACAO_EXIBIR_SAUDACAO";
    public static final String CATEGORIA_EXIBIR_SAUDACAO =  "tmandroid.CATEGORIA_EXIBIR_SAUDACAO";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.saudacao);

        //recuperando a referênca do TextView saudacao
        TextView saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);

        //verificando
        Intent intent = getIntent();
        if(intent.hasExtra(EXTRA_NOME_USUARIO)){
            String intentStringExtra = intent.getStringExtra(EXTRA_NOME_USUARIO);
            saudacaoTextView.setText(intentStringExtra);
        } else {
            saudacaoTextView.setText("o nome de usuário não foi informado");
        }
    }
}
