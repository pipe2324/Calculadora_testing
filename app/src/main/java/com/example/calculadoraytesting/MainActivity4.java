package com.example.calculadoraytesting;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity4 extends AppCompatActivity {
    /* unicializamos nuestras variables las que vamos a llamar y utilizar en nuestra calculadora */
    private Intent intent;
    private Button buttonatras, buttonsiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        /* llamamos las variables por medio del id que les otorgamos en el  activity main*/
        buttonatras=findViewById(R.id.buttonatras3);
        buttonsiguiente=findViewById(R.id.buttonsiguiente3);

        /*llamamos a cada boton para que aldarle click llama al respectivo intent que me dirige a otra intefaz o activity_main */
        buttonatras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity3.class);
                startActivity(intent);
            }
        });
        buttonsiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

    }
}