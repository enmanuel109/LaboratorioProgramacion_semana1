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
                    System.out.println("--- Piramide ---");
                    System.out.println("Ingrese la cantidad de filas de la piramide: ");
                    int filas=lea.nextInt();
                    
                    int nuemero_actual = 1;
                    for(int i =1;i<=filas;i++){
                    int suma_numeros=0;
                    
                        for(int j=1;j<=i;j++ ){
                            System.out.print(nuemero_actual+" ");
                            suma_numeros += nuemero_actual;
                            nuemero_actual += 2;
                        }
                        System.out.println("= "+ suma_numeros);   
                    }
                    
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opciones != 1);
    }
}
