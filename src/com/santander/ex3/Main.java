package com.santander.ex3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Digite a temperatura em ºC: ");
        Scanner temperaturaScan = new Scanner(System.in);

        float celsius = Float.parseFloat(temperaturaScan.next());
        float tempConvertida = conversorFa(celsius);

        System.out.println(celsius + "ºC" + " corresponde a " + tempConvertida + "ºF");

    }

    public static float conversorFa(float celsius) {
        float tempFarenheit = (celsius * 1.8f) + 32;
        return tempFarenheit;
    }

}
