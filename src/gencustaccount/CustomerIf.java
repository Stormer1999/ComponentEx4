/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gencustaccount;

import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public interface CustomerIf {
    public String getCustomerName();
    public int getNumAccounts();
    public AccountIf getAccount(int accNo);
    public ArrayList<AccountIf> getllAccounts();
}
