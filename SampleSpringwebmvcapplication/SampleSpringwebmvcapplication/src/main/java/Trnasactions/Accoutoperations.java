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
abstract class Accoutoperations {
    protected int amount=0;
    private int withdrawl;
    private int deposit;
    
    abstract String moneyDeposited(int deposit);
    abstract String moneyWithdrawn(int withdrawl);
    abstract String moneyPresentinAccount();
    
}
