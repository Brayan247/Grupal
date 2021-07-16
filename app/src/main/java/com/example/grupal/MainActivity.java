package com.example.grupal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private Button Avanzar;
    private EditText txtLimite;
    private EditText txtNumeroAdivinar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Avanzar=(Button)findViewById(R.id.PasarPAntallaInicial);
        txtLimite = (EditText) findViewById(R.id.txtLimite);
        txtNumeroAdivinar = (EditText) findViewById(R.id.txtNumeroAdivinar);

    }

    public int numeroAleatorio( int a){
        Random numale = new Random();
        int n = numale.nextInt();
        return a;
    }

    public void verificar(){
        try {
            int numtxt = Integer.valueOf(txtNumeroAdivinar.getText().toString());
            int limite = Integer.valueOf(txtLimite.getText().toString());
            int txtnumAleatorio = numeroAleatorio(limite);
            if(numtxt==txtnumAleatorio){
               Toast.makeText(this,"Ganaste eres un Crack", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(this, "Perdiste, el numero Correcto es : "+txtnumAleatorio, Toast.LENGTH_LONG).show();
            }
        }catch (NumberFormatException e){
        }
    }

    public String verificarrespuesta(){
        try {
            int numtxt = Integer.valueOf(txtNumeroAdivinar.getText().toString());
            int limite = Integer.valueOf(txtLimite.getText().toString());
            int txtnumAleatorio = numeroAleatorio(limite);
            if(numtxt==txtnumAleatorio){
                String ganaste= "Ganaste eres un Crack";
                return ganaste;
            }else{
                String perdiste= "Perdiste, el numero Correcto es :" +txtnumAleatorio;
                return perdiste;
            }
        }catch (NumberFormatException e){

        }
          return "Hubo algun error";
    }

    @Override
    public void onClick(View v) {
        if(v==Avanzar){
            if(txtLimite.getText().toString().isEmpty()) {
                txtLimite.setError("Escriba un número");
            }else {
                if (txtNumeroAdivinar.getText().toString().isEmpty()) {
                    txtNumeroAdivinar.setError("Escriba un numero");
                } else {
                    try{
                        int numtxt = Integer.valueOf(txtNumeroAdivinar.getText().toString());
                        int limite = Integer.valueOf(txtLimite.getText().toString());
                        if (numtxt > limite) {
                            txtNumeroAdivinar.setError("Ingrese un numero dentro del rango");
                        } else {
                            /*Avanzar.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {
                                    Intent i = new Intent(MainActivity.this, PantallaInicial.class);
                                    startActivity(i);
                                }
                            });*/
                            verificar();
                        }
                    }catch (NumberFormatException e) {

                    }
                }
            }
      }
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

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }


}