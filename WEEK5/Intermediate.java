/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

/**
 *
 * @author Agawa
 */
public class Intermediate {
    public static void main(String[] args) {

        int[] scores = {78, 81, 94, 89, 97, 88, 91, 75};

        int sum = 0;
        int highest = scores[0];
        int lowest = scores[0];
        double average;

        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];

            if (scores[i] > highest) {
                highest = scores[i];
            }

            if (scores[i] < lowest) {
                lowest = scores[i];
            }
        }

        average = (double) sum / scores.length;

        System.out.println("Class Statistics");
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
    }
}
