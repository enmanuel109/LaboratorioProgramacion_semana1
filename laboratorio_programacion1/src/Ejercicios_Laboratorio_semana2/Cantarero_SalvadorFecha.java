/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_Laboratorio_semana2;
import java.util.Scanner;
/**
 *
 * @author Cantarero
 */
public class Cantarero_SalvadorFecha {
    public static void main(String[] args) {
            Scanner lea = new Scanner(System.in);
            
            String text1 = ("ingresar la primera fecha(DIA/MES/Ano):");
            System.out.print(text1);

            String primera_fecha = lea.nextLine();
                                
            System.out.print("ingresar la segunda fecha(DIA/MES/Ano):");
            String segunda_fecha = lea.nextLine();
    
            int primeros_dias = Integer.parseInt(primera_fecha.substring(0, 2));
            int primeras_meses = Integer.parseInt(primera_fecha.substring(3, 5));
            int primeros_años = Integer.parseInt(primera_fecha.substring(6));       
            int segundos_dias = Integer.parseInt(segunda_fecha.substring(0, 2));
            int segundas_meses = Integer.parseInt(segunda_fecha.substring(3, 5));
            int segundos_años = Integer.parseInt(segunda_fecha.substring(6)); 
            
            int total_de_dia1 = primeros_dias + (primeras_meses * 30) + (primeros_años * 360);
            int total_de_dia2 = segundos_dias + (segundas_meses * 30) + (segundos_años * 360);
            
            int total_dias =(total_de_dia2 - total_de_dia1);

            String text = "La diferencia entre las fechas es de " + total_dias + " dias.";
            System.out.println(text);
    }
}
