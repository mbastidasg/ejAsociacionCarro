/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Car;

/**
 *
 * @author Estudiante
 */
public class Wheel {
    private double diametro;
    private String marca;
   private Engine eje;
    
    public Wheel (double diametro, String marca){
        this.diametro = diametro;
        this.marca= marca;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Engine getEje() {
        return eje;
    }

    public void setEje(Engine eje) {
        this.eje = eje;
    }
   

}
