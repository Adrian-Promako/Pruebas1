package com.example.demo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    @Test
    void deberiaSumarDosNumerosCorrectamente(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        // Act
        int resultado = calculadora.sumar(2, 10);
        // Assert
        assertEquals(12,resultado);
    }
 }
