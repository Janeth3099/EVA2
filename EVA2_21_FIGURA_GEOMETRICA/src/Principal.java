
import MisClases.Color;
import MisClases.Linea;
import MisClases.Punto;
import MisClases.Rectangulo;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vanessa Janeth
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangulo rRect = new Rectangulo();
        Scanner leer = new Scanner(System.in);
        System.out.println("Base");
        int iBase = leer.nextInt();
        System.out.println("Altura");
        int iAltura = leer.nextInt();
        Punto pIni = new Punto();
        pIni.setY(0);
        pIni.setX(0);
        rRect.setEsqSupIz(pIni);
        rRect.setBase(iBase);
        rRect.setAltura(iAltura);
        rRect.dibujar();
        System.out.println("\nArea = " + rRect.calculaArea());
        
    }
    
}
