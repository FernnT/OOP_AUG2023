/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.version1;


/**
 *
 * @author User
 */
public class HourlyEmployee {
    private int empID;
    private String empName;
    private Date empBirthDate;
    private Date empHiredDate;
    private float totalHoursWorked;
    private float ratePerHour;

    public HourlyEmployee() {
         
    }

    public HourlyEmployee(int empID, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }

    
    public HourlyEmployee(int empID, String empName, Date empBirthDate, Date empHiredDate, float totalHoursWorked, float ratePerHour) {
        this.empID = empID;
        this.empName = empName;
        this.empBirthDate = empBirthDate;
        this.empHiredDate = empHiredDate;
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
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

    public float getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(float ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

   
    
    public double computeSalary(){
        if(this.totalHoursWorked > 40){
            float ot = this.totalHoursWorked - 40;
            float excessSalary = (ot * this.ratePerHour) * 1.5F;
            float salary = this.ratePerHour * this.totalHoursWorked;
            
            return (salary + excessSalary);
            
        }else{
               float salary = this.ratePerHour * this.totalHoursWorked;
               
               return salary;
        }
       
    }
    
    /*  private int empID;
    private String empName;
    private Date empBirthDate;
    private Date empHiredDate;
    private float totalHoursWorked;
    private float ratePerHour;*/
    public void displayInfo(){
        System.out.println("NAME: " + this.empName);
        System.out.println(" ID: "+ this.empID );
        System.out.println(" BDAY: " +this.empBirthDate);
        System.out.println(" HIRED DATE: " +this.empHiredDate);
        System.out.println(" HOURSWORKED: " + this.totalHoursWorked);
        System.out.println(" RATEPERHOUR " + this.ratePerHour);
        
    }
    
     @Override
    public String toString() {
        return "HourlyEmployee{" + "empID=" + empID + ", empName=" + empName + ", empBirthDate=" + empBirthDate + ", empHiredDate=" + empHiredDate + ", totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour + '}';
    }
    
}
