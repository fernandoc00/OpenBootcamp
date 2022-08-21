/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema9;

/**
 *
 * @author ferna
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente Cliente1 = new Cliente();
        Cliente1.setEdad(0);
        Cliente1.setNombre("Manu");
        Cliente1.setTelefono("+34 608 911 052");
        Cliente1.setCredito(2000);
        
        Trabajador Trabajador1 = new Trabajador();
        Trabajador1.setEdad(0);
        Trabajador1.setNombre("Manu");
        Trabajador1.setTelefono("+34 608 911 052");
        Trabajador1.setSalario(5000);
        
        System.out.println(Cliente1);
        System.out.println(Trabajador1);
        
    }
    
}
