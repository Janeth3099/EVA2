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
        Empleado eEmp = new Empleado();
        eEmp.setNombre("Ralo ");
        eEmp.setApellido("Solo ");
        eEmp.setRFC("SJDF4895");
        
        Alumno aAlu = new Alumno();
        aAlu.setNombre("Josué ");
        aAlu.setApellido("Martínez ");
        aAlu.setNoControl(18550360);
        
        imprimirDatos(eEmp);
        imprimirDatos(aAlu);
    }
    public static void imprimirDatos(Persona pPerso){
        pPerso.imprimirNombre();
    }
}
