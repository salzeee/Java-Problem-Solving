/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class isSquare {
    public static void main(String[] args) {
        int n = 25;
        int result = square(n);
        System.out.println(result);
    }
    
    static int square(int n) {
        for(int i = 1; i<n; i++ ){
            if(n%i==0){
                if(i*i == n){
                    System.out.println(i);
                    return 1;
                }
            }
        }
        return 0;
    }
}
