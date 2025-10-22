/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samplespringwebmvcapplication.controller;
/*
 *
 * @author saibhagawan
 */
import Transactions.AccountTransactions;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
//import ormconfiguration.Services.UserDetailsService;

@Controller
public class Routes {
   @Autowired
   private  AccountTransactions transactions;
   //AccountTransactions transactions = new AccountTransactions();
    @RequestMapping("/homepage")
    @ResponseBody
    public String showHomePage(){
        return "Home page view";
    }
    @PostMapping("/deposit")
    
    public String showDepositusPage(@RequestParam("amount") String amount, Model model){
     
        double amountValue = Double.parseDouble(amount);
         String resultafterdeposit = transactions.moneyDeposited((int)amountValue);
        String resultedbalanceafterdeposit = transactions.moneyPresentinAccount();
        System.out.println("in controller"+""+resultedbalanceafterdeposit);
        model.addAttribute("message","money successfully deposited into your Account :"+ resultedbalanceafterdeposit);
        return "Deposit";
    }
   @PostMapping("/withdrawl")
   
   public String showWithDrawlPage(@RequestParam("amount")String amount ,Model model){
       double amountValue = Double.parseDouble(amount);
   
       String resultafterwithdrawl = transactions.moneyWithdrawn((int)amountValue);
       //String resultedbalanceafterwithdrawl = transactions.moneyPresentinAccount();
       model.addAttribute("message","money successfully withdrawn from your account "+"balance after withdrawn"+resultafterwithdrawl);
      return "withdrawn";
   }

}

 
      

      
  
   
   
    

