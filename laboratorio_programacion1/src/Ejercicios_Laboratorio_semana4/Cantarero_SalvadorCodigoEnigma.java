/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Laboratorio_semana4;
import java.util.Scanner;
/**
 *
 * @author Cantarero
 */
public class Cantarero_SalvadorCodigoEnigma {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        int opcion = 0;
        String encriptado ="";

        do{
        do{
        System.out.println("*** Menu ***");
        System.out.println("1. Encriptar texto");
        System.out.println("2. Desencriptar texto");
        System.out.println("3. Regresar");
        System.out.print("Elija una opcion: ");
        opcion = lea.nextInt();
        lea.nextLine(); 
        } while(opcion < 1 || opcion > 3);
        
        String cadena_pares="";
        String cadena_impares="";
        
        switch(opcion){
            case 1:
                //Encriptar texto
                System.out.print("Ingrese un texto: ");
                String texto =" "+ lea.nextLine();
                
                for(int i = 1;i<texto.length();i++){
                    if( i % 2 == 0){
                        cadena_pares+=texto.charAt(i);
                    }else{
                        cadena_impares+=texto.charAt(i);
                    }            
                }
                
                encriptado = cadena_pares + cadena_impares;
                System.out.println("Texto encriptado: " + encriptado);
                
                break;
            case 2:
                //Desencriptar texto
                System.out.println("Texto encriptado: " + encriptado);
                int mitad = encriptado.length()/2;
                String primer_mitad = encriptado.substring(0,mitad);
                String segunda_mitad = encriptado.substring(mitad);
                
                String desencriptado = "";
                for(int i = 0;i<encriptado.length();i++){
                    
                }
                break;
            case 3:
                break;    
        
        }
        }while(opcion !=3);    
    }
}
