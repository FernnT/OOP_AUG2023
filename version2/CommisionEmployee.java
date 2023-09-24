/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version2;

/**
 *
 * @author TJ
 */
public class CommisionEmployee extends Employee {
    private double totalSales; 

    public CommisionEmployee() {
        super();
    }
    
     public CommisionEmployee(int empID, double totalSales) {
        super(empID);
        this.totalSales = totalSales;
    }

    public CommisionEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, double totalSales) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalSales = totalSales;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }
 
    
    public double computeSalary(){
     double salary = 0;
     
        if(this.totalSales < 50000){
            salary = this.totalSales * .05;
             return salary;
             
        }else if(this.totalSales >=50000 && this.totalSales <100000){
            salary = this.totalSales * .2;
             return salary;
             
        }else if(this.totalSales >=100000 && this.totalSales <500000){
             salary = this.totalSales * .3;
              return salary;
              
        }else if(this.totalSales > 500000){
            salary = this.totalSales * .5;
             return salary;
        }
        
        
        return salary;
        
        
    }
    
     public void displayInfo(){
       System.out.println("NAME: " + getEmpName());
        System.out.println(" ID: "+ getEmpID() );
        System.out.println(" BDAY: " + getEmpBirthDate());
        System.out.println(" HIRED DATE: " + getEmpDateHired());
        System.out.println("SALES:" + this.totalSales);
        
    }
    
      @Override
    public String toString() {
        return "CommisionEmployee{" + "empID=" + getEmpID() + ", empName=" + getEmpName() + ", empBirthDate=" + getEmpBirthDate() + ", empHiredDate=" + getEmpDateHired() + '}';
    }
    
    
}
