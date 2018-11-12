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
        //REFERENCIAS: Variable que guarda una direccion en memoria
        //APUNTADORES
        Prueba pObj = new Prueba();
        pObj.iValor = 100;
        System.out.println("El valor es:" + pObj.iValor);
        //COPIA
        int iAlgo = 70;
        int iCopia = iAlgo;
        System.out.println("iAlgo = " + iAlgo);
        System.out.println("iCopia = " + iCopia);
        iAlgo = 1000;
        System.out.println("iAlgo = " + iAlgo);
        System.out.println("iAlgo = " + iCopia);
        //PRUEBA DE COPIA
        Prueba pCopiaObj = pObj;
        System.out.println("El valor es: " +pObj.iValor);
        System.out.println("el valor es: "+pCopiaObj.iValor);
        pObj.iValor = 99999;
        
        
    }
    
}

class Prueba{
    int iValor; //4 BYTES
}