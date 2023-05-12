/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class computeDepth {
    public static void main(String[] args) {
        int n = 42;
        int result = computeDepth(n);
        System.out.println(result);
    }
    
    public static int computeDepth(int n) {
    int[] digits = new int[10];  // array to keep track of digits
    int multiple = 0;  // current multiple being checked
    int count = 0;  // count of multiples checked
    
    while (count < 10) {
        multiple += n;  // increment multiple by n
        int temp = multiple;  // temporary variable to isolate digits
        
        while (temp > 0) {
            int digit = temp % 10;  // isolate the last digit
            if (digits[digit] == 0) {  // check if digit has not been seen before
                digits[digit] = 1;  // mark digit as seen
                count++;  // increment count of digits seen
            }
            temp /= 10;  // remove the last digit
        }
    }
    
    return count;
}

}
