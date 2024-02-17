package com.example.calculadoraytesting;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    /* unicializamos nuestras variables las que vamos a llamar y utilizar en nuestra calculadora */
    private Intent intent;
    private Button buttonatras, buttonsiguiente;
    private TextView textView5,textView6;
    private ImageView calculadora;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        /* llamamos las variables por medio del id que les otorgamos en el  activity main*/
        buttonatras=findViewById(R.id.buttonatras1);
        buttonsiguiente=findViewById(R.id.buttonsiguiente1);

        /*llamamos a cada boton para que aldarle click llama al respectivo intent que me dirige a otra intefaz o activity_main */
        buttonatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
        buttonsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
    }
}




