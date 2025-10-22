/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transactions;


import org.springframework.stereotype.Component;
/**
 *
 * @author saibhagawan
 */
@Component
public class AccountTransactions extends Accoutoperations {
    
    @Override
    public String moneyDeposited(int deposit) {
         amount += deposit;
         String strnumber = Integer.toString(amount);
         return strnumber;
    }

    @Override
    public String moneyWithdrawn( int withdrawl) {
          if( withdrawl<amount){
              System.out.println("amout before withdrawl"+amount);
             amount -= withdrawl;
             String strnumber = Integer.toString(amount);
             System.out.println("amount after withdrawl"+amount);
             return  ":"+" "+strnumber;
          }else{
              return ": Insufficiemt Balnce in your account unable to process  the transaction";
          }
              
        
    }

    @Override
    public String moneyPresentinAccount() {
        System.out.println(amount);
        return "balance" +" "+ amount;
               
    }
    
}
