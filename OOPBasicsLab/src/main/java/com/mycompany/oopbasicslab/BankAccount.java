/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopbasicslab;
/**
 *
 * @author Student
 */
public class BankAccount {
    
    
    private String accountHolder = "Kane Paul Mari";
    private double balance;
    
    public BankAccount ( String accountHolder, double initialbalance ) {
        
        this.accountHolder = accountHolder;
        this.balance = balance;
        
    }
    
    public double deposit(double amount) {
          
        this.balance = balance + amount;
        return this.balance;
        
    }
    
    public double withdraw( double amount ) {
        
        this.balance = balance - amount;
        return this.balance;
        
    }
    
    public void displayBalance() {
        
        System.out.println( "Current balance is: " + balance + " Php." );
        
    }
    
}
