/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanessa Janeth Carrillo Estrada
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
        cHorse.comer();
        
    }
    
}
class Avestruz extends Animal{

    @Override
    public void movimiento() {
        System.out.println("Corre rapido");
    }

    @Override
    public void comer() {
        System.out.println("Turistas en el serengueti");
    }
    
}

class Caballo extends Animal{

    @Override
    public void movimiento() {
        System.out.println("Galopar");
    }

    @Override
    public void comer() {
        System.out.println("Comer pasto");
    }
    
}

abstract class Animal{
    abstract public void movimiento();
    abstract public void comer();
    


}
