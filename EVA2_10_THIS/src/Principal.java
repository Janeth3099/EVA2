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
int iValor = 10;
public Principal(){
    iValor = 0;
}
    /**
     * @param args the command line arguments
     */
    static String sMensaje = "Hola";
    /*Bloque*/public static void main(String[] args) {
        //TODO LO QUE ESTA DENTRO DE LOS BLLOQUES TIENE PRIORIDAD
        Principal pObj = new Principal();
        pObj.imprimir();
        pObj.imprimir2(10000);
        String sMensaje = "Nada de hola";
        System.out.println(sMensaje);
        
        
        for(int i = 0;i < 10;i++){
            System.out.println(i);
        }
        
        for (int i = 0; i < 10; i++) {
            
        }
        
        // TODO code application logic here
    }
 public void imprimir(){
     System.out.println("Valor=" +iValor);
 }
// Esta variable oculta a la otra pero con el This se puede usar 
 public void imprimir2(int iValor){
     System.out.println("Valor= " + iValor);
     //Con el THIS se regresa a la primera variable(this es una palabra reservada)
     //Se usa para acceder a lso miembros de la clase
     // eS UN APUNTADOR A LA INSTANCIA ACTUAL DE LA CLASE
     System.out.println("Valor del atributo" +this.iValor);
 }
}
