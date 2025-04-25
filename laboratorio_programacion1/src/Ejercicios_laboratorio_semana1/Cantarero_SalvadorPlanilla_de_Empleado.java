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
public class Cantarero_SalvadorPlanilla_de_Empleado {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = sc.next();

        System.out.print("Introduce las horas trabajadas en el mes: ");
        int HorasTrabajadas = sc.nextInt();

        System.out.print("Introduce el pago por hora: ");
        double  PagoPorHora = sc.nextDouble();

        double Salario = (HorasTrabajadas*PagoPorHora)/4;
        System.out.println("Nombre del empleado : " + nombre);
        System.out.println("Horas trabajadas en el mes : " + HorasTrabajadas);
        System.out.println("EL pago por hora es: " + PagoPorHora);
        System.out.println("el salario del empleado es: " + Salario);
    }
}