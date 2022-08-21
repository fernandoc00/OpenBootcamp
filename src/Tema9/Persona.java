/*

Crea una clase Persona con las siguientes variables:

*La edad

*El nombre

*El teléfono

Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase 
tendrá la variable credito solo para esa clase.

Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, 
el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.

Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.


 */
package Tema9;


/**
 *
 * @author ferna
 */
public class Persona {
    private int edad;
    private String nombre;
    private String telefono;



    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Persona{" + "edad=" + edad + ", nombre=" + nombre + ", telefono=" + telefono + '}';
    }

    
    
}
