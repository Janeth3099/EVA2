
import MisVehiculos.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehiculo vCarro = new Vehiculo("FORD","F-150",2011,1); 
        
        vCarro.imprimirDatos();
        //VERIFICAMOS SI EL AUTO ESTA ENCENDIDO
        if(!vCarro.isEstaEncendido()){ //SI NO ESTA ENCENDIDO
            vCarro.prender();//LO ARRANCAMOS
            
        }
        vCarro.acelerar();
        System.out.println("Vas a fabulosos" +vCarro.getVelocidad());
    }
    
}
