/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tema9;

/**
 *
 * @author ferna
 */
final class Cliente extends Persona{
    private int credito;

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public int getCredito() {
        return credito;
    }

    @Override
    public String toString() {
        return super.toString()+" y credito=" + credito + '}';
    }
    
    
}
