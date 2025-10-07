/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormconfiguration.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author saibhagawan
 */
@Entity
@Table(name="UsersDetailsList")
public class UserDetails {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String userAccountNumber;
    private String  userName;
    private String uniqueId;
    private String panNumber;
    private String Address;
    private String phoneNumber;
    private String accountType;
    private String ifsccode;
    
    public UserDetails(int id,String userName,String userAccountNmber,String uniqueId,String panNumber,String Address,String PhoneNumber,String accountType,String ifsccode){
        this.id = id;
        this.userName = userName;
        this.userAccountNumber = userAccountNumber;
        this.uniqueId = uniqueId;
        this.panNumber = panNumber;
        this.Address = Address;
        this.phoneNumber = phoneNumber;
        this.accountType = accountType;
        this.ifsccode = ifsccode;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id = id;
    }
    public String getuserAccountNumber(){
        return userAccountNumber;
    }
    public void setuserAccountNumber(){
        this.userAccountNumber =userAccountNumber;
    }
    public String getUserName(){
        return userName;
    }
    public void setUsername(){
        this.userName  = userName;
    }
    public String getUniqueId(){
        return uniqueId;
    }
    public void setUniqueId(){
        this.uniqueId = uniqueId;
    }
    public String getPanNumber(){
        return panNumber;
    }
    public void setPanNumber(){
        this.panNumber = panNumber;
    }
    public String getAddress(){
        return Address;
    }
    public void setAddress(){
        this.Address = Address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhonenumber(){
        this.phoneNumber = phoneNumber;
    }
    public String AccountType(){
        return accountType;
    }
    public void SetAccountType(){
        this.accountType = accountType;
    }
    public String setIfsccode(){
        return ifsccode;
    }
    public void getifsccode(){
        this.ifsccode = ifsccode;
    }
}
