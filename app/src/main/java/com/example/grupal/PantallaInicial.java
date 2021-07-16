package com.example.grupal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.example.grupal.MainActivity;


public class PantallaInicial extends AppCompatActivity{
    private Button Regresar;
    private TextView txtRespuesta;
    private MainActivity mainactivity;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pantalla_inicial);
        txtRespuesta = (TextView) findViewById(R.id.txtRespuesta) ;
        Regresar=(Button)findViewById(R.id.RegresarMainmenu);
        txtRespuesta.setText(mainactivity.verificarrespuesta());
        txtRespuesta.setText(mainactivity.verificarrespuesta());
        Regresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PantallaInicial.this, MainActivity.class);
                startActivity(i);
            }
            }
        );
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {

        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }
}
