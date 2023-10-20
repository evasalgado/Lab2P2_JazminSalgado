/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p2_jazminsalgado;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author evaja
 */
public class Lab2P2_JazminSalgado {

    /**
     * @param args the command line arguments
     */
    static ArrayList compra = new ArrayList();
    static ArrayList jugadores = new ArrayList();
    static ArrayList carros = new ArrayList();

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
                    menuCarro();
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
        Random alea = new Random();
        int op = 0;
        while (op == 0 || op == 1 || op == 2 || op == 3 || op == 4) {
            System.out.println("----MENU JUGADORES----\n"
                    + "1. Crear Jugador\n"
                    + "2. Modificar Jugador\n"
                    + "3. Listar jugadores\n"
                    + "4. Eliminar jugadores\n"
                    + "(si deseas salir, ingresa cualquier otro numero)");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    String n;
                    int pr = 0;
                    double money = 0;
                    System.out.println("Ingrese el nombre de usuario del jugador: ");
                    n = leer.nextLine();
                    n = leer.nextLine();
                    pr = alea.nextInt(1000, 999999);
                    money = alea.nextDouble(100000, 999999);
                    agregarJugador(n, pr, money);
                    break;
                case 2:
                    listarJugadores();
                    System.out.println("Ingrese el indice del jugador a modificar: ");
                    int m = leer.nextInt();
                    modificarJugador(m);
                    break;
                case 3:
                    System.out.println("Lista de jugadores: ");
                    listarJugadores();
                    break;
                case 4:
                    listarJugadores();
                    System.out.println("Ingrese el indice del jugador a eliminar: ");
                    int e = leer.nextInt();
                    eliminarJugador(e);
                    break;
                default:
                    System.out.println("retornando al main....");
                    break;
            }
        }
    }

    public static void menuCarro() {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        while (op == 0 || op == 1 || op == 2 || op == 3 || op == 4) {
            System.out.println("----MENU JUGADORES----\n"
                    + "1. Crear Carro\n"
                    + "2. Modificar Carro\n"
                    + "3. Listar Carros\n"
                    + "4. Eliminar Carro");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    String marca = "",
                     modelo = "";
                    Color color;
                    double precio = 0;
                    System.out.println("Ingrese la marca del carro: ");
                    marca = leer.nextLine();
                    marca = leer.nextLine();
                    System.out.println("Ingrese el modelo del carro "+marca+": ");
                    modelo=leer.nextLine();
                    color=JColorChooser.showDialog(null, "Ingrese un color: ", Color.BLUE);
                    agregarCarro(marca, modelo, color, precio);
                    break;
                case 2:
                    
                    break;
                case 3:
                    System.out.println("Lista de carros: ");
                    listarCarros();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("retornando al main....");
                    break;
            }
        }
    }

    public static void agregarJugador(String n, int pr, double p) {
        jugadores.add(new jugador(n, pr, p));
        System.out.println("Jugador creado. Bienvenido," + n);

    }

    public static void listarJugadores() {
        if (jugadores.isEmpty()) {
            System.out.println("Lista vacia");
        } else {
            for (Object player : jugadores) {
                if (player instanceof jugador) {
                    System.out.println(player + "\n");
                }
            }
        }
    }

    public static void modificarJugador(int i) {
        Scanner leer = new Scanner(System.in);
        Random alea = new Random();
        String n = "";
        int pr = 0;
        double money = 0;
        if (i >= 0 && i < jugadores.size()) {
            if (jugadores.get(i) instanceof jugador) {
                System.out.println("Ingrese el nombre de usuario del jugador: ");
                n = leer.nextLine();
                n = leer.nextLine();
                pr = alea.nextInt(1000, 999999);
                money = alea.nextDouble(100000, 999999);
                ((jugador) jugadores.get(i)).setNombre(n);
                ((jugador) jugadores.get(i)).setPuntosrep(pr);
                ((jugador) jugadores.get(i)).setCuenta(money);
                System.out.println("informacion modificada, " + n);

            }
        }
    }

    public static void eliminarJugador(int i) {
        Scanner leer = new Scanner(System.in);
        if (i >= 0 && i < jugadores.size()) {
            if (jugadores.get(i) instanceof jugador) {
                System.out.println("Estas seguro de eliminar?[s/n]:  ");
                char resp = leer.next().charAt(0);
                switch (resp) {
                    case 's':
                        System.out.println("Usuario eliminado, adios " + ((jugador) jugadores.get(i)).getNombre());
                        jugadores.remove(i);
                        break;
                    case 'n':
                        System.out.println("Eliminación cancelada");
                        break;
                    default:
                        System.out.println("Opcion ingresada invalida");
                        break;
                }

            }
        }
    }
    
    public static void agregarCarro(String m, String mod, Color c, double p){
       carros.add(new carro(mod, mod, c, p));
        System.out.println("Carro agregado");
    }
    
    public static void listarCarros(){
        for (Object cars : carros) {
            System.out.println(cars+"\n");
        }
    }
}
