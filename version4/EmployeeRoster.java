/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;

import java.util.Arrays;

/**
 *
 * @author TJ
 */
public class EmployeeRoster {
    private Employee[] empList;
    private int count;
    private int max;

    public EmployeeRoster() {
    this.max = 10; 
    this.empList = new Employee[max];
    
    }

       
    
    public EmployeeRoster(int count, int max) {
        this.count = count;
        this.max = max;
        this.empList = new Employee[max];
    }

    
    public Employee[] getEmplList() {
        return empList;
    }

    public void setEmplList(Employee[] emplList) {
        this.empList = emplList;
      
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    } 
    
    public void displayAllEmployee(){
         System.out.printf("%10s | %20s | %30s |%10s\n", "ID", "NAME", "TYPE", "SALARY");
         for(int i = 0;i < this.count; i++){
               System.out.printf("%10d | %20s | %30s |%10.2f\n",empList[i].getEmpID(),empList[i].getEmpName(),empList[i].getClass().getSimpleName(),empList[i].computeSalary());
         }  
         
    }
    
    public int countHE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof HourlyEmployee){
                j++;
            }
        }
        return j;
    }
    
      public int countPWE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof PieceWorkerEmployee){
                j++;
            }
        }
        return j;
    }
 
      public int countBCPE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof BasePlusCommisionEmployee){
                j++;
            }
        }
        return j;
    }
 
       public int countCE(){
        int j=0;
    
        for(int i=0;i<count; i++){
            if(empList[i] instanceof CommisionEmployee && !(empList[i] instanceof BasePlusCommisionEmployee)){
                j++;
            }
        }
        return j;
    }
    
    
    
    
    
    
    
    
    
    
        public void displayHE(){
        System.out.println("HourlyEmployees");
         for(int i = 0;i < this.count; i++){
             if(empList[i] instanceof HourlyEmployee){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",empList[i].getEmpID(),empList[i].getEmpName(),empList[i].getClass().getSimpleName(),empList[i].computeSalary());
         
             }
    

            }
         System.out.println("");
    }
    
    
        public void displayPWE(){
        System.out.println("PieceWorkerEmployees");
         for(int i = 0;i < this.count; i++){
             if(empList[i] instanceof PieceWorkerEmployee){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",empList[i].getEmpID(),empList[i].getEmpName(),empList[i].getClass().getSimpleName(),empList[i].computeSalary());
         
             }
    

            }
         System.out.println("");
    }
    
    public void displayBPCE(){
        System.out.println("BasePlusCommisionEmployees");
         for(int i = 0;i < this.count; i++){
             if(empList[i] instanceof BasePlusCommisionEmployee){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",empList[i].getEmpID(),empList[i].getEmpName(),empList[i].getClass().getSimpleName(),empList[i].computeSalary());
         
             }
    

            }
         System.out.println("");
    }
    
    
    
    
   
    public void displayCE(){
        System.out.println("Commision Employees");
         for(int i = 0;i < this.count; i++){
             if(empList[i] instanceof CommisionEmployee && !(empList[i] instanceof BasePlusCommisionEmployee)){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",((CommisionEmployee)empList[i]).getEmpID(),((CommisionEmployee)empList[i]).getEmpName(),((CommisionEmployee)empList[i]).getClass().getSimpleName(),((CommisionEmployee)empList[i]).computeSalary());
         
             }
    

            }
         System.out.println("");
    }
  
    
    
    

    
    
    
    
    public boolean addEmployee(Employee e){
        if(this.count < this.max){
            empList[count] = e;
            count++;
            return true;
        }
        
        return false;
    }
    
    public boolean removeEmployee(int id){
        
        for(int i = 0; i < this.count; i++){
            if(empList[i].getEmpID() == id){
                for(int j = i; i < this.count; j++){
                    empList[j] = empList[j+1];
                }
                 empList[this.count-1] = null;
                this.count--;                
                return true;
            }
            
        }
        
        
        return false;
    }
    
  public EmployeeRoster getEmployee(String n){
       
        boolean found = false; 
        //checks if name even exists in the list
        for(int i=0;i< this.count;i++){ 
            if(empList[i].getEmpName().getfName().equals(n) || empList[i].getEmpName().getlName().equals(n)){
                found = true;
                break; 
            }
        }
          
        if(found){            
            EmployeeRoster newRoster = new EmployeeRoster(0,10);      
            for(int i = 0;i<this.count;i++){               
                if(empList[i].getEmpName().getfName().equals(n) || empList[i].getEmpName().getlName().equals(n)){
                    newRoster.empList[newRoster.getCount()] = empList[i];
                    newRoster.setCount(newRoster.getCount()+1);
                }
            }
        
            return newRoster;
        }
        
        System.out.println("NAME NOT FOUND, RETURNING NULL");
        return null;
    }
    
       public void updateEmployee(int empID, Name newName, Date newBday, Date newHireDate){
        
        boolean found = false;
        
        for(int i=0;i<this.count;i++){
            if(empList[i].getEmpID() == empID){
                empList[i].setEmpName(newName);
                empList[i].setEmpBirthDate(newBday);
                empList[i].setEmpDateHired(newHireDate);
                found = true;
                break; 
            }
        }
        
        if(found == false){
            System.out.println("EMPLOYEE ID: " + empID + "NOT FOUND");
        }
        
    }
  
    
    
    
    
    
    
    
    
    
    
    @Override
    public String toString() {
        return "EmployeeRoster{" + "empList=" + Arrays.toString(empList) + ", count=" + count + ", max=" + max + '}';
    }
    
}
