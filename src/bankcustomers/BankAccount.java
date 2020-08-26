/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcustomers;

import gencustaccount.AccountIf;

/**
 *
 * @author sarun
 */
public class BankAccount implements AccountIf {
    private double balance = 0;
    private int accountNumber = 999;

    public BankAccount(int accNo) {
        accountNumber = accNo;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public double getBalance() {
        return balance;
    }
    
}
