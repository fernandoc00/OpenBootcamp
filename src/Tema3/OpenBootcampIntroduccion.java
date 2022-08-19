/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
*/

package Tema3;

import java.util.Scanner;

/**
 *
 * Primera parte:

Crear una función con tres parámetros que sean números que se suman entre sí.

Llamar a la función en el main y darle valores.

Segunda parte:

Crear una clase coche.

Dentro de la clase coche, una variable numérica que almacene el número de puertas que tiene.

Una función que incremente el número de puertas que tiene el coche.

Crear un objeto miCoche en el main y añadirle una puerta.

Mostrar el número de puertas que tiene el objeto.
 
 * @author ferna
 */

public class OpenBootcampIntroduccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        suma(7,1,2);
        Coche miCoche = new Coche(4);
        char text = 'S';
        
        Scanner teclado = new Scanner(System.in);
        
        while(text!='N'){
        miCoche.incremetarPuertas();
        System.out.println(miCoche);
        System.out.println("Para terminar, escribe: N");
        text = teclado.next().charAt(0);
        }
        // TODO code application logic here
    }
    
    public static void suma(int a, int b, int c){
        a+=b+c;
        System.out.println(a);
    }
    
}
