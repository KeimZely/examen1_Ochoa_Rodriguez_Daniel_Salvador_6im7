package com.example.daniel.examen1_ochoa_rodriguez_daniel_salvador_6im7;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    TextView textViewPesitos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Bundle paquetaxoRecibido = getIntent().getExtras();
        textViewPesitos = (TextView) findViewById(R.id.result);
        Double resultado = paquetaxoRecibido.getDouble("pesitos");
        textViewPesitos.setText("Resultado: " + Double.toString(resultado));

    }

    public void onClickEnviar(View vista){

        try {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_EMAIL,new String[]{"eoropezag@ipn.mx"});
            intent.putExtra(Intent.EXTRA_SUBJECT,"Examen 1er parcial");
            intent.putExtra(Intent.EXTRA_TEXT, textViewPesitos.getText().toString());

            startActivity(intent);

        }catch (Exception e) {
            Toast.makeText(this, "Error encontrado en: " + e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }
    }


}
