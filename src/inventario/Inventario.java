/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package inventario;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Oscar
 */
public class Inventario{

    public static ArrayList<Vehiculo> lista= new ArrayList<>();
    public static void main(String[] args) {
       Scanner sc= new Scanner (System.in);

       String inv;
      
      String op="";
      
      while(!"3".equals(op)){
           inv= sc.nextLine();
           procesarComandos(inv);
           String [] line= inv.split("&");
           op=line[0];
      }
    }
    
    public static void agregarVehiculo(String Vehiculo){
           String [] line= Vehiculo.split("&");
           String tipo=line[1];
           int pasajeros=Integer.parseInt(line[2]);
           int vel=Integer.parseInt(line[3]);
           String placa=line[4];
           String complemento=line[5];
           
            if(tipo.equals("Particular")){
                lista.add(new Particular(vel,pasajeros,placa,tipo,complemento));
                } else{
                lista.add(new Comercial(vel,pasajeros,placa,tipo,complemento));
                   }  
    }
    
    public static void listarVehiculo(){
        System.out.println("***Colección de vehículos antiguos***");
            for( Vehiculo n:lista ) {
                System.out.println(n + " ");
            }     
    }
    
    public static void procesarComandos(String opcion){
        
        String [] line= opcion.split("&");
           String sel=line[0];
           
           switch(sel){
               
               case "1": agregarVehiculo(opcion);
               break;
               case "2": listarVehiculo();
               break;
               default:
                   break;
           }
    }
}
