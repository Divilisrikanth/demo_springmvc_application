/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.samplespringwebmvcapplication.controller;
import ormconfiguration.Services.UserDetailsService;
/**
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

@Controller
public class Routes {
    AccountTransactions transactions = new AccountTransactions();
    @RequestMapping("/homepage")
    @ResponseBody
    public String showHomePage(){
        return "Home page view";
    }
    @RequestMapping("/deposit")
    
    public String showDepositusPage(Model model){
        String resultafterdeposit = transactions.moneyDeposited(800);
        String resultedbalanceafterdeposit = transactions.moneyPresentinAccount();
        System.out.println("in controller"+""+resultedbalanceafterdeposit);
        model.addAttribute("message","money successfully deposited into your Account :"+ resultedbalanceafterdeposit);
        return "Deposit";
    }
   @RequestMapping("/withdrawl")
   
   public String showWithDrawlPage(Model model){
       String resultafterwithdrawl = transactions.moneyWithdrawn(100);
       String resultedbalanceafterwithdrawl = transactions.moneyPresentinAccount();
       model.addAttribute("message","money successfully withdrawn from your account "+"balance after withdrawn"+resultedbalanceafterwithdrawl);
       return "withdrawn";
   }
  
 
      
  
      
  }
   
   
    

