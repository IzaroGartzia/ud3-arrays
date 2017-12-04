package com.izaro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {

    // FUNCION: VISUALIZAR EL TABLERO
    public static void visualizarTablero(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.format("%3d", matriz[i][j]);

            }
            System.out.println();
        }

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // INICIALIZAR EL TABLERO CON EL Nº 5
        int[][] tablero = new int[3][3];
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j] = 5;

            }
        }
        visualizarTablero(tablero);

        int i = 5;
        int j = 5;
        int vuelta = 0;
        int respuesta = 0;
        System.out.println("¡TRES EN RAYA! Comienza el primer jugador. ¡Ánimo!");
    int ganador ;

       do {

        do {
            System.out.println("Escribe la fila: ");
            i = Integer.parseInt(br.readLine());

            System.out.println("Escribe la columnna: ");
            j = Integer.parseInt(br.readLine());

            if(tablero[i][j] != 5)
            {
                System.out.println("Ocupado, prueba otra vez.");
            }


        } while(tablero[i][j] != 5);
           tablero[i][j] = respuesta;
           visualizarTablero(tablero);


            if (respuesta == 0)
            {
                respuesta = 1;
                System.out.println("Turno del segundo jugador.");
            }
            else
            {
                respuesta = 0;
                System.out.println("Turno del primer jugador.");
            }
           ganador = comprobarganador(tablero);
            vuelta +=1;


        }while(vuelta < 9 && ganador == -1);


    } public static int comprobarganador ( int[][] tablero){

       int ganador = -1;
        if(tablero[0][0] == 0 && tablero[0][1] == 0 && tablero[0][2] == 0)
        {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }
        if(tablero[1][0] == 0 && tablero[1][1] == 0 && tablero[1][2] == 0)
        {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }

        if(tablero[2][0] == 0 && tablero[2][1] == 0 && tablero[2][2] == 0)
        {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }

        if(tablero[0][0] == 0 && tablero[1][0] == 0 && tablero[2][0] == 0)
        {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }

        if(tablero[0][1] == 0 && tablero[1][1] == 0 && tablero[2][1] == 0)
        {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }

        if(tablero[0][2] == 0 && tablero[1][2] == 0 && tablero[2][2] == 0)
        {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }

        if(tablero[0][0] == 0 && tablero [1][1] == 0 && tablero[2][2] == 0)
        {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }

        if(tablero[0][2] == 0 && tablero [1][1] == 0 && tablero[2][0] == 0) {
            System.out.println("¡El jugador 1 ha ganado!");
            ganador = 0;
        }

        if(tablero[0][0] == 1 && tablero[0][1] == 1 && tablero[0][2] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
        if(tablero[1][0] == 1 && tablero[1][1] == 1 && tablero[1][2] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
        if(tablero[2][0] == 1 && tablero[2][1] == 1 && tablero[2][2] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
        if(tablero[0][0] == 1 && tablero[1][0] == 1 && tablero[2][0] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
        if(tablero[0][1] == 1 && tablero[1][1] == 1 && tablero[2][1] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
        if(tablero[0][2] == 1 && tablero[1][2] == 1 && tablero[2][2] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
        if(tablero[0][0] == 1 && tablero [1][1] == 1 && tablero[2][2] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
        if(tablero[0][2] == 1 && tablero [1][1] == 1 && tablero[2][0] == 1)
        {
            System.out.println("¡El jugador 2 ha ganado!");
            ganador = 1;
        }
    return ganador;
    }
}

