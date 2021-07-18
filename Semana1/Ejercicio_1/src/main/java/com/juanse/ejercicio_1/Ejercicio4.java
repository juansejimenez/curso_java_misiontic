
package com.juanse.ejercicio_1;
import java.util.Scanner;

public class Ejercicio4 {
    
    /* Programa que pase una velocidad en km/h a m/s la velocidad se lee por teclado*/
    /* 1/3.6 */
    
    public static double convertirVelocidad(double velocidad){
        double conversion=velocidad/3.6;
        return conversion;
    }
    
    public static void main(String args[]){
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Digita la velocidad en km/h");
        double velocidad=sc.nextDouble();
        
        double resultado=convertirVelocidad(velocidad);
        
        System.out.println("Laa velocidad en m/s es: " + resultado);
           
    }
    
}
