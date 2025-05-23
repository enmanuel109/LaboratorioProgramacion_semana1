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
public class Cantarero_SalvadorFiltrar {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        
        System.out.println("Ingrese una Frase: ");
        String Frase = lea.nextLine()+" ";
        
        System.out.println("Ingrese el Limite de la palabra a imprimir");
        int limite = lea.nextInt();
        
        System.out.println("Las palabras que superan el limite de "+limite +" son:");
        int inicio =0;
        for(int i =0;i<Frase.length();i++){
            if(Frase.charAt(i) == ' '){
            String Palabra_Pasable = Frase.substring(inicio, i);
            if(Palabra_Pasable.length()>= limite){
                System.out.println(Palabra_Pasable);
            }
            inicio = i +1;
         }
        }
    }
}
