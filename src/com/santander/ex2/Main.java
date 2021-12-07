package com.santander.ex2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanValor = new Scanner(System.in);

        System.out.print("Insira o número: ");
        int numero = scanValor.nextInt();
        int resultado = 0;

        for (int indice = 1; indice <= 10; indice++){
            resultado = numero * indice;
            System.out.println(numero + " X " + indice + " = " + resultado);
        }

    }
}
