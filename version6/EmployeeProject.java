/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version6;

import employee.version5.*;


/**
 *
 * @author TJ
 */
public class EmployeeProject {
    public static void main(String[] args) {
//         System.out.println("//////////////////V3--Hourly Employee--V3/////////////////////////");
         HourlyEmployee emp1 = new HourlyEmployee();
         emp1.setEmpID(1);
         emp1.setEmpName(new Name("Doe","John","E"));
         emp1.setEmpBirthDate(new Date(1,2,1990));
         emp1.setEmpDateHired(new Date(11,22,2023));
         emp1.setTotalHoursWorked(5);
         emp1.setRatePerHour(2);
        
         //ComputeSalary()
        //    System.out.println("SALARY: " + emp1.computeSalary());
        //DisplayInfo()
//        emp1.displayInfo();
//    
//        //ToString()
//            System.out.println("TO STRING: ");
//            System.out.println(emp1);
//            System.out.println("//////////////////////////////////////////////////////");
//           System.out.println("");
//           
//           
//////////////////////////////////////////////////////////////////////////////////
//////////////HourlyEmloyee no name and date constructor//////////////////////////          
//          HourlyEmployee emp2 = new HourlyEmployee(2,100,2);
//          emp2.setEmpName(new Name ("Lass", "Naam", "M"));
//          emp2.setEmpBirthDate(new Date(3,10,1970));
//          emp2.setEmpDateHired(new Date(12,12,2020));
//          //ComputeSalary()
//            System.out.println("SALARY: " + emp2.computeSalary());
//        //DisplayInfo()
//            emp2.displayInfo();
//        //ToString()
//            System.out.println("TO STRING: ");
//            System.out.println(emp2);
//            System.out.println("//////////////////////////////////////////////////////");
//            System.out.println("");
// ////////////////////////////////////////////////////////////////////////////////       
///////////HourlyEmployee with full constructor///////////////////////////////////
        HourlyEmployee emp3 = new HourlyEmployee(2,new Name("Lassy","Firssy","M"), new Date(12,12,1912), new Date(11,11,2021), 500, 3);
//         //ComputeSalary()
//            System.out.println("SALARY: " + emp3.computeSalary());
//        //DisplayInfo()
//            emp3.displayInfo();
//        //ToString()
//            System.out.println("TO STRING: ");
//            System.out.println(emp3);
//            System.out.println("//////////////////////////////////////////////////////");
//            System.out.println("");
//           
//   System.out.println("--------------------------------------------------------------");
// System.out.println("//////////////////Piece Worker Employee/////////////////////////"); 
// ////////////////////////////////////////////////////////////////////////////////
//        //PieceWorkerEmployee default constructor.//////////////////////////////
//           PieceWorkerEmployee  pEmp1 = new PieceWorkerEmployee();
//           pEmp1.setEmpID(1);
//           pEmp1.setEmpName(new Name("Door","Knob", "P"));
//           pEmp1.setEmpDateHired(new Date(2,2,2222));
//           pEmp1.setEmpBirthDate(new Date(1,1,1111));
//           pEmp1.setRatePerPiece(2);
//           pEmp1.setTotalPiecesFinished(200);
//            //ComputeSalary()
//            System.out.println("SALARY: " + pEmp1.computeSalary());
//             //DisplayInfo()
//            pEmp1.displayInfo();
//           //ToString()
//            System.out.println("TO STRING: ");
//            System.out.println(pEmp1);
//            System.out.println("//////////////////////////////////////////////////////");
//            System.out.println("");          
////////////////////////////////////////////////////////////////////////////////////            
             //PieceWorkerEmployee no name and date constructor//////////////////////
         PieceWorkerEmployee  pEmp2 = new PieceWorkerEmployee(10,350, 2);
         pEmp2.setEmpName(new Name("Man","James","C"));
         pEmp2.setEmpBirthDate(new Date (10,10,2010));
         pEmp2.setEmpDateHired(new Date(21,12,2020));
         //ComputeSalary()
//        System.out.println("SALARY: " + pEmp2.computeSalary());
         //DisplayInfo()
//        pEmp2.displayInfo();
         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(pEmp2);
//          System.out.println("//////////////////////////////////////////////////////");
//          System.out.println("");
//////////////////////////////////////////////////////////////////////////////////          
//        //PieceWorkerEmployee full constructor//////////////////////////////////
       PieceWorkerEmployee pEmp3 = new PieceWorkerEmployee(3,new Name("Naz","Mel","A"),new Date(6,7,1992),new Date(8,9,1920),400, 2);
//        //ComputeSalary()
//         System.out.println("SALARY: " + pEmp3.computeSalary());
//         //DisplayInfo()
//         pEmp3.displayInfo();
//         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(pEmp3);
//          System.out.println("//////////////////////////////////////////////////////");
//           System.out.println("");
///////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
//  
//
//
// System.out.println("--------------------------------------------------------------");            
// ////////////////////////////////////////////////////////////////////////////////
//       System.out.println("//////////////////Commision Employee/////////////////////////");
//
//        //CommisionEmployee default constructor////////////////////////////////
//        CommisionEmployee cEmp1 = new CommisionEmployee();
//        cEmp1.setEmpID(1);
//        cEmp1.setEmpName(new Name("Jab","Kal","L"));
//        cEmp1.setEmpBirthDate(new Date(9,12,1995));
//        cEmp1.setEmpDateHired(new Date(1,12,2023));
//        cEmp1.setTotalSales(40000);
//        //ComputeSalary()
//         System.out.println("SALARY: " + cEmp1.computeSalary());
//         //DisplayInfo()
//         cEmp1.displayInfo();
//         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(cEmp1);
//          System.out.println("");
//          
//         //CommisionEmployee no name and date constructor///////////////////////
         CommisionEmployee cEmp2 = new CommisionEmployee(22,50000);
         cEmp2.setEmpName(new Name("Raz","Zee","B"));
         cEmp2.setEmpBirthDate(new Date(7,8,1910));
         cEmp2.setEmpDateHired(new Date(1,9,2001));
          //ComputeSalary()
//        System.out.println("SALARY: " + cEmp2.computeSalary());
//         //DisplayInfo()
//         cEmp2.displayInfo();
//         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(cEmp2);
//          System.out.println("");
//          
//           //CommisionEmployee full constructor////////////////////////////////
            CommisionEmployee cEmp3 = new CommisionEmployee(4,new Name("Poe","Panda","P"),new Date(6,7,1967),new Date(1,12,2021),60000);
//             //ComputeSalary()
//         System.out.println("SALARY: " + cEmp3.computeSalary());
//         //DisplayInfo()
//         cEmp3.displayInfo();
//         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(cEmp3);
//          System.out.println("");         
// /////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////
//
//
//
// System.out.println("--------------------------------------------------------------"); 
// System.out.println("//////////////////Base Commision Employee/////////////////////////");
//
//            //BasePlusCommisionEmployee default constructor/////////////////////
//            BasePlusCommisionEmployee bEmp1 = new BasePlusCommisionEmployee();
//            bEmp1.setEmpID(1);
//            bEmp1.setEmpName(new Name("Bemp","Blob","B"));
//            bEmp1.setEmpBirthDate(new Date(9,9,1999));
//            bEmp1.setEmpDateHired(new Date(9,9,2000));
//  
//            bEmp1.setTotalSales(100000);
//            bEmp1.setBaseSalary(20000);
//            
//         //ComputeSalary()
//         System.out.println("SALARY: " + bEmp1.computeSalary());
//         //DisplayInfo()
//         bEmp1.displayInfo();
//         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(bEmp1);
//          System.out.println("");
//            
//          ////BasePlusCommisionEmployee no name no date constructor////////////
//           BasePlusCommisionEmployee bEmp2 = new BasePlusCommisionEmployee(2,200000, 1000);
//           bEmp2.setEmpName(new Name("Aba","Deer","C"));
//           bEmp2.setEmpBirthDate(new Date(2,2,2000));
//           bEmp2.setEmpDateHired(new Date(22,2,2022));
//           
//          //ComputeSalary()
//         System.out.println("SALARY: " + bEmp2.computeSalary());
//         //DisplayInfo()
//         bEmp2.displayInfo();
//         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(bEmp2);
//          System.out.println("");
//           
//          //BasePlusCommisionEmployee full constructor/////////////////////////
            BasePlusCommisionEmployee bEmp3 = new BasePlusCommisionEmployee(5,new Name("Qaz","Bee","K"),new Date(31,3,2003),new Date(3,3,2023), 300000, 300);
//              //ComputeSalary()
//         System.out.println("SALARY: " + bEmp3.computeSalary());
//         //DisplayInfo()
//         bEmp3.displayInfo();
//         //ToString()
//          System.out.println("TO STRING: ");
//          System.out.println(bEmp3);
//          System.out.println("");
//        
            

////////////EMPLOYEE ROSTER/////////////////////////////////////////////////////////
            
            
            
            


//    EmployeeRoster ER = new EmployeeRoster(0,10);
//    ER.addEmployee(emp1);
//    ER.addEmployee(pEmp3);
//    ER.addEmployee(bEmp3);
//    ER.addEmployee(cEmp3);
//    ER.addEmployee(emp3);
//    ER.addEmployee(cEmp2);
//    ER.addEmployee( pEmp2);
//    
//    ER.displayAllEmployee();
//   
//        System.out.println("HourlyEmp count:" + ER.countHE());
//         System.out.println("PieceWorkerEmp count:" + ER.countPWE());
//          System.out.println("CommissionEmp count:" + ER.countCE());
//           System.out.println("BasePlusCommissionEmp count:" + ER.countBCPE());
//           System.out.println("");
//            
//    ER.displayHE();
//    ER.displayPWE();   
//    ER.displayCE();
//    ER.displayBPCE();
//    
//     EmployeeRoster searchKeyword = ER.getEmployee("Qaz");
//        System.out.println("getEmployee method");
//     searchKeyword.displayAllEmployee();
            
         


    EmployeeRoster listER = new EmployeeRoster();
    
    listER.addEmployee(emp1);
    listER.addEmployee(pEmp3);
    listER.addEmployee(bEmp3);
    listER.addEmployee(cEmp3);
    listER.addEmployee(emp3);
    listER.addEmployee(cEmp2);
    listER.addEmployee( pEmp2);
    
    listER.displayAllEmployee();

           System.out.println("HourlyEmp count:" + listER.countHE());
         System.out.println("PieceWorkerEmp count:" + listER.countPWE());
          System.out.println("CommissionEmp count:" + listER.countCE());
           System.out.println("BasePlusCommissionEmp count:" + listER.countBPCE());
           System.out.println("");
            
     listER.displayHE();
     listER.displayPWE();
     listER.displayCE();
     listER.displayBPCE();

      EmployeeRoster searchKeyword = listER.getEmployee("Qaz");
      System.out.println("getEmployee method");
      searchKeyword.displayAllEmployee();
      
 
            
            
    }
    
}
