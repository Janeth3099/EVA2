/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mis_clases;

/**
 *
 * @Vanessa Janeth
 */
public class Guitarra extends InstrumentoMusical implements GuitarraElectrica, GuitarraAcustica{
    private int numeroCuerdas;
  
    private String efectos;
    private int potencia;
    
    public int getNumeroCuerdas() {
        return numeroCuerdas;
    }
    public void setNumeroCuerdas(int numeroCuerdas) {
        this.numeroCuerdas = numeroCuerdas;
    }
    @Override
    public void tocarInstrumento() {
        System.out.println("Ráscale!!, Guitarra con " + numeroCuerdas); 
        System.out.println("La Guitarra es de tipo  " + getNombre());
        System.out.println("Tiene efectos: " + efectos);
        System.out.println("Tiene una potencia de: " + potencia);
        
    }
    @Override
    public void efectos(String tipoEfecto) {
        efectos = tipoEfecto;
    }
    @Override
    public void amplificador(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public void GuitarraAcustica(String tipoGuitarra) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}


