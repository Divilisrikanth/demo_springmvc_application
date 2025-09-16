/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trnasactions;

/**
 *
 * @author saibhagawan
 */
public class AccountTransactions extends Accoutoperations {

    @Override
    public String moneyDeposited(int deposit) {
         amount += deposit;
         return "balnce after deposit" +" "+amount;
    }

    @Override
    public String moneyWithdrawn(int withdrawl) {
          amount -= withdrawl;
        return "balance aftwr withdrawl" +" "+amount;
    }

    @Override
    public String moneyPresentinAccount() {
        System.out.println(amount);
        return "balance" +""+ amount;
               
    }
    
}
