package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Ciclo For sirve para repetir un bloque de codigo n cantidad de veces
        /* for(contador = 0; contador < numero; contador++) {
            codigo que se repite
        } */

        //Scanner sc= new Scanner(System.in);
        //System.out.println("Ingresa un numero");
        //int numero = sc.nextInt();

        //for(int i = 1; i <=10; i++) {

            //if ( i%2 == 0) {
                // Pasa a la siguiente iteracion sin terminar de ejecutar el codigo de abajo
                //continue;
            //}

            //System.out.println(numero + " x " + i + " = " + (numero*i));

          //  if( i == 8) {
                // Se utiliza para detener el ciclo
                //break;
            //}

        //}
        // Ciclo While
        /* Scanner sc = new Scanner(System.in);
        System.out.println("Adivina el numero secreto. Ingresa un numero");
        int numero = sc.nextInt();
        int numeroSecreto = 33;

        while(numero != numeroSecreto) {
            System.out.println("Adivina el numero secreto. Ingresa un numero");
            numero = sc.nextInt();
        }
        sc.close();
        System.out.println("Felicidades adivinaste el numero secrero"); */

        // Ciclo doWhile
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int numeroSecreto = 33;

        do {
            System.out.println("Adivina el numero secreto. Ingresa un numero");
            numero = sc.nextInt();
        } while (numero != numeroSecreto);

        sc.close();
        System.out.println("Felicidades adivinaste el numero secrero");
    }
}
