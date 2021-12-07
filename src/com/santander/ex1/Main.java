package com.santander.ex1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanValor = new Scanner(System.in);

        System.out.print("Insira o 1º valor: ");
        int valorA = scanValor.nextInt();

        System.out.print("Insira o 2º valor: ");
        int valorB = scanValor.nextInt();

        int soma = adicao(valorA, valorB);
        int subt = subtracao(valorA, valorB);
        int multi = multiplicacao(valorA, valorB);
        int divi = divisao(valorA, valorB);

        System.out.printf("Operações de %s e %s. \nSoma: %s.\nSubtração: %s.\nMultiplicação: %s.\nDivisão: %s.", valorA, valorA, soma, subt, multi, divi);

    }

    public static Integer adicao(int valorA, int valorB) {
        int soma = valorA + valorB;
        return soma;
    }

    public static Integer subtracao(int valorA, int valorB) {
        int subt = valorA - valorB;
        return subt;
    }

    public static Integer multiplicacao(int valorA, int valorB) {
        int mult = valorA * valorB;
        return mult;
    }

    public static Integer divisao(int valorA, int valorB) {
        int divi = valorA / valorB;
        return divi;
    }

}
