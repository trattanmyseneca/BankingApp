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
public class CheckingAccount extends Accounts {

    private double overdraft;

    public CheckingAccount() {

    }

    public CheckingAccount(int Accountno, String CustomerName, double Balance, String Type, double overdraft) {
        super(Accountno, Balance, Type, CustomerName);
        this.overdraft = overdraft;
    }

    @Override
    public boolean deposit(double deposit_amount) {
        this.Balance = this.Balance + deposit_amount;
        return true;
    }

    @Override
    public boolean withdraw(double withdrawl_amount) {

        if (withdrawl_amount <= this.Balance+overdraft) {
            this.Balance = this.Balance - withdrawl_amount;
            return true;
        } else {
            return false;
        }
    }

}
