/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_jazminsalgado;

import java.util.Scanner;

/**
 *
 * @author evaja
 */
public class Lab2P2_JazminSalgado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        while (op != 4) {
            System.out.println("---MENU----\n"
                    + "1. Opción de Jugadores\n"
                    + "2. Opción de Carros\n"
                    + "3. Compra y venta de carros\n"
                    + "4. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    menujugador();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("GRACIAS POR UTILIZAR MI PROGRAMA");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;
            }
        }
    }

    public static void menujugador() {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        while (op==0||op == 1 || op == 2 || op == 3 || op == 4) {
            System.out.println("----MENU JUGADORES----\n"
                    + "1. Crear Jugador\n"
                    + "2. Modificar Jugador\n"
                    + "3. Listar jugadores\n"
                    + "4. Eliminar jugadores");
            op= leer.nextInt();
            switch (op) {
                case 1:
                    
                    break;
                case 2: 
                    break;
                case 3: 
                    break; 
                case 4:
                    break;
                default:
                    System.out.println("retornando al main....");
                    break;
            }
        }
    }
}
