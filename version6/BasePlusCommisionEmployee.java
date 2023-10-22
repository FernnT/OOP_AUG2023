/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;

import employee.version5.*;
import employee.version4.*;
import employee.version3.*;

/**
 *
 * @author TJ
 */
public class BasePlusCommisionEmployee extends CommisionEmployee{
      private double baseSalary; 

    public BasePlusCommisionEmployee() {
        super(); 
    }

     public BasePlusCommisionEmployee(int empID, double totalSales, double baseSalary) {
        super(empID,totalSales);
        this.baseSalary = baseSalary;
    }

    public BasePlusCommisionEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, double totalSales, double baseSalary) {
        super(empID, empName, empDateHired, empBirthDate, totalSales); 
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
    
    
    
    @Override
    public double computeSalary(){
        return super.computeSalary() + this.baseSalary;  
        
    }
    
    @Override
     public void displayInfo(){
       System.out.println("NAME: " + getEmpName());
        System.out.println(" ID: "+ getEmpID() );
        System.out.println(" BDAY: " + getEmpBirthDate());
        System.out.println(" HIRED DATE: " + getEmpDateHired());
        System.out.println(" BASE SALARY " + this.baseSalary);
        System.out.println("SALES:" + getTotalSales());
        
    }
     @Override
    public String toString() {
        return "BasePlusCommisionEmployee{" + "empID=" + getEmpID() + ", empName=" + getEmpName() + ", empBirthDate=" + getEmpBirthDate() + ", empHiredDate=" +getEmpDateHired() + ", baseSalary=" + baseSalary + '}';
    }
}
