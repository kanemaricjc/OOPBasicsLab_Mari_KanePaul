/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopbasicslab;

/**
 *
 * @author Student
 */
public class Vehicle {

    private String brand;
    private String model;
    private double speed;
    
    public Vehicle( String brand, String model, double speed ) {
        
        this.brand = brand;
        this.model = model;
        this.speed = speed;
        
    }
    
    public void accelerate( double increment ) {
        
        this.speed = this.speed + increment;
        
    }
    
    public void displayStatus() {
            
           System.out.println( "Vehicle information:" );
           System.out.println( "Brand: " + this.brand );
           System.out.println( "Model: " + this.model );
           System.out.println( "Speed: " + this.speed + " km/h" );
           accelerate(25);
           System.out.println( "After accelerating by 25 km/h: " + this.speed + " km/h");
            }

}
