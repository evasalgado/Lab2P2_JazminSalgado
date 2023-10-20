/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2p2_jazminsalgado;

import java.util.ArrayList;

/**
 *
 * @author evaja
 */
public class jugador {
    private String nombre;
    private int cantcarro;
    private ArrayList<carro> carros = new ArrayList();
    private int puntosrep;
    private double cuenta;
    
    public jugador(){
        
    }
    public jugador(String n){
        nombre=n;
    } 
    public jugador(String n, int cc, double c){
        nombre=n;
        cantcarro=cc;
        cuenta=c;
    }
    
    public void setNombre(String n){
        nombre=n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setCantcarro(int cc){
        if (cc>0) {
            cantcarro=cc;
        } 
    } 
    public int getCantcarri(){
        return cantcarro;
    }
    public void setCarros(ArrayList<carro> c){
        carros=c;
    }
    public ArrayList<carro> getCarros(){
        return carros;
    }
    public void setPuntosrep(int pr){
        puntosrep=pr;
    }
    public int getPuntosreo(){
        return puntosrep;
    }
    public void setCuenta(double c){
        if (c>0) {
            cuenta=c;
        } System.out.println("No tienes dinero (pobre)");
    } 
    public double getCuenta(){
        return cuenta;
    }

    @Override
    public String toString() {
        return "Datos de Jugador: "+nombre+ "\n cantidad de carros: "+cantcarro+"\npuntos de reputación: "+puntosrep+"\nDinero actual: "+cuenta;
    }
    
    
}
