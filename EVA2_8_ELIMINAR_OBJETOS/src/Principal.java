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
        //EN JAVA PARA ELIMINAR OBJETOS HAY QUE DESCONECTARLOS
        Test tObj = new Test();
        Test tCopia = tObj;
        tObj.iVal = 100;
        System.out.println(tObj.iVal);
        System.out.println(tObj);
        System.out.println(tCopia);
        tObj = new Test();
        System.out.println("Señor Slim, usted tiene: " + tObj.iVal);
        System.out.println(tObj);
        tObj = null;
        System.out.println(tObj);
        System.out.println("Pereme señor Slim, tiene: " +tCopia);
    }
    
}
class Test{
    int iVal;
}