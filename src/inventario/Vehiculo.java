/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventario;

/**
 *
 * @author Oscar
 */
public abstract class Vehiculo {
    
    public int velocidad;
    public int pasajeros;
    public String placa;
    public String tipo;
    
    Vehiculo(int velocidad, int pasajeros, String placa, String tipo){
        this.velocidad=velocidad;
        this.pasajeros=pasajeros;
        this.placa=placa;
        this.tipo=tipo;
    }
    
    public abstract String toString();

    
}
