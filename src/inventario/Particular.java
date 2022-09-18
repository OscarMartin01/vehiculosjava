/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author Oscar
 */
public class Particular extends Vehiculo {
    
    public String color;
    
    Particular(int velocidad, int pasajeros, String placa, String tipo, String color){
        super(velocidad, pasajeros, placa, tipo);
        this.color=color;
    }
    
    @Override
    public String toString(){

        return "\tVehículo Tipo "+this.tipo+" - Placa: "+this.placa+"\n"+
               "\tvelocidad: "+this.velocidad+" km/h"+"\n"+
               "\tpasajeros: "+this.pasajeros+"\n"+
               "\tcolor: "+this.color;
        
    }
    
}
