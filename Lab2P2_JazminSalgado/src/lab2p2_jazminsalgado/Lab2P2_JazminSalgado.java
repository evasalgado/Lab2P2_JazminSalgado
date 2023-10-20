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
        do {

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
                    menuComprayVenta();
                    break;
                case 4:
                    System.out.println("GRACIAS POR UTILIZAR MI PROGRAMA");
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
                    break;

            }
        } while (op != 4);
    }

    public static void menujugador() {
        Scanner leer = new Scanner(System.in);
        Random alea = new Random();
        int op = 0;

        do {
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
                    System.out.println("Ingrese sus puntos de reputacion: ");
                    pr = leer.nextInt();
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
        } while (op == 0 || op == 1 || op == 2 || op == 3 || op == 4);
    }

    public static void menuCarro() {
        Scanner leer = new Scanner(System.in);
        int op = 0;
        while (op == 0 || op == 1 || op == 2 || op == 3 || op == 4) {
            System.out.println("----MENU JUGADORES----\n"
                    + "1. Crear Carro\n"
                    + "2. Modificar Carro\n"
                    + "3. Listar Carros\n"
                    + "4. Eliminar Carro\n"
                    + "(si deseas salir, ingresa cualquier otro numero)");
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
                    System.out.println("Ingrese el modelo del carro " + marca + ": ");
                    modelo = leer.nextLine();
                    System.out.println("Minimize su pantalla");
                    color = JColorChooser.showDialog(null, "Ingrese un color: ", Color.BLUE);
                    System.out.println("Ingrese un precio de carro: ");
                    precio = leer.nextDouble();
                    agregarCarro(marca, modelo, color, precio);
                    break;
                case 2:
                    listarCarros();
                    System.out.println("Ingrese el indice del carro que desea modificar: ");
                    int m = leer.nextInt();
                    modificarCarro(m);
                    break;
                case 3:
                    System.out.println("Lista de carros: ");
                    listarCarros();
                    break;
                case 4:
                    listarCarros();
                    System.out.println("Ingrese el indice del carro que desea eliminar: ");
                    int d = leer.nextInt();
                    eliminarCarro(d);
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
                System.out.println("Ingrese sus puntos de reputacion: ");
                pr = leer.nextInt();
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

    public static void agregarCarro(String m, String mod, Color c, double p) {
        carros.add(new carro(m, mod, c, p));
        System.out.println("Carro agregado");
    }

    public static void listarCarros() {
        for (Object cars : carros) {
            System.out.println(cars + "\n");
        }
    }

    public static void modificarCarro(int i) {
        Scanner leer = new Scanner(System.in);
        String marca = "",
                modelo = "";
        Color color;
        double precio = 0;
        if (i >= 0 && i < carros.size()) {
            if (carros.get(i) instanceof carro) {
                System.out.println("Ingrese la marca del carro: ");
                marca = leer.nextLine();
                marca = leer.nextLine();
                System.out.println("Ingrese el modelo del carro " + marca + ": ");
                modelo = leer.nextLine();
                color = JColorChooser.showDialog(null, "Ingrese un color: ", Color.BLUE);
                System.out.println("Ingrese un precio de carro: ");
                precio = leer.nextDouble();
                ((carro) carros.get(i)).setMarca(marca);
                ((carro) carros.get(i)).setModelo(modelo);
                ((carro) carros.get(i)).setPrecio(precio);
                ((carro) carros.get(i)).setColor(color);
                System.out.println("Carro modificado correctamente");
            }

        }
    }

    public static void eliminarCarro(int i) {
        Scanner leer = new Scanner(System.in);
        if (i >= 0 && i < carros.size()) {
            if (carros.get(i) instanceof carro) {
                System.out.println("Estas seguro de eliminar?[s/n]:  ");
                char resp = leer.next().charAt(0);
                switch (resp) {
                    case 's':
                        System.out.println("Carro eliminado correctamente");
                        carros.remove(i);
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

    public static void menuComprayVenta() {
        Scanner leer = new Scanner(System.in);
        Random alea = new Random();
        int op = 0;
        do {
            System.out.println("---MENU DE COMPRA Y VENTA---\n"
                    + "1. Comprar Carro\n"
                    + "2. Hacer modificaciones de carro\n"
                    + "3. Vender Carro\n"
                    + "4. Salir");
            op = leer.nextInt();
            switch (op) {
                case 1:
                    listarJugadores();
                    System.out.println("Ingrese el indice del jugador que quiere comprar un carro: ");
                    int c = leer.nextInt();
                    comprarCarro(c);
                    break;
                case 2:
                    listarJugadores();
                    System.out.println("Ingrese el indice del jugador que quiere vender un carro: ");
                    int m = leer.nextInt();
                    modificarInstal(m);
                    break;
                case 3:
                    listarJugadores();
                    System.out.println("Ingrese el indice del jugador que quiere vender un carro: ");
                    int v = leer.nextInt();
                    venderCarro(v);
                    break;
                case 4:
                    System.out.println("Volviendo al menu");
                    break;
                default:
                    System.out.println("Numero ingresado no valido");
                    break;
            }
        } while (op != 4);
    }

    public static void comprarCarro(int i) {
        Scanner leer = new Scanner(System.in);
        if (i >= 0 && i < jugadores.size()) {
            if (jugadores.get(i) instanceof jugador) {
                listarCarros();
                System.out.println("Ingrese el indice del carro que desea comprar: ");
                int c = leer.nextInt();
                if (c >= 0 && c < carros.size()) {
                    if (carros.get(c) instanceof carro) {
                        compra.add(((jugador) jugadores.get(i)).getCarros().add(((carro) carros.get(c))));
                        ((jugador) jugadores.get(i)).setCuenta(((jugador) jugadores.get(i)).getCuenta() - ((carro) carros.get(c)).getPrecio());
                        System.out.println("Carro comprado: Ahora el modelo " + ((carro) carros.get(c)).getModelo() + " es de " + ((jugador) jugadores.get(i)).getNombre());
                        carros.remove(c);
                        ((jugador) jugadores.get(i)).setCantcarro(((jugador) jugadores.get(i)).getCantcarro() + 1);
                    }
                }
            }
        }
    }

    public static void venderCarro(int i) {
        Scanner leer = new Scanner(System.in);
        if (i >= 0 && i < jugadores.size()) {
            if (jugadores.get(i) instanceof jugador) {
                System.out.println("Ingrese el indice del carro que desea Vender: ");
                int c = leer.nextInt();
                if (c >= 0 && c < ((jugador) jugadores.get(i)).getCarros().size()) {
                    if (((jugador) jugadores.get(i)).getCarros().get(c) instanceof carro) {
                        carros.add(((jugador) jugadores.get(i)).getCarros().get(c));
                        ((jugador) jugadores.get(i)).setCuenta(((jugador) jugadores.get(i)).getCuenta() + ((carro) carros.get(c)).getPrecio());
                        System.out.println("Carro vendido: Ahora el modelo " + ((carro) carros.get(c)).getModelo() + " vuelve a la lista de carros  ");
                        compra.remove(c);
                        ((jugador) jugadores.get(i)).getCarros().remove(c);
                        ((jugador) jugadores.get(i)).setCantcarro(((jugador) jugadores.get(i)).getCantcarro() - 1);
                    }
                }
            }
        }
    }

    public static void modificarInstal(int i) {
        Scanner leer = new Scanner(System.in);
        if (i >= 0 && i >= 0 && i < jugadores.size()) {
            if (jugadores.get(i) instanceof jugador) {
                System.out.println("Ingrese el indice del carro a modificar: ");
                int m = leer.nextInt();
                if (m >= 0 && m < ((jugador) jugadores.get(i)).getCarros().size()) {
                    if (((jugador) jugadores.get(i)).getCarros().get(m) instanceof carro) {
                        System.out.println("---MENU DE MODIFICACIONES---\n"
                                + "1. Spoiler-3500\n"
                                + "2. Side Skirts-1800\n"
                                + "3. Front Bumper-2000\n"
                                + "4. Rock Bumper-1500\n"
                                + "5. Super Builds-8800");

                        int op = leer.nextInt();
                        String mod = "";
                        double price = 0;
                        switch (op) {
                            case 1:
                                mod = "Spoiler";
                                price = 3500;
                                break;
                            case 2:
                                mod = "Side Skirts";
                                price = 1800;
                                break;
                            case 3:
                                mod = "Front Bumper";
                                price = 2000;
                                break;
                            case 4:
                                mod = "Rock Bumper";
                                price = 1500;
                                break;
                            case 5:
                                mod = "Super Builds";
                                price = 8800;
                                break;
                            default:
                                System.out.println("Numero ingresado no valido");
                        }
                        if ( ((jugador)jugadores.get(i)).getCarros().get(m).getMejoras().contains(mod)) {
                            System.out.println("Modificacion ya a sido agregada");
                        } else {
                            ((jugador)jugadores.get(i)).getCarros().get(m).getMejoras().add(mod);
                           ((jugador)jugadores.get(i)).getCarros().get(m).setPrecio(((jugador)jugadores.get(i)).getCarros().get(m).getPrecio()%price);
                            ((jugador)jugadores.get(i)).setCuenta(((jugador)jugadores.get(i)).getCuenta()-price);
                        }
                    }
                }
                System.out.println("Instalaciones de auto agregadas");
            }
        }
    }

}
