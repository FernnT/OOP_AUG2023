/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version5;

import employee.version4.*;
import employee.version3.*;

/**
 *
 * @author TJ
 */
public class PieceWorkerEmployee extends Employee{
     private int totalPiecesFinished;
    private float ratePerPiece;
    
    
     public PieceWorkerEmployee() {
        super(); 
    }

     public PieceWorkerEmployee(int empID, int totalPiecesFinished, float ratePerPiece) {
        super(empID);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public PieceWorkerEmployee(int empID, Name empName, Date empDateHired, Date empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super(empID, empName, empDateHired, empBirthDate);
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }

    public int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    public void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    public float getRatePerPiece() {
        return ratePerPiece;
    }

    public void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

     @Override
     public double computeSalary() {
    double baseSalary = totalPiecesFinished * ratePerPiece;
    double bonus = (totalPiecesFinished / 100) * (ratePerPiece * 10);
    return baseSalary + bonus;
}
      
      public void displayInfo(){
       System.out.println("NAME: " + getEmpName());
        System.out.println(" ID: "+ getEmpID() );
        System.out.println(" BDAY: " + getEmpBirthDate());
        System.out.println(" HIRED DATE: " + getEmpDateHired());
        System.out.println(" PIECED FINISHED: " + this.totalPiecesFinished);
        System.out.println(" RATE /PIECE " + this.ratePerPiece);
        
    }
      
       @Override
    public String toString() {
        return "PieceWorkerEmployee{" + "empID=" + getEmpID() + ", empName=" + getEmpName() + ", empDateHired=" + getEmpDateHired() + ", empBirthDate=" + getEmpDateHired() + ", totalPiecesFinished=" + totalPiecesFinished + ", ratePerPiece=" + ratePerPiece + '}';
    }
     
    
}
