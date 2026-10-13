/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

/**
 *
 * @author Agawa
 */
public class Intermediate {
    public static void main(String[] args) {
        
        int average = 86;
        int absences = 2;

        boolean passed = (average >= 75 && absences <= 3) || (average >= 90);

        System.out.println("Student Average: " + average);
        System.out.println("Number of Absences: " + absences);

        if (passed) {
            System.out.println("Result: PASS");
            if (average >= 90) {
                System.out.println("Reason: The average is 90 or higher, regardless of absences.");
            } else {
                System.out.println("Reason: The average is at least 75 and absences are 3 or fewer.");
            }
        } else {
            System.out.println("Result: FAIL");
            System.out.println("Reason: The student does not meet the passing requirements.");
        }
    }
}
