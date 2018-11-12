/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MisClases;

/**
 *
 * @author Vanessa Janeth
 */
public abstract class FiguraGeometrica {
    //ATRIBUTOS
    private Punto EsqSupIz;
    private String color;
    private int anchoLinea;

    public Punto getEsqSupIz() {
        return EsqSupIz;
    }

    public void setEsqSupIz(Punto EsqSupIz) {
        this.EsqSupIz = EsqSupIz;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAnchoLinea() {
        return anchoLinea;
    }

    public void setAnchoLinea(int anchoLinea) {
        this.anchoLinea = anchoLinea;
    }
    //AREA DE UNA FIGURA 2D
    public abstract int calculaArea();
    //SIMULA DIBUJAR LA FIGURA 2D
    public abstract void dibujar();
    
}
