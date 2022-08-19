/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema3;

/**
 *
 * @author ferna
 */
public class Coche {
    
    int puertas;

    public Coche(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return "Coche{" + "puertas=" + puertas + '}';
    }

    
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }
    
    
    public void incremetarPuertas(){
        puertas++;
    }
    
    
}
