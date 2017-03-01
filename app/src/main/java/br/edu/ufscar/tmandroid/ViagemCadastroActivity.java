package br.edu.ufscar.tmandroid;

import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by danilocbueno on 22/02/17.
 */

public class ViagemCadastroActivity extends Activity {

    private EditText destino;
    private EditText orcamento;

    private DatabaseHelper helper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.viagem_cadastro);

        this.destino = (EditText) findViewById(R.id.destino);
        this.orcamento = (EditText) findViewById(R.id.orcamento);

        this.helper = new DatabaseHelper(this);
    }

    public void cadastrarViagem(View v) {

        SQLiteDatabase db = this.helper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("destino", destino.getText().toString());
        values.put("orcamento", orcamento.getText().toString());

        long resultado = db.insert("viagem", null, values);
        if(resultado != -1) {
            Toast.makeText(this, "Inserido com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Erro ao salvar o registro!", Toast.LENGTH_SHORT).show();
        }



    }

}
