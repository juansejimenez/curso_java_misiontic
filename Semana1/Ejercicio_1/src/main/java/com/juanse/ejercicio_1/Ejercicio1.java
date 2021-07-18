package com.juanse.ejercicio_1;

public class Ejercicio1 {

    public static void main(String[] args){
        
        var nombre = "Juan Jimenez";

        var resultado = saludo(nombre);
        System.out.println("resultado " + nombre);
    }

    public static String saludo(String nombre) {
        return "Hola" + nombre + "!";
    }
    
    
}
