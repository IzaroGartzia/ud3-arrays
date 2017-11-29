package com.izaro;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random r = new Random();


        int[][] matriz = new int [10][10];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = r.nextInt(100);


            }

        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.format("%4d", matriz[i][j]);

            }

            System.out.println();

        }


    }
}
