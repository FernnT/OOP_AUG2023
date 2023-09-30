/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;


import java.util.ArrayList;


/**
 *
 * @author TJ
 */
public class EmployeeRoster {
    private ArrayList<Employee> empList;
    private int max;

   public EmployeeRoster() {
        this.max = 10; 
        this.empList = new ArrayList<>(); 
        
    }

    public EmployeeRoster(int max) {
        this.max = max;
        this.empList = new ArrayList<>();
    }

    public ArrayList<Employee> getEmpList() {
        return empList;
    }

    public void setEmpList(ArrayList<Employee> empList) {
        this.empList = empList;
    }


    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }
    
    public int countHE(){
        
        int j = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof HourlyEmployee){
                j++; 
            }
        }
        return j; 
    }
     public int countPWE(){
        
        int j = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof PieceWorkerEmployee){
                j++; 
            }
        }
        return j;         
    }
     
    public int countCE(){
        
        int j = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof CommisionEmployee){
                j++; 
            }
        }
        return j;         
    }

    public int countBPCE(){
        
        int j = 0;
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i) instanceof BasePlusCommisionEmployee){
                j++; 
            }
        }  
        return j; 
    }
    
      public void displayHE(){
        System.out.println("HourlyEmployees");
         for(int i = 0;i < empList.size(); i++){
             if(empList.get(i) instanceof HourlyEmployee){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",empList.get(i).getEmpID(),empList.get(i).getEmpName(),empList.get(i).getClass().getSimpleName(),empList.get(i).computeSalary());
         
             }
         }
           System.out.println("");
      }
      
      
        public void displayPWE(){
        System.out.println("PieceWorkerEmployees");
         for(int i = 0;i < empList.size(); i++){
             if(empList.get(i) instanceof PieceWorkerEmployee){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",empList.get(i).getEmpID(),empList.get(i).getEmpName(),empList.get(i).getClass().getSimpleName(),empList.get(i).computeSalary());
         
             }
    

            }
         System.out.println("");
    }
    
    public void displayBPCE(){
        System.out.println("BasePlusCommisionEmployees");
         for(int i = 0;i < empList.size(); i++){
             if(empList.get(i) instanceof BasePlusCommisionEmployee){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",empList.get(i).getEmpID(),empList.get(i).getEmpName(),empList.get(i).getClass().getSimpleName(),empList.get(i).computeSalary());
         
             }
    

            }
         System.out.println("");
    }
    
    
    
    
   
    public void displayCE(){
        System.out.println("Commision Employees");
         for(int i = 0;i < empList.size(); i++){
             if(empList.get(i) instanceof CommisionEmployee && !(empList.get(i) instanceof BasePlusCommisionEmployee)){
                  System.out.printf("%10d | %20s | %30s |%10.2f\n",((CommisionEmployee)empList.get(i)).getEmpID(),((CommisionEmployee)empList.get(i)).getEmpName(),((CommisionEmployee)empList.get(i)).getClass().getSimpleName(),((CommisionEmployee)empList.get(i)).computeSalary());
         
             }
    

            }
         System.out.println("");
    }
    
    
    
    
    

    public void displayAllEmployee(){
          System.out.printf("%10s | %20s | %30s |%10s\n", "ID", "NAME", "TYPE", "SALARY");
         for(int i = 0;i <empList.size(); i++){
              System.out.printf("%10d | %20s | %30s |%10.2f\n", empList.get(i).getEmpID(),empList.get(i).getEmpName(),empList.get(i).getClass().getSimpleName(),empList.get(i).computeSalary());
         }  
        
    }
    
    
    public boolean addEmployee(Employee e){
        if(empList.size() < this.max){
            empList.add(e);
            return true;
        }
        return false;
    }
    
    
     public boolean removeEmployee(int id){
        
        for(int i = 0; i < empList.size(); i++){
            if(empList.get(i).getEmpID() == id){
                  empList.remove(i);
                return true;
            }
            
        }
        
        
        return false;
    }
    
    public EmployeeRoster getEmployee(String n){
       
        boolean found = false; 
        //checks if name even exists in the list
        for(int i=0;i< empList.size(); i++){ 
            if(empList.get(i).getEmpName().getfName().equals(n) || empList.get(i).getEmpName().getlName().equals(n)){
                found = true;
                break; 
            }
        }
          
        if(found){            
            EmployeeRoster newRoster = new EmployeeRoster(max);      
            for(int i = 0;i<empList.size();i++){               
                if(empList.get(i).getEmpName().getfName().equals(n) || empList.get(i).getEmpName().getlName().equals(n)){
                    newRoster.empList.add(this.empList.get(i));
                }
            }
        
            return newRoster;
        }
        
        System.out.println("NAME NOT FOUND, RETURNING NULL");
        return null;
    }
    
     
     
      public void updateEmployee(int empID, Name newName, Date newBday, Date newHireDate){
        
        boolean found = false;
        
        for(int i=0;i<empList.size();i++){
            if(empList.get(i).getEmpID() == empID){
                empList.get(i).setEmpName(newName);
                empList.get(i).setEmpBirthDate(newBday);
                empList.get(i).setEmpDateHired(newHireDate);
                found = true;
                break; 
            }
        }
        
        if(found == false){
            System.out.println("EMPLOYEE WITH ID: " + empID + "NOT FOUND");
        }
        
    }
     
     
    
}
