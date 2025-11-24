/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopbasicslab;

/**
 *
 * @author Student
 */
public class Student {
    
    private String name;
    private int age;
    private double grade;
    
    public Student(String name, int age, double grade) {
        
        this.name = name;
        this.age = age;
        this.grade = grade;
        
    }
        public void displayInfo() {
            
           System.out.println( "Student information:" );
           System.out.println( "Name: " + name );
           System.out.println( "Age: " + age );
           System.out.println( "Grade: " + grade );
           
            }
        
    public String getName() {
        
         return name;
         
     }
     
    public void setName( String newName ) {
        
         this.name = newName;

     }
     
    public int getAge() {
        
        return age;
        
    }
    
    public void setAge( int newAge ) {
        
        this.age = newAge;

    }
    
    public double getGrade() {
        
        return grade;
        
    }
    
    public void setGrade( double newGrade ) {
        
        this.grade = newGrade;

    }
        
}
