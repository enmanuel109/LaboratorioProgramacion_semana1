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
public class Cantarero_SalvadorPAGOS {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");
        
        System.out.println("Ingrese el nombre completo del empleado:");
        String empleado = lea.nextLine();
        
        System.out.println("Ingrese el codigo del empleado:");
        String codigo = lea.nextLine();      
        
        System.out.println("Ingrese la cantidad de horas del empleado:");
        int cantidad_horas_trabajadas = lea.nextInt();   
        
        System.out.println("Ingrese la categoria del empleado (1-4):");
        int Categoria = lea.nextInt();   
        
        double salario_base = cantidad_horas_trabajadas * 35.99;
        
        int horasExtras=0; 
        int horas_netas=0;         
        
        if (cantidad_horas_trabajadas <= 40) {
            horas_netas = cantidad_horas_trabajadas;
            horasExtras = 0;
        } else {
            horas_netas = 40;
            horasExtras = cantidad_horas_trabajadas - 40;
            if (horasExtras > 15) {
                horasExtras = 15; // 
            }
        }

        double Pago_Extra;
        
        switch (Categoria) {
            case 1:
                Pago_Extra = 40;
                break;
            case 2:
                Pago_Extra = 50;
                break;
            case 3:
                Pago_Extra = 85;
                break;
            case 4:
                Pago_Extra = 0;
                break;
            default:
                return;
        }
        
        double pagoExtra = horasExtras * Pago_Extra;
        double totalPagar = salario_base + pagoExtra;

        
        System.out.println("Código: " + codigo);
        System.out.println("Nombre completo: " + empleado );
        System.out.println("Categoría: " + Categoria);
        System.out.println("Horas trabajadas: " + cantidad_horas_trabajadas);
        System.out.println("Horas trabajadas Extras:" + horasExtras);
        System.out.println("horas extras: $"+ String.format("%.2f",Pago_Extra));
        System.out.println("Salario_base: $"+ String.format("%.2f",salario_base));
        System.out.println("salario_neto: $"+ String.format("%.2f",totalPagar));
    }
}
