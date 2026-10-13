/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

/**
 *
 * @author Agawa
 */
public class Advanced {
    public static void main(String[] args) {
        
        double balance = 1000.00;

        System.out.println("Initial Balance: " + balance);

        balance += 500;
        System.out.println("After adding Savings: " + balance);

        balance *= 1.10;
        System.out.println("After 10% Growth: " + balance);

        balance += 350;
        System.out.println("After adding Extra Savings: " + balance);

        int count = 5;

        System.out.println("\nCounter Demonstration");
        System.out.println("count++: " + count++);
        System.out.println("After count++: " + count);
        System.out.println("++count: " + ++count);
        System.out.println("After ++count: " + count);

        // count++ prints the current value first, then increases it by 1.
        // ++count increases the value first, then prints the new value.
    }
}
