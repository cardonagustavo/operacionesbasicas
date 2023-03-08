
package com.mycompany.operaciones_basicas;

import java.util.Scanner;


public class Ejercicio4 {
    
    public static void main (String[] args){
        
        Scanner practica4 = new Scanner (System.in);
        
        /* Algoritmo que al introducir los ingresos y gastos 
        nos entrgue el saldo*/
        
                int salario;
                int ingreso_extra;
                int gastos;
                int saldo;
                
                System.out.print("Ingresa el Salario mensual: ");
                salario=practica4.nextInt();
                
                System.out.print("Digita el ingreso extra mensual: ");
                ingreso_extra=practica4.nextInt();
                
                System.out.print("Digita los gastos Mensuales: ");
                gastos=practica4.nextInt();
                
                saldo=((salario+ingreso_extra)-gastos);
                System.out.println("El saldo mensual es: " + saldo);   
                
                
                                          
    }
    
}
