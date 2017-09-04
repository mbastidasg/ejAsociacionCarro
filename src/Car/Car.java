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
public class Car {
    private String marca;
    private Wheel[] delantera;
    private Wheel[] trasera;
    private Engine m;
    
    public Car( double potencia, String marca){
        Engine motor= new Engine (potencia, marca);
        this.m = motor;
    }
    public void adicionarLlantaDelantera (Wheel [] llantas){
        this.delantera = llantas;      
    }
    
    public void adicionarLlantaTrasera (Wheel [] llantas){
        llantas[0].setEje(this.m);
        llantas[1].setEje(this.m);
        this.trasera = llantas;
        this.m.setEje(llantas);
    }
}
