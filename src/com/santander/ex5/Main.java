package com.santander.ex5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entradaMedida = new Scanner(System.in);
        System.out.print("Digite a medida em polegadas: ");
        double polegadas = entradaMedida.nextDouble();
        final double FATOR_CM = 2.45;
        double medidaConvertida = conversor(polegadas, FATOR_CM);

        System.out.printf("%s pol equivale a %s cm", polegadas, medidaConvertida);

    }
    public static double conversor(double cm, double pol){
        double medidaConvertida = cm * pol;
        return medidaConvertida;
    }
}


//1cm = 2,5pol