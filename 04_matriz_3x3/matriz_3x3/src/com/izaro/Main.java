package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] matriz = new int[3][3];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("Escribe los números para meterlos en la matriz:");
                matriz[i][j] = Integer.parseInt(br.readLine());

            }

        }
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                System.out.format("%4d", matriz[j][k]);
            }
            System.out.println();

        }


    }
}
