package com.example.comunicacionactividades;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Verificar extends Activity {

    private Bundle extras;
    private String nombre;
    private TextView salida;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verificar);

        extras = getIntent().getExtras();
        nombre = extras.getString("nombre");
        salida = (TextView) findViewById(R.id.salida);

        salida.setText("Hola " + nombre + ", ¿Acepta las condiciones?");
    }

    public void pulsarAceptar(View view) {
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }

    public void pulsarCancelar(View view) {
        Intent intent = new Intent();
        setResult(RESULT_CANCELED, intent);
        finish();
    }
}
