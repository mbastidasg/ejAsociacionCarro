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
public class Engine {
   private double potencia;
   private String marca;
    private Wheel [] eje;

    public Engine(double potencia, String marca) {
        this.potencia = potencia;
        this.marca = marca;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

     public Wheel[] getEje() {
        return eje;
    }

    public void setEje(Wheel[] eje) {
        this.eje = eje;
    }
   
   
    
   
}
