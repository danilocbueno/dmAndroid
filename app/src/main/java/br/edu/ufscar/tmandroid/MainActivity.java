package br.edu.ufscar.tmandroid;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        this.saudacaoTextView.setText(texto);

    }
}
