/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment1bank;

/**
 *
 * @author TJ
 */
public class BankAccount {
    private int accountNum;
    private int accountBalance;
    private String name;
    private String eMail;
    private int phoneNum;
    
    public BankAccount(){
     
    }

    
    public BankAccount(int accountNum, int accountBalance, String name, String eMail, int phoneNum) {
        this.accountNum = accountNum;
        this.accountBalance = accountBalance;
        this.name = name;
        this.eMail = eMail;
        this.phoneNum = phoneNum;
    }


    
    public int getAccountNum() {
        return accountNum;
    }

    public int getAccountBalance() {
        return accountBalance;
    }

    public String getName() {
        return name;
    }

    public String geteMail() {
        return eMail;
    }

    public int getPhoneNum() {
        return phoneNum;
    }
    
    public boolean withdraw(int amm){
      if(this.accountBalance - amm <= 0 ){
          return false;
      }else{
          this.accountBalance -= amm;
          return true;
      }
    }
  
    public boolean depositing(int amm){
        if(amm>0){
            this.accountBalance+=amm;
            return true;
        }
        
        return false;
        
        
    }
    
}
