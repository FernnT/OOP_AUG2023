/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignment1bank;

/**
 *
 * @author TJ
 */
public class Assignment1BANK {

    public static void main(String[] args) {
                     
        BankAccount john = new BankAccount(1, 100, "John", "Jmail", 929);

        john.depositing(50); //150 balance
        boolean withdrawSuccess = john.withdraw(30);
        
        
        if (withdrawSuccess) {
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance for withdrawal.");
        }

        // Print John's account details
        System.out.println("Account Number: " + john.getAccountNum());
        System.out.println("Account Balance: $" + john.getAccountBalance());
        System.out.println("Name: " + john.getName());
        System.out.println("Email: " + john.geteMail());
        System.out.println("Phone Number: " + john.getPhoneNum());
    }
}
