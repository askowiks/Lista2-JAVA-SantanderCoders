package com.santander.ex4;

import java.util.Scanner;
import java.text.NumberFormat;


public class Main {
   public static void main(String[] args) {
       Scanner entradaValor = new Scanner(System.in);
       System.out.print("Informe a cotação atual do Dolar: ");
       double cotacaoDolar = Double.parseDouble(entradaValor.nextLine());
       System.out.print("Informe o valor em Real(BRL): ");
       double valorBrl = Double.parseDouble(entradaValor.nextLine());

       double conversao = conversorMoeda(cotacaoDolar, valorBrl);

       System.out.printf("Cotação do Dolar: $ %s.\nValor em BRL: R$ %s.\nCâmbio: R$ %s.", cotacaoDolar, valorBrl, conversao);

    }

    public static double conversorMoeda(double cotacaoDolar, double valorReal){
       double resultado = valorReal / cotacaoDolar;
       return resultado;
    }

}
