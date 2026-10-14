/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK3;

/**
 *
 * @author Agawa
 */
public class Intermediate {
     public static void main(String[] args) {
         
        double purchaseAmount = 7500.00;
        double discountRate;
        double discountAmount;
        double finalPrice;
        String discountTier;
        
        
        if (purchaseAmount < 1000) {
            discountRate = 0.00;
            discountTier = "No Discount (0%)";
        } else if (purchaseAmount < 3000) {
            discountRate = 0.05;
            discountTier = "Bronze Discount (5%)";
        } else if (purchaseAmount < 5000) {
            discountRate = 0.10;
            discountTier = "Silver Discount (10%)";
        } else {
            discountRate = 0.15;
            discountTier = "Gold Discount (15%)";
        }
          
        discountAmount = purchaseAmount * discountRate;
        finalPrice = purchaseAmount - discountAmount;

        System.out.println("Purchase Amount: PHP " + purchaseAmount);
        System.out.println("Discount Tier: " + discountTier);
        System.out.println("Discount Amount: PHP " + discountAmount);
        System.out.println("Final Discounted Price: PHP " + finalPrice);
    }
}
