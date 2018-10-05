
import java.util.Date;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author royshawnmcclain
 */
public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0 / 100;
    private java.util.Date dateCreated;

    double monthlyInterestRate;
    double monthlyInterest ;


    
    public Account(int id, double balance) {
        //Added "this" keyword.
        this.id = id;
        this.balance = balance;
        dateCreated = new java.util.Date();
    }
    
    //Added "this" keyword.
    public Account(){
    this(12345,250000);
    }


    int getId() {
        return id;
    }

    void setId(int id) {
        //Added "this" keyword.
        this.id = id;
    }

    double getBalance() {
        
        return balance;
    }

    void setBalance(double balance) {
        //Added "this" keyword.
        this.balance = balance;
    }

    double getAnnualInteresRate() {
        return annualInterestRate / 100;
    }

    void setAnnualInterestRate(double annualInterestRate) {
        //Added "this" keyword.
        this.annualInterestRate = annualInterestRate / 100;
    }

    java.util.Date getDateCreated() {
        return dateCreated;
    }
    

    double getMonthlyInterestRate() {
        
       monthlyInterestRate = (annualInterestRate / 12);
       System.out.println("Your Monthly Interest Rate: "+ monthlyInterestRate);
        return monthlyInterestRate;
    }

    double getMonthlyInterest() {
        
        monthlyInterest = balance * monthlyInterestRate;
        return monthlyInterest;
    }

    double withdraw(double ammountToWithdraw) {
        balance = balance - ammountToWithdraw;
        System.out.println("An ammount of $"+ammountToWithdraw+ " was withdrawn from your account.");
        return balance;
    }

    double deposit(double ammountToDeposit) {
        balance = balance + ammountToDeposit;
        System.out.println("An ammount of $"+ammountToDeposit+ " was deposited into your account.");
        return balance;
    }
    
    void printInfo()
    {
        //Added "this" keyword.
    System.out.println("Your ID is: "+Account.this.id);
    System.out.println("Your Balance is: $"+getBalance());
    System.out.println("Your Monthly Interest is : $"+getMonthlyInterest());
    System.out.println("The Date when this account was created is: "+ getDateCreated());
    }
    

}
