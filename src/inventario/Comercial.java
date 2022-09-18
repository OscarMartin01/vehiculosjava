/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author Oscar
 */
    public class Comercial extends Vehiculo{
    
    public String CargaMaxima;
    
    Comercial(int velocidad, int pasajeros, String placa, String tipo, String CargaMaxima){
        super(velocidad, pasajeros, placa, tipo);
        this.CargaMaxima=CargaMaxima;
    }
    
    @Override
    public String toString(){

        return "\tVehículo Tipo "+this.tipo+" - Placa: "+this.placa+"\n"+
               "\tvelocidad: "+this.velocidad+" km/h"+"\n"+
               "\tpasajeros: "+this.pasajeros+"\n"+
               "\tCarga máxima: "+this.CargaMaxima+"Kg";
    }
    
}
