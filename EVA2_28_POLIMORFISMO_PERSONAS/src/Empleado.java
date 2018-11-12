/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Vanessa Janeth
 */
public class Empleado extends Persona{
    private String RFC;

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }
    public void imprimirNombre(){
        System.out.println("Empleado: " + getNombre() + "" + getApellido() + getRFC());
    }
}
