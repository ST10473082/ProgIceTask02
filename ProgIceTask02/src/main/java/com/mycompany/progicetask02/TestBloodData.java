/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.progicetask02;
import java.util.Scanner;
/**
 *
 * @author moran
 */

public class TestBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Object using default constructor
        BloodData defaultBlood = new BloodData();

        // Prompt user for values
        System.out.print("Enter blood type (O, A, B, AB): ");
        String type = input.nextLine();

        System.out.print("Enter Rh factor (+ or -): ");
        String rh = input.nextLine();

        // Object using parameterized constructor
        BloodData userBlood = new BloodData(type, rh);

        // Display both objects
        System.out.println("\n--- Initial Values ---");
        System.out.print("User Object: ");
        userBlood.display();

        System.out.print("Default Object: ");
        defaultBlood.display();

        // Change default object to user values
        defaultBlood.setBloodType(type);
        defaultBlood.setRhFactor(rh);

        // Display again to confirm changes
        System.out.println("\n--- Updated Default Object ---");
        defaultBlood.display();

        input.close();
    }
}

