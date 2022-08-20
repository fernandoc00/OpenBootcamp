/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema8;

/**
 *
 * @author ferna
 */
public class Encapsulación {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona Persona1 = new Persona();
        
        Persona1.setEdad(50);
        Persona1.setNombre("Manolo");
        Persona1.setTelefono("+34 608 911 052");

        System.out.println("Nombre: "+Persona1.getNombre()+", Edad: "+Persona1.getEdad()+", Teléfono: "+Persona1.getTelefono());
        // TODO code application logic here
    }
    
}
