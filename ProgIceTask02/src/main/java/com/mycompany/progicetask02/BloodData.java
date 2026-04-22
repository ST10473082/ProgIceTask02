/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progicetask02;

/**
 *
 * @author moran
 */
public class BloodData {
    private String bloodType;
    private String rhFactor;
    
    public BloodData() { 
        bloodType = "O";
        rhFactor = "+";
    }
    
    public BloodData(String bloodType, String rhFactor) {
        this.bloodType = bloodType;
        this.rhFactor = rhFactor;
    }
    
    public String getBloodType() {
        return bloodType;
    }
    
    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }
    
    public String getrhFactor() { 
        return rhFactor;
    }
    
    public void setRhFactor(String rhfactor) {
        this.rhFactor = rhFactor;
    }
    
    public void display() {
        System.out.println("Blood Type: " + bloodType + rhFactor);
    }
}
