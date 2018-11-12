/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanessa Janethy Carrillo Estrada */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*La clase abstracta es una que no sirve para generar objetos,
        solo sirve como base para herencia,
        no se pueden gererar objetos o instancias de losmismos*/
        //Animal aObj = new Animal();
        //Una clase con "FINAL" no se puede usar para heredar
        Ostra oPalCocktail = new Ostra();
        oPalCocktail.movimiento();
        
    }

    
   
}
/*class Almejas extends Ostra{
    
}*/ //No se puede utilizar ostra para generar herencia por el final porque limita la herencia
final class Ostra extends Animal{ //Si se le pone abstract a ostra no puede generar objetos
    
}

abstract class Animal{
    public void movimiento(){
        System.out.println("Movimiento indefinido");
    }
    
}
