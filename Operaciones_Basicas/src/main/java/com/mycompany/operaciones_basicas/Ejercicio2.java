

package com.mycompany.operaciones_basicas;

import java.util.Scanner;

public class Ejercicio2 {
    
      public static void main(String[] args) {
       
                        Scanner Practica = new Scanner (System.in);

                        double computador,celular,televisor,promedio;

                                 System.out.print("Calcular el promedio de tres productos");
                                 Practica.hasNextLine();
                                 System.out.print("Digita el valor del televisor: ");
                                 televisor=Practica.nextDouble();
                                 System.out.print("Digitael valor del computador: ");
                                 computador=Practica.nextDouble();
                                 System.out.print("Digita el valor del celular: ");
                                 celular=Practica.nextDouble();

                                 promedio = (computador+televisor+celular) /3;
                                 System.out.print("El promedio de los tres productos es: " +promedio);  
                                 
                                 
                }               
}

    


