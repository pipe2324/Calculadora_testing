package com.example.calculadoraytesting;

import junit.framework.TestCase;

public class FiboandFactTest extends TestCase {
    private FiboandFact fiboandFact;
    @Override
    protected void setUp() throws Exception {
        super.setUp();
        fiboandFact  =new FiboandFact();
    }

/* hacemos el respectivo testing de las operaciones de finonacci y factorial en este caso nos quedo bien*/
    public void testCalcularFactorial() {
        try {
            fiboandFact.calcularFactorial(5);

        } catch (IllegalArgumentException e) {
            // Éxito: Se lanzó la excepción esperada.
        }
    }

    public void testCalcularFibonacci() {
        try {
            fiboandFact.calcularFibonacci(6);
        } catch (IllegalArgumentException e) {
            // Éxito: Se lanzó la excepción esperada.
        }
    }
}