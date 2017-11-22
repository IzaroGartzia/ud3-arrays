package com.izaro;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Double.MAX_VALUE;
import static java.lang.Double.MIN_VALUE;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double[] temperatura;
        double max = MIN_VALUE;
        double minimo = MAX_VALUE;
        double total = 0;
        double media = 0;

        temperatura = new double[24];

        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Escribe la temperatura hora por hora: ");
            temperatura[i] = Double.parseDouble(br.readLine());
            if (temperatura[i] > max)
                max = temperatura[i];
            if (temperatura[i] < minimo)
                minimo = temperatura[i];
            total += temperatura[i];


        }
        media = total / 24;

        for (int num = 0; num < temperatura.length; num++) {
            System.out.print(num + "  ");


            for (int ast = 0; ast < temperatura[num]; ast++) {
                System.out.print("*");
            }
            System.out.print(temperatura[num]);
            if (temperatura[num] == max)
                System.out.print("----> MAX");
            if (temperatura[num] == minimo)
                System.out.println("----->MIN");
            System.out.println();

        }
        System.out.println(media);


    }


}

