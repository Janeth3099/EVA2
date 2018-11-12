/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanessa Janeth Carrillo Estrada
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Java le agrega automaticamente un constructor default si no lo declara el programador
        //EL CONSTRUCTOR. Sirve para inicializar la clase
        // TODO code application logic here
        
        //CONSTRUCTORES
        Principal pObjpal = new Principal ();
        Prueba PObjPrue = new Prueba();
        System.out.println(PObjPrue.X);
        
    }
    
    
}

class Prueba {
    int X;

    public Prueba() {
        X = 100;
    }
    
}