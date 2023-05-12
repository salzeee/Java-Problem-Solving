/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class SolveTen {
   public static int[] solve10() {
        int[] result = new int[2];
        int target = 10 * 9 * 8 * 7 * 6 * 5 * 4 * 3 * 2 * 1; // 10!
        int x = 1;
        while (x <= 10) {
            int y = 1;
            while (y <= 10) {
                int sum = factorial(x) + factorial(y);
                if (sum == target) {
                    result[0] = x;
                    result[1] = y;
                    return result;
                }
                y++;
            }
            x++;
        }
        return result;
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int[] result = solve10();
        System.out.println("x = " + result[0] + ", y = " + result[1]);
    }
}
