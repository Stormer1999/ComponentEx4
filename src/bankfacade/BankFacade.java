/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author Stormer
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int acc1No1 = 0001,
            acc1No2 = 0002,
            acc2No1 = 1000,
            acc2No2 = 2000;

       ArrayList<AccountIf> cust1account = new ArrayList();
       CustomerIf cust1 = new BankCustomer("Person1", cust1account);

       ArrayList<AccountIf> cust2account = new ArrayList();
       CustomerIf cust2 = new BankCustomer("Person2", cust2account);

       BankFacade bfk = new BankFacade();

       bfk.doDeposit(250, cust1, acc1No1);
       bfk.getBankAccount(cust1, acc1No1);
       bfk.doDeposit(500, cust1, acc1No2);
       bfk.getBankAccount(cust1, acc1No2);
       bfk.getBankCustomer("Person1");
/*
       bfk.doDeposit(10000, cust2, acc2No1);
       bfk.doDeposit(20000, cust2, acc2No2);
       bfk.getBankAccount(cust2, acc2No1);
       bfk.getBankAccount(cust2, acc2No2);
       bfk.getBankCustomer("Person2");*/

       bfk.doDeposit(25000, cust2, acc2No1);
       bfk.getBankAccount(cust2, acc2No1);
       bfk.doDeposit(50000, cust2, acc2No2);
       bfk.getBankAccount(cust2, acc2No2);
       bfk.getBankCustomer("Person2");
   }// main

       ArrayList<AccountIf> cust1account = new ArrayList();
       CustomerIf cust1 = new BankCustomer("Person1", cust1account);

       ArrayList<AccountIf> cust2account = new ArrayList();
       CustomerIf cust2 = new BankCustomer("Person2", cust2account);

        //global variable for facade

   void doDeposit(double amt, CustomerIf cust, int accNo) {
       AccountIf acc ;
       String tempName = cust.getCustomerName();
       switch(tempName){
           case "Person1": 
                acc=cust1.getAccount(accNo);
                if(acc != null){ 
                    acc.deposit(amt); 
                    return;
                }
                else{
                    acc = new BankAccount(accNo);
                    acc.deposit(amt);
                    cust1account.add(acc);
                    CustomerIf cust1 = new BankCustomer("Person1", cust1account);
                }break; 

           case "Person2": 
           acc=cust2.getAccount(accNo);
                if(acc != null){ 
                    acc.deposit(amt); 
                    return;
                }
                else{
                    acc = new BankAccount(accNo);
                    acc.deposit(amt);
                    cust2account.add(acc);
                    CustomerIf cust2 = new BankCustomer("Person2", cust2account);
                }break;

           default:System.out.println("Error");break;
       }
   }// doDeposit

   void getBankAccount(CustomerIf cust, int accNo) {
       AccountIf acc ;
       switch (cust.getCustomerName()) {
            case "Person1":
                acc = cust1.getAccount(accNo);
                System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
                break;
            case "Person2":
                acc = cust2.getAccount(accNo);
                System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
                break;
           default:
                break;
       }
   }// getBankAccount

   void getBankCustomer(String custName) {
       if(custName=="Person1"){
            ArrayList<AccountIf> account1 = cust1.getllAccounts();
            System.out.println("Account Data:");
            System.out.println("Name = " + cust1.getCustomerName());
            System.out.println("Has " + cust1.getNumAccounts() + " accounts");
            AccountIf account ;
            for (int i = 0 ; i < account1.size (); i++) {
                account = account1.get(i);
                System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            }
       }
       else if (custName=="Person2"){
            ArrayList<AccountIf> account2 = cust2.getllAccounts();
            System.out.println("Account Data:");
            System.out.println("Name = " + cust2.getCustomerName());
            System.out.println("Has " + cust2.getNumAccounts() + " accounts");
            AccountIf account ;
            for (int i = 0 ; i < account2.size (); i++) {
                account = account2.get(i);
                System.out.println("Account Number: " + account.getAccountNumber() + " has " + account.getBalance());
            }
        }
   }//getBankCustomer
}
