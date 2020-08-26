/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencustaccount;

/**
 *
 * @author sarun
 */
public interface AccountIf {
    public int getAccountNumber();
    public void deposit(double amount);
    public double getBalance();
}
