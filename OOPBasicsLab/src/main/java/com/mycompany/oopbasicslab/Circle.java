/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopbasicslab;

/**
 *
 * @author Student
 */
public class Circle {
    
    private double radius;
    private double area;
    private double circumference;
    
    public Circle( double radius ) {
        
        this.radius = radius;
        this.area = Math.PI * Math.pow( radius, 2 );
        this.circumference = Math.PI * 2 * radius;
        
    }

    public double getArea() {
        
        return this.area;
        
    }
    
    public double getCircumference() {
        
        return this.circumference;
        
    }
    
    public void displayDetails() {
        
        System.out.println( "Circle details: " );
        System.out.println( "Area: " + this.area + " square units.");
        System.out.println( "Circumference: " + this.circumference + " units." );
        
    }
    
}
