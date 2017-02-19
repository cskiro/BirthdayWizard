/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package birthdaywizard;

import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Chapter 1 Exercise 9 Given the person's year of birth, the program will
 * display how old the user is.
 *
 * @author skiroc
 */
public class BirthdayWizard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int yearBorn, age;
        int currentYear = Calendar.getInstance().get(Calendar.YEAR);

        Scanner kb = new Scanner(System.in);
        
        try {
            // Prompting user to enter their birth year
            System.out.println("What year were you born?");
            yearBorn = kb.nextInt();

            // Calculating user's age
            age = currentYear - yearBorn;

            // Displaying user's age
            System.out.println("Your are " + age + " years old");
        } catch (InputMismatchException ex) {
            System.out.println("This is not an integer");
        } //end try/catch

    } // end main

} // end class
