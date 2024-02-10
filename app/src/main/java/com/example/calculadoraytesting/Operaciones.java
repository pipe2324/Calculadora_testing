package com.example.calculadoraytesting;

public class Operaciones {
    /* creamos las operaciones respectivas para hacer los testings respectivos*/
    public double calcularSuma(double num1, double num2){
        return  num1+num2;
    }
    public double calcularResta(double num1, double num2){
        return  num1-num2;
    }
    public double calcularMultiplicacion(double num1, double num2){
        return  num1*num2;
    }
    public double calcularDivicion(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new IllegalArgumentException("No se puede dividir por cero");
        }
    }
}
