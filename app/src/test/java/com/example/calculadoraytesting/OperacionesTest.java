package com.example.calculadoraytesting;

import junit.framework.TestCase;

public class OperacionesTest extends TestCase {

private Operaciones operaciones;

    @Override
    protected void setUp() throws Exception {
        super.setUp();
        operaciones  = new Operaciones();
    }

    public void testCalcularSuma() {
        double resultado = operaciones.calcularSuma(8, 2);
        assertEquals(10, resultado, 0.001);
    }

    public void testCalcularResta() {
        double resultado = operaciones.calcularResta(20, 7);
        assertEquals(13, resultado, 0.001);
    }

    public void testCalcularMultiplicacion() {
        double resultado = operaciones.calcularMultiplicacion(7, 7);
        assertEquals(49, resultado, 0.001);
    }

    public void testCalcularDivision() {
        try {
            operaciones.calcularDivicion(4, 4);

        } catch (IllegalArgumentException e) {
            // Éxito: Se lanzó la excepción esperada.
        }
    }
}