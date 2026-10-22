/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK5;

/**
 *
 * @author Agawa
 */
public class Basic {
     public static void main(String[] args) {

        String[] favorites = {"Playing Online Games", "Basketball", "Gym", "Perfume", "Content Creation"};

        System.out.println("My Favorite Things:");

        for (int i = 0; i < favorites.length; i++) {
            System.out.println((i + 1) + ". " + favorites[i]);
        }

        System.out.println("Total number of favorites: " + favorites.length);
    }
}
