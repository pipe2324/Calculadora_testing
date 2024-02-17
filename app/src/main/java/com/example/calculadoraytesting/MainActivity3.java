package com.example.calculadoraytesting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity3 extends AppCompatActivity {
    /* unicializamos nuestras variables las que vamos a llamar y utilizar en nuestra calculadora */
private Intent intent;
private Button buttonatras, buttonsiguiente;
private ImageView tips;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        /* llamamos las variables por medio del id que les otorgamos en el  activity main*/
        buttonatras=findViewById(R.id.buttonatras2);
        buttonsiguiente=findViewById(R.id.buttonsiguiente2);

        /*llamamos a cada boton para que aldarle click llama al respectivo intent que me dirige a otra intefaz o activity_main */
        buttonatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity2.class);
                startActivity(intent);
            }
        });
        buttonsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity4.class);
                startActivity(intent);
            }
        });
    }


}