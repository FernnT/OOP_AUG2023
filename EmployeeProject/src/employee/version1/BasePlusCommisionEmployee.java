/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version1;

/**
 *
 * @author TJ
 */
public class BasePlusCommisionEmployee {
    private int empID;
    private String empName;
    private Date empBirthDate;
    private Date empHiredDate;
    private float totalHoursWorked;
    private double totalSales;
    private double baseSalary;

    public BasePlusCommisionEmployee() {
    }

    public BasePlusCommisionEmployee(int empID, float totalHoursWorked, float ratePerHour, double totalSales, double baseSalary) {
        this.empID = empID;
        this.totalHoursWorked = totalHoursWorked;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    
    

    public BasePlusCommisionEmployee(int empID, String empName, Date empBirthDate, Date empHiredDate, float totalHoursWorked, float ratePerHour, double totalSales, double baseSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empHiredDate = empHiredDate;
        this.totalHoursWorked = totalHoursWorked;
        this.totalSales = totalSales;
        this.baseSalary = baseSalary;
    }
    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public Date getEmpBirthDate() {
        return empBirthDate;
    }

    public void setEmpBirthDate(Date empBirthDate) {
        this.empBirthDate = empBirthDate;
    }

    public Date getEmpHiredDate() {
        return empHiredDate;
    }

    public void setEmpHiredDate(Date empHiredDate) {
        this.empHiredDate = empHiredDate;
    }

    public float getTotalHoursWorked() {
        return totalHoursWorked;
    }

    public void setTotalHoursWorked(float totalHoursWorked) {
        this.totalHoursWorked = totalHoursWorked;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
      
    }
    
    
    
    public double computeSalary(){
        double salary = 0;
        if(this.totalSales < 50000){
            salary = this.baseSalary + (this.totalSales * .05);
             return salary;
             
        }else if(this.totalSales >=50000 && this.totalSales <100000){
            salary = this.baseSalary + (this.totalSales * .2);
             return salary;
             
        }else if(this.totalSales >=100000 && this.totalSales <500000){
             salary = this.baseSalary + (this.totalSales * .3);
              return salary;
              
        }else if(this.totalSales > 500000){
            salary = this.baseSalary + (this.totalSales * .5);
             return salary;
        }
        
        
        return salary;
    }
    
     public void displayInfo(){
       System.out.println("NAME: " + this.empName);
        System.out.println(" ID: "+ this.empID );
        System.out.println(" BDAY: " +this.empBirthDate);
        System.out.println(" HIRED DATE: " +this.empHiredDate);
        System.out.println("Hours: " + this.totalHoursWorked);
        System.out.println(" BASE SALARY " + this.baseSalary);
        System.out.println("SALES:" + this.totalSales);
        
    }
    

    @Override
    public String toString() {
        return "BasePlusCommisionEmployee{" + "empID=" + empID + ", empName=" + empName + ", empBirthDate=" + empBirthDate + ", empHiredDate=" + empHiredDate + ", totalHoursWorked=" + totalHoursWorked + ", totalSales=" + totalSales + ", baseSalary=" + baseSalary + '}';
    }
    
    
}
