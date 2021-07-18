
package com.juanse.ejercicio_1;

import java.util.Scanner;

public class EjercicioSuma {
    
    public static int suma(int numero1, int numero2){
        int suma=numero1+numero2;
        return suma;
    }
    
    public static int resta(int numero1, int numero2){
        int resta=numero1-numero2;
        return resta;
    }
    
   
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Digite el numero 1 ");
        int numero1=entrada.nextInt();
        
        System.out.println("Digite el numero 2 ");
        int numero2=entrada.nextInt();
        
        int resultadoSuma=suma(numero1, numero2);
        int resultadoResta=resta(numero1, numero2);
        
        System.out.println("La suma es: " + resultadoSuma);
        System.out.println("La resta es: " + resultadoResta);
    }
    
}
