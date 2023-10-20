/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_jazminsalgado;

import java.awt.Color;
import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class carro {

    private String marca;
    private String modelo;
    private Color color;
    private double precio;
    private ArrayList<String> mejoras = new ArrayList<>();

    public carro() {
    }

    public carro(String m, String mod) {
        marca = m;
        modelo = mod;
    }

    public carro(String marca, String modelo, Color color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.precio = precio;
    }
    
    public carro(ArrayList<String>m){
        mejoras=m;
    }
    public void setMarca(String m) {
        marca = m;
    }

    public String getMarca() {
        return marca;
    }

    public void setModelo(String mod) {
        modelo = mod;
    }

    public String getModelo() {
        return modelo;
    }

    public void setColor(Color c) {
        color = c;
    }

    public Color getColor() {
        return color;
    }

    public void setPrecio(double p) {
        if (precio > 100000) {
            precio = p;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setMejoras(ArrayList<String> m) {
        if (m.isEmpty()) {
            System.out.println("Por el momento no hay nada para añadir");
        } else {
             if (m.contains("Spoiler") || m.contains("Side Skirts") || m.contains("Front Bumper")
                || m.contains("Back Bumper") || m.contains("Super Builds")) {
            mejoras = m;
        } else {
                 System.out.println("Lo ingresado no es una opcion");
             }
        }
    }

    public ArrayList<String> getMejoras() {
        return mejoras;
    }

    @Override
    public String toString() {
        return "Lista de carros disponibles: \n" + marca + "\n" + modelo + "\n" + color + "\n" + precio + "\n" + mejoras;
    }

}
