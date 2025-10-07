/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormconfiguration.controller;

/**
 *
 * @author saibhagawan
 */
import ormconfiguration.Services.UserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Users")
  public class UserController{
      @Autowired
      private UserDetailsService userDetailsService;
      
      @PostMapping("/create")
      @ResponseBody
      public String createUser(
              @RequestParam int id,
              @RequestParam String userName,
              @RequestParam String userAccountNumber,
              @RequestParam String uniqueId,
              @RequestParam String panNumber,
              @RequestParam String Address,
              @RequestParam String phoneNumber,
              @RequestParam String accountType,
              @RequestParam  String ifsccode ){
          
          return "user created Successfully";
      }
      }  

