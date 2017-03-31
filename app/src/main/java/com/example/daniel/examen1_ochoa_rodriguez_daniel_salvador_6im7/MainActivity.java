package com.example.daniel.examen1_ochoa_rodriguez_daniel_salvador_6im7;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.nio.DoubleBuffer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickConvertir (View vista){

        try {

            EditText pesitos = (EditText) findViewById(R.id.pesitos);

            Intent intent = new Intent(this, Activity2.class);
            Bundle paquetaxo = new Bundle();
            paquetaxo.putDouble("pesitos", Double.parseDouble(pesitos.getText().toString())/15);
            intent.putExtras(paquetaxo);
            this.finish();
            startActivity(intent);

        }catch (Exception e){

            Toast.makeText(this, "Error encontrado en: " + e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
        }

    }
}
