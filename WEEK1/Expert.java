/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package WEEK1;

/**
 *
 * @author Agawa
 */
public class Expert {
    public static void main(String[] args) {
       byte max = 127;
       
        max++;

        System.out.println(max); // -128 (overflow)

        String a = new String("Hello");
        String b = new String("Hello");
        String c = "Hello";

        // a and b are different objects, so == is false.
        System.out.println(a == b);
        // a and c are different objects, so == is false.
        System.out.println(a == c);
        // b and c are different objects, so == is false.
        System.out.println(b == c);

        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(b.equals(c));

        int[] numbers1 = {10, 20, 30};
        int[] numbers2 = numbers1;

        numbers2[0] = 99;

        System.out.println(numbers1[0]); // 99
        System.out.println(numbers2[0]); // 99
    }
}
