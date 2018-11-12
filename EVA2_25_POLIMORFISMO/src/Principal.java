//AQUI SE ESTAN IMPORTANDO LOS PAQUETES DE LAS CLASES
import Mis_clases.Automovil;
import Mis_clases.Avion;
import Mis_clases.Motocicleta;
import Mis_clases.Vehiculo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
 * Es cuando un objeto de una clase se comporta como objeto de otra clase.
 * Clases están relacionadas por herencia 
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
        Automovil aAuto = new Automovil(); //OBJETO
        
        /*AQUI SE DICE QUE TIPO DE CARACTERISTICAS TIENE EL OBJETO
        ,CUANTAS RUEDAS TIENE Y EL TIPO DE AUTOMOVIL QUE ES
        */
        aAuto.seguridad();
        aAuto.setRuedas(4);//Indica cuantas llantas tiene
        imprimirRuedas(aAuto);//SE IMPRIME EL TIPO DE AUTOMVILA
        
        Motocicleta mMoto = new Motocicleta();
        mMoto.chopper();
        mMoto.setRuedas(2);
        imprimirRuedas(mMoto);
        
        Avion aVion = new Avion();        
        aVion.movimiento();
        aVion.setRuedas(24);
        imprimirRuedas(aVion);
        
    }
    public static void imprimirRuedas(Vehiculo arg){
        //INDICA UNA CONDICION
        String sTipoVehi = "";
        if(arg instanceof Automovil)
            sTipoVehi = "Automovil";
        else if(arg instanceof Motocicleta)
            sTipoVehi = "Motocicleta";
        else
            sTipoVehi = "Avion";
        System.out.println("Ruedas del vehiculo: " + arg.getRuedas());
        
        //SI ES UN AUTOMOVIL, IMPRIMIR SEGURIDAD
        
        if(arg instanceof Automovil){
            //CONVERTIR VEHICULO EN AUTOMÓVIL
            Automovil aAuto = (Automovil)arg;
            aAuto.seguridad();
        }
    }    
}
