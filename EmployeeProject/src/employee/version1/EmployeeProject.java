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
public class EmployeeProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
///////////HourlyEmployee default constructor///////////////////////////////////
            HourlyEmployee emp1 = new HourlyEmployee();
            emp1.setEmpID(1);
            emp1.setEmpName("Emp1");
            emp1.setEmpBirthDate(new Date(1,2,1990));
            emp1.setEmpHiredDate(new Date(11,22,2023));
            emp1.setTotalHoursWorked(5);
            emp1.setRatePerHour(2);
        //ComputeSalary()
            System.out.println("SALARY: " + emp1.computeSalary());
        //DisplayInfo()
            emp1.displayInfo();
     
        //ToString()
            System.out.println("TO STRING: ");
            System.out.println(emp1);
            System.out.println("");
        
            
//////////HourlyEmloyee no name and date constructor//////////////////////////
              HourlyEmployee emp2 = new HourlyEmployee(2,100,2);
              emp2.setEmpName("Emp2");
              emp2.setEmpBirthDate(new Date(3,10,1970));
              emp2.setEmpHiredDate(new Date(12,12,2020));
         //ComputeSalary()
            System.out.println("SALARY: " + emp2.computeSalary());
        //DisplayInfo()
            emp2.displayInfo();
        //ToString()
            System.out.println("TO STRING: ");
            System.out.println(emp2);
            System.out.println("");
            
/////////HourlyEmployee with full constructor////////////////////////////////
        HourlyEmployee emp3 = new HourlyEmployee(3,"Emp3", new Date(12,12,1912), new Date(11,11,2021), 500, 3);
         //ComputeSalary()
            System.out.println("SALARY: " + emp3.computeSalary());
        //DisplayInfo()
            emp3.displayInfo();
        //ToString()
            System.out.println("TO STRING: ");
            System.out.println(emp3);
            System.out.println("");
 
////////////////////////////////////////////////////////////////////////////////            
            
        //PieceWorkerEmployee default constructor.//////////////////////////////
           PieceWorkerEmployee  pEmp1 = new PieceWorkerEmployee();
           pEmp1.setEmpID(1);
           pEmp1.setEmpName("pEmp1");
           pEmp1.setEmpDateHired(new Date(2,2,2222));
           pEmp1.setEmpBirthDate(new Date(1,1,1111));
           pEmp1.setRatePerPiece(2);
           pEmp1.setTotalPiecesFinished(200);
            //ComputeSalary()
            System.out.println("SALARY: " + pEmp1.computeSalary());
             //DisplayInfo()
            pEmp1.displayInfo();
           //ToString()
            System.out.println("TO STRING: ");
            System.out.println(pEmp1);
            System.out.println("");
  
         
        //PieceWorkerEmployee no name and date constructor//////////////////////
         PieceWorkerEmployee  pEmp2 = new PieceWorkerEmployee(2,"pEmp1",350, 2);
         pEmp2.setEmpName("pEmp2");
         pEmp2.setEmpBirthDate(new Date (10,10,2010));
         pEmp2.setEmpDateHired(new Date(21,12,2020));
         //ComputeSalary()
         System.out.println("SALARY: " + pEmp2.computeSalary());
         //DisplayInfo()
         pEmp2.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(pEmp2);
          System.out.println("");
          
        //PieceWorkerEmployee full constructor//////////////////////////////////
        PieceWorkerEmployee pEmp3 = new PieceWorkerEmployee(3,"pEmp3",new Date(6,7,1992),new Date(8,9,1920),400, 2);
        //ComputeSalary()
         System.out.println("SALARY: " + pEmp3.computeSalary());
         //DisplayInfo()
         pEmp3.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(pEmp3);
           System.out.println("");
////////////////////////////////////////////////////////////////////////////////  
        //CommisionEmployee default constructor////////////////////////////////
        CommisionEmployee cEmp1 = new CommisionEmployee();
        cEmp1.setEmpID(1);
        cEmp1.setEmpName("cEmp1");
        cEmp1.setEmpBirthDate(new Date(9,12,1995));
        cEmp1.setEmpHiredDate(new Date(1,12,2023));
        cEmp1.setTotalHoursWorked(250);
        cEmp1.setRatePerHour(2);
        cEmp1.setTotalSales(40000);
        //ComputeSalary()
         System.out.println("SALARY: " + cEmp1.computeSalary());
         //DisplayInfo()
         cEmp1.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(cEmp1);
          System.out.println("");
          
         //CommisionEmployee no name and date constructor///////////////////////
         CommisionEmployee cEmp2 = new CommisionEmployee(2,300,2,50000);
         cEmp2.setEmpName("cEmp2");
         cEmp2.setEmpBirthDate(new Date(7,8,1910));
         cEmp2.setEmpHiredDate(new Date(1,9,2001));
          //ComputeSalary()
         System.out.println("SALARY: " + cEmp2.computeSalary());
         //DisplayInfo()
         cEmp2.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(cEmp2);
          System.out.println("");
          
           //CommisionEmployee full constructor////////////////////////////////
            CommisionEmployee cEmp3 = new CommisionEmployee(3,"cEmp3",new Date(6,7,1967),new Date(1,12,2021),100, 2,60000);
             //ComputeSalary()
         System.out.println("SALARY: " + cEmp3.computeSalary());
         //DisplayInfo()
         cEmp3.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(cEmp3);
          System.out.println("");
          
////////////////////////////////////////////////////////////////////////////////
            //BasePlusCommisionEmployee default constructor/////////////////////
            BasePlusCommisionEmployee bEmp1 = new BasePlusCommisionEmployee();
            bEmp1.setEmpID(1);
            bEmp1.setEmpName("bEmp1");
            bEmp1.setEmpBirthDate(new Date(9,9,1999));
            bEmp1.setEmpHiredDate(new Date(9,9,2000));
            bEmp1.setTotalHoursWorked(100);
            bEmp1.setTotalSales(100000);
            bEmp1.setBaseSalary(20000);
            
         //ComputeSalary()
         System.out.println("SALARY: " + bEmp1.computeSalary());
         //DisplayInfo()
         bEmp1.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(bEmp1);
          System.out.println("");
            
          ////BasePlusCommisionEmployee no name no date constructor////////////
           BasePlusCommisionEmployee bEmp2 = new BasePlusCommisionEmployee(2, 200, 2,200000, 1000);
           bEmp2.setEmpName("bEmp2");
           bEmp2.setEmpBirthDate(new Date(2,2,2000));
           bEmp2.setEmpHiredDate(new Date(22,2,2022));
           
          //ComputeSalary()
         System.out.println("SALARY: " + bEmp2.computeSalary());
         //DisplayInfo()
         bEmp2.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(bEmp2);
          System.out.println("");
           
          //BasePlusCommisionEmployee full constructor/////////////////////////
            BasePlusCommisionEmployee bEmp3 = new BasePlusCommisionEmployee(3, "bEmp3",new Date(31,3,2003),new Date(3,3,2023), 300, 3, 300000, 300);
              //ComputeSalary()
         System.out.println("SALARY: " + bEmp3.computeSalary());
         //DisplayInfo()
         bEmp3.displayInfo();
         //ToString()
          System.out.println("TO STRING: ");
          System.out.println(bEmp3);
          System.out.println("");
        
        
        
//        HourlyEmployee jay = new HourlyEmployee(1,"JAY",new Date(10,12,2020),new Date(10,12,1990),12,12);
//        PieceWorkerEmployee tee = new PieceWorkerEmployee(2,"TEE",new Date(1,2,2023),new Date(10,11,2000), 100,2);
//        //int empID, String empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece
//        
//       System.out.println("HOURLY SLAVE"); 
//       jay.displayInfo();
//       System.out.println("Salary: " + jay.computeSalary());
//       
//       System.out.println("");
//       
//       System.out.println("FACTORY SLAVE");
//       tee.displayInfo();
//       System.out.println("Salary: " + tee.computeSalary());
//       
       
        
    }
    
}
