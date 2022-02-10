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
public class BankingApp_Midterm {

    
    public static void main(String[] args) {
       Customers Customer[] = new Customers[3];
       
       Customer[0]= new Customers("Bruce","Wayne","Brampton","bWayne","12345");
       Customer[1]= new Customers("Thanos","Badman","North York","tBadman","56789");
       Customer[2]= new Customers("Wonder","Woman","Oakville","wWoman","39087");
       
       Accounts Account[] = new Accounts[4];
       
       Account[0]= new SavingsAccount(1,"Bruce Wayne",500,"Savings");
       Account[1]= new SavingsAccount(2,"Thanos Badman",1000.00,"Savings");
       Account[2]= new CheckingAccount(3,"Wonder Woman",500000.00,"Checking",1500);
       Account[3]= new CheckingAccount(4,"Bruce Wayne",400000.00,"Checking",10000);
       
    }
    
}
