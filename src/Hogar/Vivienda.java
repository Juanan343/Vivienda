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

/**
 * Class representing a house with various attributes such as price, 
 * number of rooms, surface area, parking, status, and owner.
 * Provides methods to access and modify these attributes.
 */
public class Vivienda {
    
    /** House price */
    private double precio;
    
     /** Number of rooms in the house */
    private int numHabitaciones; 
    
    /** Surface area in square meters */
    private double superficie; 
    
    /** Indicates when the house has parking*/
    private boolean parking;
    
     /** Current status of the house*/
    private String estado; 
    
    /** Name of the house owner */
    private String propietario;
    
    
    /**
     * Constructor for the Vivienda class.
     * Initializes the house with a given price and default values.
     * 
     * @param precio Initial price of the house
     */
    public Vivienda(double precio) 
    { 
        this.precio = precio;
        this.numHabitaciones = 2;
        this.superficie = 100.0;
        this.parking = false;
        this.estado = "Disponible";
        this.propietario = "Sin asignar";
    }
    
    /**
     * Gets the price of the house.
     * @return House price.
     */
    public double getPrecio() 
    {
        return precio;
    }
    
     /**
     * Sets a new price for the house.
     * @param precio New house price.
     */
    public void setPrecio(double precio) 
    { 
        this.precio = precio;
    }
    
    /**
     * Gets the number of rooms in the house.
     * @return Number of rooms.
     */
    public int getNumHabitaciones() 
    {
        return numHabitaciones;
    }
    
    /**
     * Sets the number of rooms in the house.
     * @param numHabitaciones Number of rooms to set.
     */
    public void setNumHabitaciones(int numHabitaciones)
    {
        this.numHabitaciones=numHabitaciones;
    }
    
    /**
     * Gets the surface area of the house in square meters.
     * @return House surface area.
     */
    public double getSuperficie() 
    {
        return superficie;
    }

    /**
     * Sets the surface area of the house.
     * @param superficie New surface area in square meters.
     */
    public void setSuperficie (double superficie) 
    {
        this.superficie = superficie;
    }

    /**
     * Checks if the house has parking.
     * @return true if it has parking, false otherwise.
     */
    public boolean isParking() 
    {
        return parking;
    }

    /**
     * Sets whether the house has parking.
     * @param parking true if it has parking, false otherwise.
     */
    public void setParking (boolean parking) 
    {
        this.parking = parking;
    }
    
    /**
     * Gets the current status of the house.
     * @return House status.
     */
    public String getEstado() 
    {
        return estado;
    }
    
    /**
     * Sets the status of the house.
     * @param estado New status of the house.
     */
    public void setEstado (String estado)  
    {
        this.estado=estado;
    }
    
    /**
     * Gets the name of the house owner.
     * @return Owner's name.
     */
    public String getPropietario() 
    {
        return propietario;
    }

    /**
     * Sets the name of the house owner.
     * @param propietario Owner's name.
     */
    public void setPropietario(String propietario) 
    { 
        this.propietario = propietario;
    }
    
    /**
     * Applies a 5% discount to the house price.
     */
    public void actualizarPrecio() 
    {
        this.precio *= 0.95;
    }
}