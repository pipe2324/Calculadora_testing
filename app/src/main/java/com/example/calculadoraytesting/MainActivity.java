package com.example.calculadoraytesting;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /* unicializamos nuestras variables las que vamos a llamar y utilizar en nuestra calculadora */
    private Button buttonsum, buttonres, buttonmul, buttondiv, buttonfact, buttonfibo;
    private EditText texto1, texto2;

    private TextView textviewresultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* llamamos las variables por medio del id que les otorgamos en el  activity main*/
        texto1=findViewById(R.id.texto1);
        texto2=findViewById(R.id.texto2);
        textviewresultado=findViewById(R.id.resultado);
        buttonsum=findViewById(R.id.buttonsum);
        buttonres=findViewById(R.id.buttonres);
        buttonmul=findViewById(R.id.buttonmulti);
        buttondiv=findViewById(R.id.buttondiv);
        buttonfact=findViewById(R.id.buttonfact);
        buttonfibo=findViewById(R.id.buttonfibo);

        /*llamamos a cada boton para que aldarle click llama al respectivo metodo de operacion  */
        buttonsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calcularSuma();
            }
        });
        buttonres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
calcularResta();
            }
        });
        buttonmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
calcularMultiplicacion();
            }
        });
        buttondiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
calcularDivicion();
            }
        });
        buttonfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
calcularFactorial();
            }
        });
        buttonfibo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
calcularFibonacci();
            }
        });
        /*creamos los metodos de cada operacion que sonlos que vamos a utilizar al darle onclick a cada boton de operaciones en nuestra calculadora*/
    }
    private void calcularSuma() {
        String texto = texto1.getText().toString();
        if (texto.isEmpty()) {
            textviewresultado.setText("ingresa un número en el primer y segundo campo");
            return;
        }
        double num1=Double.parseDouble(texto1.getText().toString());
        double num2=Double.parseDouble(texto2.getText().toString());
        double resultado=num1+num2;
        textviewresultado.setText(String.valueOf(resultado));

    }
    private void calcularResta() {
        String texto = texto1.getText().toString();
        if (texto.isEmpty()) {
            textviewresultado.setText("ingresa un número en el primer y segundo campo");
            return;
        }
        double num1=Double.parseDouble(texto1.getText().toString());
        double num2=Double.parseDouble(texto2.getText().toString());
        double resultado=num1-num2;
        textviewresultado.setText(String.valueOf(resultado));
    }

    private void calcularMultiplicacion() {
        String texto = texto1.getText().toString();
        if (texto.isEmpty()) {
            textviewresultado.setText("ingresa un número en el primer y segundo campo");
            return;
        }
        double num1=Double.parseDouble(texto1.getText().toString());
        double num2=Double.parseDouble(texto2.getText().toString());
        double resultado=num1*num2;
        textviewresultado.setText(String.valueOf(resultado));
    }
    private void calcularDivicion() {
        String texto = texto1.getText().toString();
        if (texto.isEmpty()) {
            textviewresultado.setText("ingresa un número en el primer y segundo campo");
            return;
        }
        double num1=Double.parseDouble(texto1.getText().toString());
        double num2=Double.parseDouble(texto2.getText().toString());
        if (num2 != 0) {
            double resultado = num1 / num2;
            textviewresultado.setText(String.valueOf(resultado));
        } else {
            textviewresultado.setText("No se puede dividir por cero");
        }
    }
    private double calcularFactorial(double n) {
         {
            if (n == 0) {
                return 1;
            } else {
                return n * calcularFactorial(n - 1);
            }
        }

    }
    private void calcularFactorial() {
        String texto = texto1.getText().toString();
        if (texto.isEmpty()) {
            textviewresultado.setText("Ingresa un número solo en el primer campo");
            return;
        }

        try {
            double num1 = Double.parseDouble(texto1.getText().toString());
            double resultado = calcularFactorial(num1);
            textviewresultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {

            textviewresultado.setText("Error: Entrada no válida");
        }
    }
    private double calcularFibonacci(double n) {
        if (n <= 2) {
            return 1;
        } else {
            return calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
        }
    }
    private void calcularFibonacci() {
        String texto = texto1.getText().toString();
        if (texto.isEmpty())
            textviewresultado.setText("Ingresa un número solo en el primer campo");
            return;
        }
        try {
            double num1 = Double.parseDouble(texto1.getText().toString());
            double resultado = calcularFibonacci(num1);
            textviewresultado.setText(String.valueOf(resultado));
        } catch (NumberFormatException e) {
            // Manejo de la excepción si el texto no puede ser convertido a double
            textviewresultado.setText("Error: Entrada no válida");
        }
    }

}