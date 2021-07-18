package com.juanse.ejercicio_1;

public class Ejercicio1 {

    public static void main(String[] args){
        
        var nombre = "Juan Jimenez";
        var nombre2= "Juan Sebastian 2";

        var resultado = saludo(nombre);
        var resultado2 = saludo(nombre2);
        
        System.out.println("resultado " +resultado);
        System.out.println("resultado " + resultado2);
    }

    public static String saludo(String nombre) {
        return "Hola" + nombre + "!";
    }
    
    
}
