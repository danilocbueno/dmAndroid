package br.edu.ufscar.tmandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by danilocbueno on 22/02/17.
 */

public class LoginActivity extends Activity {

    private EditText usuario;
    private EditText senha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        //encontrar elementos de tela
        usuario = (EditText) findViewById(R.id.usuario);
        senha = (EditText) findViewById(R.id.senha);
    }

    public void entrarOnClick(View v){
        String usuarioInformado = usuario.getText().toString();
        String senhaInformada = senha.getText().toString();

        if("admin".equals(usuarioInformado) && "123".equals(senhaInformada)) {
            //sucesso
        }else {
            //fracasso
            Toast toast = Toast.makeText(this, "Usuário ou senha inválidos", Toast.LENGTH_SHORT);
            toast.show();
        }
    }
}
