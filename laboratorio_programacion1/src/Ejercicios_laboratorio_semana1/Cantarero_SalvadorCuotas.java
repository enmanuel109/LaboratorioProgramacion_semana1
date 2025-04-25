/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_laboratorio_semana1;
import java.util.Scanner;
/**
 *
 * @author Cantarero
 */
public class Cantarero_SalvadorCuotas {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
        System.out.println("Ingresar la cantidad del prestamo: ");
        double Prestamo = sc.nextDouble();
        
        System.out.println("Ingresar el plazo de pago en meses: ");
        double Plazo = sc.nextDouble();
        
        System.out.println("ingrese los intereses del prestamo: ");
        double intereses = sc.nextDouble();
        
        System.out.println("ingrese la comision por cuota del prestamo: ");
        double Cuota = sc.nextDouble();
        
        System.out.println("ingrese el porcentaje de seguro mensual aplicado a la cuota: ");
        double SeguroDeLaCuota = sc.nextDouble(); 
        
        double Pago_Mensual = (Prestamo/Plazo);
        double interes_Total = (intereses*Pago_Mensual)/100;
        double cuota_Total = (Cuota*Pago_Mensual)/100;
        double SeguroDeLaCuota_Total = (SeguroDeLaCuota*cuota_Total)/100;
        
        double CuotaPorMes = Pago_Mensual+interes_Total+cuota_Total+SeguroDeLaCuota_Total;
        double Total_Pagar = CuotaPorMes+Plazo;
        
        System.out.println("**** CUOTAS MENSUALES *******");
        System.out.println("Cuota de Pago Mensual: lps " + CuotaPorMes);
        System.out.println("Cuota de Pago Mensual: lps " + Total_Pagar);
    }
}
