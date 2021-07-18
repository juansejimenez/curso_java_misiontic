package com.juanse.ejercicio_1;

import java.util.Scanner;

public class Ejercicio_mayordeedad {

    /*public static String mayorDeEdad(int edad) {

        if (edad >= 18) {
            return "Es mayor de edad";
        } else {
            return "Es menor de edad";
        }
    }*/
    
    public static void mayorDeEdad(int edad){
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es mayor de edad");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la edad: ");
        int edad = sc.nextInt();

        mayorDeEdad(edad);


    }

}
