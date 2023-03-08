
package com.mycompany.operaciones_basicas;

import java.util.Scanner;


public class Ejercicio3 {
    
    public static void main (String[] args){

            
            Scanner practica2 = new Scanner (System.in);
            String alumno;
                       
            /* Programa que lea tres notas de un estudiante
            e imprima su nota definitiva */
            
            float nota1,nota2,nota3,promedio;
            
            System.out.print("Escriba el nombre del alumno: ");
            alumno=practica2.nextLine();
                        
            System.out.print("Digita la primera nota: ");
            nota1=practica2.nextFloat();
            
            System.out.print("Digita la segunda nota: ");
            nota2=practica2.nextFloat();
            
            System.out.print("Digita la tercera nota: ");
            nota3=practica2.nextFloat();
            
            promedio=(nota1+nota2+nota3) / 3;
            System.out.print("La nota promedio del alumno es: " +alumno+ " " +promedio);
    }
                    
 
}
