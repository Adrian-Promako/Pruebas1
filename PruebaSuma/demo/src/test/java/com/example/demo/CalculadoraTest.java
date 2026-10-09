package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {

    @Test void testSumarDosNumeros() {
        // 1. Arrange, preparamos los valores de las variables.
        Calculadora calculo1 = new Calculadora();
        int numero1 = 3;
        int numero2 = 7;
        int resultadoEsperado = 10;
        // 2. ACT
        int resultadoFinal = calculo1.sumar(numero1,numero2);

        //logica del calculo

        int resultadoActual = 5 + 5;

        // Assert del resultado
        assertEquals(resultadoFinal, resultadoActual, "La suma deberia ser 10 !!!");
    }

}
