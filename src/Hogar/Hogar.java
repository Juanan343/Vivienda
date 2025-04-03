/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hogar;

/**
 *
 * @author paqui
 */
public class Hogar {
/**
* @param args the command line arguments
*/
    public static void main(String[] args) 
    {

        Vivienda casa1 = new Vivienda(120000);

        casa1.setNumHabitaciones(3);
        casa1.setSuperficie(120);
        casa1.setParking(true);
        casa1.setEstado("En venta");
        casa1.setPropietario("Juan Pérez");
        System.out.println("Precio: " + casa1.getPrecio());
        System.out.println("Número de habitaciones: " + casa1.getNumHabitaciones());
        System.out.println("Superficie en m2: " + casa1.getSuperficie());
        System.out.println("¿Dispone de parking?: " + casa1.isParking());
        System.out.println("Estado: " + casa1.getEstado());

        System.out.println("Propietario: " + casa1.getPropietario());
    }
}