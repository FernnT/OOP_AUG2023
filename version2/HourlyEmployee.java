/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version2;

/**
 *
 * @author TJ
 */
public class HourlyEmployee extends Employee {
     private float totalHoursWorked; 
     private float ratePerHour; 
     
     public HourlyEmployee() {
        super(); 
    }
    
     public HourlyEmployee(int empID, float totalHoursWorked, float ratePerHour) {
        super(empID);
        this.totalHoursWorked = totalHoursWorked;
        this.ratePerHour = ratePerHour;
    }
    
    
    public HourlyEmployee(int empID, String empName, Date empDateHired, Date empBirthDate, float totalHourWorked, float ratePerHour) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalHoursWorked = totalHourWorked;
        this.ratePerHour = ratePerHour;      
    }

    public float getTotalHourWorked() {
        return totalHoursWorked;
    }

    public void setTotalHourWorked(float totalHourWorked) {
        this.totalHoursWorked = totalHourWorked;
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
     
      public void displayInfo(){
        System.out.println("NAME: " + getEmpName());
        System.out.println(" ID: "+ getEmpID() );
        System.out.println(" BDAY: " + getEmpBirthDate());
        System.out.println(" HIRED DATE: " + getEmpDateHired());
        System.out.println(" HOURSWORKED: " + this.totalHoursWorked);
        System.out.println(" RATEPERHOUR " + this.ratePerHour);
        
    }
    
     @Override
    public String toString() {
        return "HourlyEmployee{" + "empID=" + getEmpID() + ", empName=" + getEmpName() + ", empBirthDate=" + getEmpDateHired() + ", empHiredDate=" + getEmpDateHired() + ", totalHoursWorked=" + totalHoursWorked + ", ratePerHour=" + ratePerHour + '}';
    }
     
     
     
     
     
}
