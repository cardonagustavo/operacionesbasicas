//Programa de operaaciones basicas.
package com.mycompany.operaciones_basicas;
//Librerias

import java.util.Scanner;


public class Operaciones_Basicas {

          public static void main(String[] args) {
                Scanner Basic = new Scanner (System.in);

                int num1, num2;
                int num3;
                int suma,resta,multiplicacion;
                int division1;
                float division2;

                System.out.print( "Digita el primer Número: ");
                num1=Basic.nextInt();
                System.out.print("Digita el segundo Número: ");
                num2=Basic.nextInt();
                System.out.print("Digita el tercer numero con decimal: ");
                num3=(int)(float)Basic.nextFloat();

                suma=num1+num2;
                resta=num1-num2;
                multiplicacion=num1*num2;
                division1=num1/ num2;
                division2=(int) ((float) num1/ num3);

                System.out.println("/n La suma de números es: " + suma);
                System.out.println("/n La resta de números es: " + resta);
                System.out.println("/n La multiplicación es: "+ multiplicacion);
                System.out.println("/n Ladivisión de números entero es: " + division1);
                System.out.println("/n La división con número decimal es: " + division2);
                
        
                
           } //Fin del Ejercicio1 del Lunes Class Operaciones_Basicas.
}       
        



    
                       
          
