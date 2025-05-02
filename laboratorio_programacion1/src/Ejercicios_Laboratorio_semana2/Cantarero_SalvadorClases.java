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
public class Cantarero_SalvadorClases {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("/n");
        
        System.out.print("Ingrese la fecha actual(dia/DD/MM):");
        String fecha = lea.nextLine(); 
        
        String dia = fecha.substring(0, fecha.indexOf("/"));
        String dia_del_mes = fecha.substring(fecha.indexOf("/"), fecha.indexOf("/"));
        String Mes = fecha.substring(fecha.indexOf("/"));
        int dia_mes = Integer.parseInt(dia_del_mes);
        int mes = Integer.parseInt(Mes);
        
        if (!dia.equals("lunes")|| !dia.equals("martes") ||!dia.equals("miercoles") || !dia.equals("jueves") || !dia.equals("viernes")|| !dia.equals("sabado")||!dia.equals("domingo")){
            System.out.println("ERROR: el dia que ingreso de la semana es incoreecto.");
        } else if (dia_mes <1 || dia_mes>30) {
            System.out.println("ERROR: el dia que ingreso del mes es incoreecto.");
        } else if ( mes<1 || mes>12){
            System.out.println("ERROR: el mes que ingreso es incoreecto.");
        }
 }
}
