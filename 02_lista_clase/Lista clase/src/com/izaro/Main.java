package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String respuesta = "";

        System.out.println("¿Cuántos alumnos hay en clase?");
        int num = Integer.parseInt(br.readLine());

        String[] lista;
        lista = new String[num];

        for (int i = 0; i < lista.length; i++) {
            System.out.println("Escribe el nombre y el apellido del alumno: ");
            lista[i] = br.readLine();


        }

        do {
            if (!respuesta.equalsIgnoreCase("FIN")) {
                System.out.println("¿Qué usuario quieres buscar? Escribe su primera letra, por favor.");
                respuesta = br.readLine();

                for (int i = 0; i < lista.length; i++) {
                    char letra = lista[i].charAt(0);

                    if (letra == respuesta.charAt(0)) {
                        System.out.println(lista[i]);
                    }
                }


            }

        }
        while (!respuesta.equalsIgnoreCase("FIN"));

        if (respuesta.equalsIgnoreCase("FIN")) {
            System.out.println("El programa ha terminado.");
        }


    }
}
