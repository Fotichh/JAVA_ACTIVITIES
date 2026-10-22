/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

import java.util.Arrays;

public class Advanced {
     public static void main(String[] args) {

        int[] scores = {78, 81, 94, 89, 97, 88, 91, 75};
        int searchScore = 97;
        int index = -1;

        System.out.println("--- Search and Sort Program ---");

        // Display the original scores
        System.out.println("Original Scores: " + Arrays.toString(scores));

        // Search for the score one by one
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == searchScore) {
                index = i;
                break;
            }
        }

        // Show the search result
        if (index != -1) {
            System.out.println("Score found: " + searchScore);
            System.out.println("Index: " + index);
        } else {
            System.out.println("Score not found.");
        }

        // Sorting a copy keeps the original scores and their indexes unchanged.
        int[] sortedScores = Arrays.copyOf(scores, scores.length);

        // Arrange the copied scores from lowest to highest
        Arrays.sort(sortedScores);

        // Display the original and sorted scores
        System.out.println("Original Scores: " + Arrays.toString(scores));
        System.out.println("Sorted Scores: " + Arrays.toString(sortedScores));
    }
}
