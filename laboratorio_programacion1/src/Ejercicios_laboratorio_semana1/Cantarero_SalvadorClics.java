/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_laboratorio_semana1;
import java.text.DecimalFormat;

/**
 *
 * @author Cantarero
 */
public class Cantarero_SalvadorClics {
    public static void main(String[] args){
        DecimalFormat formato = new DecimalFormat("0.##");
        System.out.println("la cantidad de click es de 180");
        double cliks100 =100 * 0.25;
        double cliks60 =60 * 0.30 ;
        double cliks20 =20 * 0.80;     
        
        double costo_total_sinISV = cliks100 + cliks60 + cliks20;
        double CPC_prpmedio= costo_total_sinISV/180;
        double impiuesto = costo_total_sinISV*0.16; 
        double COSTO_TOTAL = costo_total_sinISV + impiuesto;  
        
        System.out.println("el costo promedio es: " + CPC_prpmedio);
        System.out.println("el total es de: " + COSTO_TOTAL);  
    }
}
