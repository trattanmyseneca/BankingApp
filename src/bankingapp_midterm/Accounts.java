/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankingapp_midterm;

/**
 *
 * @author T
 */
public abstract class Accounts {
    
    private int AccountNo;
          double Balance;
 private String Type;
 private String Customer;
 
 public Accounts()
 {

 }
 
 public Accounts(int acn, double bal, String tp, String cm)
 {
     this.AccountNo=acn;
     this.Balance=bal;
     this.Type=tp;
     this.Customer=cm;
 }
 
 public Accounts(double balance)
 {
    this.Balance=balance;
 }

 public abstract boolean deposit(double deposit_amount);
 public abstract boolean withdraw(double withdrawl_amount);
     
}
