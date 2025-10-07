/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samplespringwebmvcapplication.controller;

/**
 *
 * @author saibhagawan
 */
import Trnasactions.AccountTransactions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Routes {
    AccountTransactions transactions = new AccountTransactions();
    @RequestMapping("/homepage")
    @ResponseBody
    public String showHomePage(){
        return "Home page view";
    }
    @RequestMapping("/deposit")
    @ResponseBody
    public String showDepositusPage(){
        String resultafterdeposit = transactions.moneyDeposited(800);
        String resultedbalanceafterdeposit = transactions.moneyPresentinAccount();
        System.out.println("in controller"+""+resultedbalanceafterdeposit);
        return "money successfully deposited into your Account :"+ resultedbalanceafterdeposit;
    }
   @RequestMapping("/withdrawl")
   @ResponseBody
   public String showWithDrawlPage(){
       String resultafterwithdrawl = transactions.moneyWithdrawn(100);
       String resultedbalanceafterwithdrawl = transactions.moneyPresentinAccount();
       return "money successfully withdrawn from your account "+"balance after withdrawn"+resultedbalanceafterwithdrawl;
   }
  
    
}
