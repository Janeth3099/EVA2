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
        Animal aAni = new Animal();/*objeto, solo sirve como herencia, para darle 
      comportamiento a las clases que van a heredar de ellas*/
        aAni.movimiento();
        Caballo cHorse = new Caballo();
        cHorse.movimiento();
        Ostra aOsta = new Ostra();
        aOsta.movimiento();
    }
    
}
class Caballo extends Animal{//Version diferente de movimiento del caballo al de la jirafa
    //Sustituir el co
    @Override
    public void movimiento(){
        System.out.println("Galopar");
    }
    public void movimiento(String sMovi){
        System.out.println(sMovi); //Sobrecarga: Metodos con diferente nombre pero con el mismo argumento
    }
            
}
class Animal{
    public void movimiento(){
            System.out.println("Movimiento indefinido");
    }
}
class Ostra extends Animal{
    
}