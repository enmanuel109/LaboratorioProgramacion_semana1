/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios_laboratorio_semana3;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Cantarero
 */
public class Cantareros_Salvador_Estructuras {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        int opcion;
        int primera = 0;
        int segunda = 0;
        int tercera = 0;
        int cuarta = 0;

        do{
        System.out.println("*** MENU ***");
        System.out.println("1) Palabra Alraves");
        System.out.println("2) Numero Perfecto");
        System.out.println("3) Primos");
        System.out.println("4) Votaciones");
        System.out.println("5) Salir");
        System.out.print("Seleccione una opcion: ");
        opcion = lea.nextInt();
        
        switch(opcion){
            case 1 :
                primera++;
                System.out.println("\n** Seleciono la palabra alreves **");
                System.out.print("ingrese cuantas palabras quiere ingresar: ");
                int palabras = lea.nextInt();
                lea.nextLine(); 

                String Palabras_larga = "";
                String Palabras_larga_Alraves = "";

                int cantidad_Palabras_larga = Palabras_larga.length();
                String palindrome = "";
                
                for(int i=1; i<=palabras; i++){
                    System.out.print("Ingresa la palabra "+i+ " :");
                    String palabra = lea.nextLine();
                    int Cantidad_Caracteres = palabra.length();
                    
                    if(cantidad_Palabras_larga<Cantidad_Caracteres){
                        Palabras_larga = palabra;
                    }
                    
                    String Alreves = "";
                    
                    for(int j=Cantidad_Caracteres-1;j>=0;j--){
                        char caracter_actual = palabra.charAt(j);
                        Alreves = Alreves + caracter_actual;
                    }
                    
                    System.out.println("La palabra alraves: "+Alreves);
                   
                    if(cantidad_Palabras_larga<Cantidad_Caracteres){
                        Palabras_larga_Alraves = Alreves;
                    }
                    if (Palabras_larga == Palabras_larga_Alraves){
                            palindrome="es palindrome";
                    } else{
                            palindrome="no es palindrome";
                    }
                }
                
                System.out.println("La palabra es palindroma: "+ palindrome);
                System.out.println("La palabra mas larga:"+ Palabras_larga);
                
                
                break;
            case 2 :
                segunda++;

                System.out.println("Ingresar numero :");
                    int Numero= lea.nextInt();
                    int suma=0;
                    for(int i=1; i<Numero ; i++){
                        if( Numero%i==0){
                        suma+=i;
                        }
                    }
                    if(suma==Numero){
                    System.out.println(Numero+": es un numero perfecto");
                    } else {
                    System.out.println(Numero+": no es un numero perfecto");
                    }
  
                break;
            case 3 :
                tercera++;

                System.out.println("\n** Seleciono primos **");
                Random random = new Random();
                int numero_primo = random.nextInt(100)+1;
                System.out.print("el numerom aleatorio es: "+ numero_primo);
                int numero_comparacion=0;
                if(numero_primo/2==0 && numero_primo/1==numero_primo){
                       
                }

                break;
            case 4 :
                cuarta++;

                System.out.println("\n** Seleciono Votaciones **");
                System.out.println("Cuantos votantes hay en el pais: ");
                int Votos_total = lea.nextInt();
                String Ganador = "";
                int azul= 0;
                int rojo=0;
                int negro=0;
                int amarillo=0;
                        
                for(int i =1;i<=Votos_total;i++){
                    System.out.println("Voto numero "+i+" elija entre (AZUL,ROJO,NEGRO,AMARILLO): ");
                    String Voto = lea.next();
                    

                    if(Voto.equals("AZUL")){
                        azul++;
                    }else if(Voto.equals("ROJO")){
                        rojo++;
                    }else if(Voto.equals("NEGRO")){
                        negro++;
                    }else if(Voto.equals("AMARILLO")){
                        amarillo++;
                    }else{
                        System.out.println("voto nulo");
                    }
                    
                    
                }
                
                    int votos = azul + rojo + negro + amarillo;
                    double Porcemtaje = (votos * 100) / Votos_total;
                    
                    
                    if (Porcemtaje < 60) {
                    System.out.println("votacion fallida");
                    } else {

                    String ganador = "AZUL";
                    int max = azul;

                    if (rojo > max) {
                    max = rojo;
                    ganador = "ROJO";
                    }
                    if (negro > max) {
                    max = negro;
                    ganador = "NEGRO";
                    }
                    if (amarillo > max) {
                    max = amarillo;
                    ganador = "AMARILLO";
                    }

                    System.out.println("planilla ganadora: " + ganador);
                    }
                break;
            case 5 :
                break;    
            default:
                    System.out.println("opcion invalida, intente de nuevo");
        }
    
    }while(opcion != 5);{}
        System.out.println("Opcion 1: " + primera + " veces");
        System.out.println("Opcion 2: " + segunda + " veces");
        System.out.println("Opcion 3: " + tercera + " veces");
        System.out.println("Opcion 4: " + cuarta + " veces");
    }
}
