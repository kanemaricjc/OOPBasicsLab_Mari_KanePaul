/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oopbasicslab;
import java.util.Scanner;
/**
 *
 * @author Student
 */



public class OOPBasicsLab {
    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); 
        System.out.println("Activity 1: ");
        System.out.println();
        
            Student student1 = new Student( "Kane Paul Mari", 18, 95.63 );
            Student student2 = new Student( "Fernan Carl Nerosa", 19, 94.27 );
            
                student1.displayInfo();
            System.out.println();
                student2.displayInfo();
            System.out.println();
                
        System.out.println("Activity 2: ");
        System.out.println();
        
                student1.setName("Cornelio Jose");
                student1.setAge(17);
                student1.setGrade(96.12);
                student2.setName("Sophia Nicole");
                student2.setAge(11);
                student2.setGrade(91.12);
                
                System.out.println( "Student information:" );
           System.out.println( "Name: " + student1.getName() );
           System.out.println( "Age: " + student1.getAge() );
           System.out.println( "Grade: " + student1.getGrade() );
           
        System.out.println();
                student2.displayInfo();
        
        System.out.println();
        
        System.out.println("Activity 3: ");
        System.out.println();
            
            Vehicle vehicle1 = new Vehicle( "BMW", "Adventure R 1250 GS", 60 ); 
            vehicle1.displayStatus();
            
        System.out.println();
            
            Vehicle vehicle2 = new Vehicle( "Porsche", "911 Carera GTS", 100 ); 
            vehicle2.displayStatus();
            
        System.out.println();
        
        System.out.println("Activity 4: ");
        System.out.println();
        
        String choice= "" ;
        BankAccount bank1 = new BankAccount ( "Kane Paul Mari", 500 );
        while( !choice.equals("4") ) {
            
            System.out.println( " ----Bank Account Information---- " );
            System.out.println( "Account Name: Kane Paul Mari " );
            System.out.println("1. Deposit ");
            System.out.println("2. Withdraw ");
            System.out.println("3. Check Balance ");
            System.out.println("4. Exit ");
            System.out.print("Enter a choice: ");
            choice = input.nextLine();
            
                if ( choice.equals("1") ) {
                    
                    System.out.print("Please input an amount (in Php): ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    bank1.deposit(amount);
                    System.out.println(amount + " Php was added to your account.");
                    
                } else if ( choice.equals("2") ) {
                    
                    System.out.print("Please input an amount (in Php): ");
                    double amount = input.nextDouble();
                    input.nextLine();
                    bank1.withdraw(amount);
                    System.out.println(amount + " Php was deducted from your account.");
                    
                } else if ( choice.equals("3") ) {
                    bank1.displayBalance();
                }
                
            System.out.println();
        }
        
        System.out.println("Activity 5: ");
        System.out.println();
        
        Circle circle1 = new Circle(5);
            System.out.println("Circle 1");
            System.out.println();
            System.out.println("Radius: 5");
            System.out.println("Area: " + circle1.getArea() + " square units. (Get area method)");
            System.out.println("Circumference: " + circle1.getCircumference() +  " units. (Get circumference method)" );
        System.out.println();
            circle1.displayDetails();
        System.out.println();
        
        Circle circle2 = new Circle(8);
            System.out.println("Circle 2");
            System.out.println();
            System.out.println("Radius: 8");
            System.out.println("Area: " + circle2.getArea() + " square units. (Get area method)");
            System.out.println("Circumference: " + circle2.getCircumference() +  " units. (Get circumference method)" );
        System.out.println();
            circle2.displayDetails();
        System.out.println();
                
                            
    }
}
