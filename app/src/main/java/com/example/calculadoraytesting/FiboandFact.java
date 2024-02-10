package com.example.calculadoraytesting;

public class FiboandFact {
    public double calcularFactorial(double num1) {

        if (num1 == 0) {
            return 1;
        } else {
            return num1 * calcularFactorial(num1 - 1);
        }
    }
    public  double calcularFibonacci(double num1){

        if (num1 <= 2) {
            return 1;
        } else {
            return calcularFibonacci(num1 - 1) + calcularFibonacci(num1 - 2);
        }
    }
}

