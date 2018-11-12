/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @Vanessa Janeth
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal aAni = new Animal();
        Mamifero mMam = new Mamifero();
        Mamifero mJirafa = new Mamifero("pararse");
        
    }
    
}
class Mamifero extends Animal{ //Aquí Mamifero hereda de la clase Animal
    public Mamifero(){
        //LO PRIMERO ES LLAMAR AL CONSTRUCTOR
        //DE LA CLASE BASE
        super(); //Lo usamos para que la clase Mamifero pueda acceder a lo que contiene la clase Animal
    }
    public Mamifero(String accion){
        super(accion); //Aquí lo usamos para que pueda acceder a la "acción" de la clase Animal
        System.out.println("Y salir corriendo");
    }
}
class Animal{
    public Animal(){
        System.out.println("Respirando");
    }
    public Animal(String accion){
        System.out.println("Respirar y " + accion);
    }
}
