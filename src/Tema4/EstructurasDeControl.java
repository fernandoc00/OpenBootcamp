/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Tema4;

import java.util.Scanner;

/**
 *En este ejercicio practicarás las estructuras de control, para ello deberás crear:

* Usando un if, crear una condición que compare si la variable numeroIf es positivo, negativo, o 0.
* Pista: Los números inferiores a 0 son negativos y los superiores, positivos.
* 
* Crea un bucle While, este bucle tendrá que tener como condición que la variable numeroWhile sea inferior a 3, 
* el bloque de código que tendrá el bucle deberá:
* Incrementar el valor de la variable en uno cada vez que se ejecute.
* Mostrarlo por pantalla cada vez que se ejecute.

* Para el bucle Do While, deberás crear la misma estructura que en el While, pero solo se debe ejecutar una vez.

* Para el bucle For, crea una variable numeroFor, esta variable tendrá como valor 0 y su condición será que la variable sea igual o menor que 3, se irá incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por pantalla.

* Por último, para el Switch, deberás crear la variable estacion, y distintos case para las cuatro estaciones del año. Dependiendo del valor de la variable estacion se deberá mandar un mensaje por consola informando de la estación en la que está. 
* También habrá que poner un default para cuando el valor de la variable no sea una estación.
* 
 * @author ferna
 */
public class EstructurasDeControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce el número para ejecutar:\n1.CondicionalIf\n2.CondicionalSwitch\n3.BucleWhile\n4.BucleDoWhile\n5.BucleFor\n");
        int numero = teclado.nextInt();
        
        switch(numero){
                case 1: condicionalIf(teclado); break;
                case 2: condicionalSwitch(teclado); break;
                case 3: bucleWhile(teclado); break;
                case 4: bucleDoWhile(teclado); break;
                case 5: bucleFor(teclado); break;
                default: System.out.println("ERROR. Vuelve a iniciar");
        }
        
    }
    
    
    public static void condicionalIf(Scanner teclado){
        System.out.println("Introduce un número para comprobar: Positivo|Negativo|Neutro(0)");
        int numeroIf = teclado.nextInt();
        
        if(numeroIf>0)
            System.out.println("POSITIVO");
        else if(numeroIf<0)
            System.out.println("NEGATIVO");
        else
            System.out.println("NEUTRO(0)");
                    
        
    }
    
    public static void condicionalSwitch(Scanner teclado){
        System.out.println("Introduce un número para elegir ESTACIÓN\n1.Primavera\n2.Verano\n3.Otoño\n4.Invierno\n");
        int numeroSwitch = teclado.nextInt();
            switch(numeroSwitch){
                case 1: System.out.println("Ha elegido: PRIMAVERA");
                case 2: System.out.println("Ha elegido: VERANO");
                case 3: System.out.println("Ha elegido: OTOÑO");
                case 4: System.out.println("Ha elegido: INVIERNO");
                default: System.out.println("ERROR. Vuelve a iniciar");
            }
    }
    
    public static void bucleWhile(Scanner teclado){
        int numeroWhile = 0;
        
        do{
        
        System.out.println("Introduce un número para comprobar: INFERIOR A 3");
        numeroWhile = teclado.nextInt();
        
        }while(numeroWhile>=3);
        
        while(numeroWhile<3){
            numeroWhile++;
            System.out.println(numeroWhile);
                    
        }
    }
        
    public static void bucleDoWhile(Scanner teclado){
        int numeroWhile = 2;
        do{
            numeroWhile++;
            System.out.println(numeroWhile);
        
        }while(numeroWhile<3);
    }
    
    public static void bucleFor(Scanner teclado){
        System.out.println("BUCLE FOR\n");
        
        for(int numeroFor = 0; numeroFor<3; numeroFor++){
            numeroFor++;
            System.out.println(numeroFor);
        }


    }    
}
