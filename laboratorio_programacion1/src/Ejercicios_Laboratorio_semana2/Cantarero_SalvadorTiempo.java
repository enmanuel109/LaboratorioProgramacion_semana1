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
public class Cantarero_SalvadorTiempo {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        System.out.print("Ingresar segundos para convertirlos en un formato de tiempo: ");
        int Tiempo = lea.nextInt();
        
           String OPERADOR_TERNARIO = (Tiempo <= 0)
            ? "No se permite ese valor."
            : ((Tiempo / 3600) + " horas, " +
              ((Tiempo % 3600) / 60) + " minutos, " +
              (Tiempo % 60) + " segundos");

        System.out.println(OPERADOR_TERNARIO);
    }
}
