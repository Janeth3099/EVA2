/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisVehiculos;

/**
 *
 * @author invitado
 */
public class Vehiculo {
//AgregarAtributos de acceso privado
    private String marca;
    private String modelo;
    private int año;
    private int cilindros;
    private boolean estaEncendido;
    private int velocidad;
    
//Agregar constructor default, poner valores a guto
    public Vehiculo(){
    marca = "Volskwagen";
    modelo = "Vocho";
    año = 2011;
    cilindros = 1;
    velocidad =0;
    
}
    public Vehiculo(String marca,String modelo, int año, int cilindros){
    this.marca = marca;
    this.modelo = modelo;
    this.año = año;
    this.cilindros = cilindros;
}
            
//Agregar constructores que acepta los 4 atributos
    public void GetnSet(String sMarca, String sModelo, int año, int cilindros){
        
    }
 
//El constructor privadoes casi casia fuerza
//Metodos Get Y Set para cada atributo
    

//IMPRIMIR LOS DATOS DEL VEHICULO
    public void imprimirDatos(){
        
    }
            
            
   public void prender(){
       estaEncendido = true;
       
   }   
   public void apagar(){
       estaEncendido = false;
   }
   public void acelerar(){
       if(estaEncendido){
           velocidad = velocidad + 10;
       }
   }
   public void frenar(){
       if(estaEncendido){
         if(velocidad >=10)
             velocidad = velocidad - 10;
       }
       
   }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
    public void acelerar(int velocidad){
        if (estaEncendido) {
        for (int i = 0; i <= 10; i++) {
            
        }   
        }
        
    }
   
   
}
