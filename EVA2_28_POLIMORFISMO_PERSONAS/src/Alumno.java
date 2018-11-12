/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Vanessa Janeth
 */
public class Alumno extends Persona{
    private int noControl;

    public int getNoControl() {
        return noControl;
    }

    public void setNoControl(int noControl) {
        this.noControl = noControl;
    }
    
    public void imprimirNombre(){
        System.out.println("Alumno: " + getNombre() + "" + getApellido() + getNoControl());
    }
}
