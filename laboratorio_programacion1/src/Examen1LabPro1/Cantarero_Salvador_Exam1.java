/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Examen1LabPro1;

import java.util.Scanner;

/**
 *
 * @author Cantarero
 */
public class Cantarero_Salvador_Exam1 {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);

        int opciones;
        //el do-whille sirve para regresar el menu si no es 5

        do {

            //El do-while regresa la opcion sin ingresa un valor invalido
            do {
                //El menu de opciones donde el usuario puede visualizar que opcion tomar
                System.out.println("*** MENU DE OPCIONES***");
                System.out.println("1) Piramide.");
                System.out.println("2) Clave.");
                System.out.println("3) Juego de Piedra, Papel y Tijera.");
                System.out.println("4) Adivinar.");
                System.out.println("5) Salir.");
                opciones = lea.nextInt();

                //El if funcion para mandar un error de valor incorrecta
                if (opciones < 1 && opciones > 5) {
                    System.out.println("Error: La opcion no es valida");
                }

            } while (opciones < 1 && opciones > 5);

            switch (opciones) {
                case 1:
                    //Opcion de piramirde
                    System.out.println("--- Opcion Piramide ---");
                    System.out.println("*Ingrese la cantidad de filas de la piramide: ");
                    int filas = lea.nextInt();

                    //Procede a organizar las piramides
                    int numero_impar = 1;
                    //El for cuenta el numero de filas ingresadas y las organiza
                    for (int fila = 1; fila <= filas; fila++) {
                        int suma_numeros = 0;

                        //Procede a sumar los numero impares por fila
                        for (int j = 1; j <= fila; j++) {
                            System.out.print(numero_impar + " ");
                            suma_numeros += numero_impar;
                            numero_impar += 2;
                        }
                        //Imprime fila por fila
                        System.out.println("= " + suma_numeros);
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    //Opcion de Clave
                    lea.useDelimiter("\n");
                    lea.nextLine();
                    System.out.println("--- Opcion Clave  ---");
                    System.out.println("*Ingrese un mensaje para cifrar: ");
                    String Mensaje = lea.nextLine();
                    String Mensaje_cifrado = "";

                    //El ciclo for revisa ordenadamente cada caracter del mensaje
                    for (int indice = 0; indice < Mensaje.length(); indice++) {
                        //Segun la variable indice añade ese caracter a la avariable Caracter_actual
                        char Caracter_actual = Mensaje.charAt(indice);
                        char caracter_suma;
                        /*
                        se convierten los caracteres a su valor ASCII donde se resta
                        con el a iquivalente a 97 y el restante a z equivalente 122 par 
                        tener el contrario del valor, las mayusculas empiezan con a=65 y 
                        termina z=90, y al final se vuelve a convertir con valores deliberados
                         */
                        if (Caracter_actual >= 'a' && Caracter_actual <= 'z') {
                            int resta = Caracter_actual - 'a';
                            caracter_suma = (char) ('z' - resta);
                        } else if (Caracter_actual >= 'A' && Caracter_actual <= 'Z') {
                            int resta = Caracter_actual - 'A';
                            caracter_suma = (char) ('Z' - resta);
                        } else {
                            caracter_suma = Caracter_actual;
                        }
                        //se suma al nuevo mensaje cifrado
                        Mensaje_cifrado = Mensaje_cifrado + caracter_suma;
                    }

                    System.out.println("El mensaje cifrado =" + Mensaje_cifrado);

                    String Mensaje_descifrado = "";
                    for (int indice = 0; indice < Mensaje_cifrado.length(); indice++) {
                        char Caracter_actual = Mensaje_cifrado.charAt(indice);
                        char caracter_original;

                        if (Caracter_actual >= 'a' && Caracter_actual <= 'z') {
                            int resta = Caracter_actual - 'a';
                            caracter_original = (char) ('z' - resta);
                        } else if (Caracter_actual >= 'A' && Caracter_actual <= 'Z') {
                            int resta = Caracter_actual - 'A';
                            caracter_original = (char) ('Z' - resta);
                        } else {
                            caracter_original = Caracter_actual;
                        }

                        Mensaje_descifrado = Mensaje_descifrado + caracter_original;
                    }

                    System.out.println("El mensaje descifrado: " + Mensaje_descifrado);

                    break;
                case 3:
                    System.out.println("--- Juego de Piedra, Papel y Tijera ---");
                    String eleccion_menu;
                    do {
                        System.out.println("Bienvenido Player, a neustro juego e Piedra, Papel y Tijera");
                        System.out.println("Te tocara jugar contra Mi, Mr.PcThanos");
                        System.out.println("Ingrese(piedra,papel o tijera)");
                        eleccion_menu = lea.next().toLowerCase();

                        if (!eleccion_menu.equals("piedra") && !eleccion_menu.equals("papel") && !eleccion_menu.equals("tijera")) {
                            System.out.println("Error: EL valor es invalido");
                        }
                    } while (!eleccion_menu.equals("piedra") && !eleccion_menu.equals("papel") && !eleccion_menu.equals("tijera"));

                    break;
                case 4:
                    break;
                case 5:
                    break;
            }
        } while (opciones != 5);
    }
}
