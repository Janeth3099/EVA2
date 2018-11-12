/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}

class Caballo implements ComportamientoAnimal{

    @Override
    public void movimieno() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer Pasto");   
    }
    
}

interface ComportamientoAnimal{ //PARA TRANSFERIR COMPORTAMIENTO SE USA INTERFACE
    /*herencia multiple: se hereda de muchas clases
    herencia simple: se hereda de una clasem, pero en java no se permite
    */
    public void movimieno();
    public void comer();
    
        
}