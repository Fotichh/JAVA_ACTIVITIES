/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK2;

/**
 *
 * @author Agawa
 */
public class Expert {
     public static void main(String[] args) {

        int a = 10, b = 5, c = 3;
        boolean result;

        // Expression 1
        // PREDICTED RESULT: true
        result = (a + b > 12) && (c * 2 == 6);
        System.out.println("Expression 1: " + result);

        // Expression 2
        // PREDICTED RESULT: false
        result = (a - b < 4) || (b / c > 2);
        System.out.println("Expression 2: " + result);

        // Expression 3
        int x = 6;
        // PREDICTED RESULT: 7
        System.out.println("Expression 3: " + x++ + " -> " + x);

        // Expression 4
        int y = 7;
        // PREDICTED RESULT: false
        result = (++y > 7) && (y + 2 == 8);
        System.out.println("Expression 4: " + result);
                
        // No predictions were wrong, so no precedence correction is needed.
        
    }
}
