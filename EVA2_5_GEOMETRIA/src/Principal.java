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
        System.out.println("El Area de un cuadrado de lado 100 es: " + Geometria.calcularAreaCuadraro(100));
        Geometria.calcularAreaCuadraro(100);
        Geometria gObj = new Geometria();
        
    }
    
}

class Geometria{
    
    //CONSTANTE ESTATICA DOBLE LLAMADA PI
    static final double PI = 3.14159;
    /*Los metodos estaticos existen desde que el programa inicia,
    y solamente se pueden usar a traves de la clase a la que pertenecen.
    NO SON INSTANCIABLES*/
    /*SON UTILES para crear librerias de constantes y funciones;
    para usarlas sin crear objetos*/
    public static double calcularAreaCuadraro(double dLado){
       return dLado * dLado; 
    }
    
}
