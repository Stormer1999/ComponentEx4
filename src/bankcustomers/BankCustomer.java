/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankcustomers;

import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankCustomer implements CustomerIf {
    private String name;
    private ArrayList<AccountIf> accounts;

    public BankCustomer(String name, ArrayList<AccountIf> accounts) {
        this.name = name;
        this.accounts = accounts;
    }
    
    @Override
    public String getCustomerName() {
        return name;
    }

    @Override
    public int getNumAccounts() {
        return accounts.size();
    }

    @Override
    public AccountIf getAccount(int accNo) {
        AccountIf account = null;
        for (int i = 0 ; i < accounts.size (); i++) {
            if (accounts.get(i).getAccountNumber() == accNo) {
                account = accounts.get(i);
                break;
            }
        }
        return account;
    }
    
    @Override
    public ArrayList<AccountIf> getllAccounts() {
        return accounts;
    }
}
