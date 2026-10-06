package com.example.demo;

public class Main {

    public static void main (String [] args) {

        System.out.println("Hola mundo");
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.sumar(3,2);

        System.out.println("El resultado es: "+resultado );

    }
}
