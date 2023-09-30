/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employee.version4;

import employee.version3.*;

/**
 *
 * @author TJ
 */
public class Name {
    
    private String fName;
    private String mName;
    private String lName; 

    public Name() {
    }
    
    public Name(String fName, String mName, String lName) {
        this.fName = fName;
        this.mName = mName;
        this.lName = lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
    
    public Name nameSetter(String fName, String mName, String lName){
        Name retName = new Name(fName, mName, lName); 
        return retName;
    }

    @Override
    public String toString() {
        return "Name: " + fName +","+ mName + " "+lName;
        
    }
    
}
