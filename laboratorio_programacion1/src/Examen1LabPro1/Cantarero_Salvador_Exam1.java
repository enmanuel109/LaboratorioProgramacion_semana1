/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen1LabPro1;

import java.util.Scanner;

/**
 *
 * @author Cantarero
 */
public class Cantarero_Salvador_Exam1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int opciones;
        
        do {
            System.out.println("*** MENU DE OPCIONES***");
            System.out.println("1) Piramide.");
            System.out.println("2) Clave.");
            System.out.println("3) Juego de Piedra, Papel y Tijera.");
            System.out.println("4) Adivinar.");
            System.out.println("5) Salir.");
            opciones = lea.nextInt();

            switch (opciones) {
                case 1:
                    System.out.println("--- Opcion Piramide ---");
                    System.out.println("*Ingrese la cantidad de filas de la piramide: ");
                    int filas=lea.nextInt();
                    
                    int numero_impar = 1;
                    for(int fila =1;fila<=filas;fila++){
                    int suma_numeros=0;
                    
                        for(int j=1;j<=fila;j++ ){
                            System.out.print(numero_impar+" ");
                            suma_numeros += numero_impar;
                            numero_impar += 2;
                        }
                        System.out.println("= "+ suma_numeros);   
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("--- Opcion Clave  ---");
                    System.out.println("*Ingrese un mensaje para cifrar: ");
                    String Mensaje = lea.next();
                    
                    for(int indice=0;indice<Mensaje.length();indice++){
                        char Caracter_actual =Mensaje.charAt(indice);
                        
                        if(Caracter_actual>='a' &&Caracter_actual<='z' ){
                        
                        }
                    }
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opciones != 5);
    }
}
