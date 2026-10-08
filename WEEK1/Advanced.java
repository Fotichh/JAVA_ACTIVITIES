/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK1;

/**
 *
 * @author Agawa
 */
public class Advanced {
    public static void main(String[] args) {

        double centimeters = 165.5;
        int meters = (int) centimeters / 100;
        double remainingCentimeters = centimeters - (meters * 100);

        System.out.println(meters);                // 1
        System.out.println(remainingCentimeters);  // 65.5

        int number = 10;
        // int automatically widens to double, so no cast is needed.
        double decimalNumber = number;

        System.out.println(decimalNumber);         // 10.0
        
        double value = 25.75;

        // Casting to int removes the decimal part (.75).
        int wholeNumber = (int) value;

        System.out.println(wholeNumber);           // 25
    }
}

