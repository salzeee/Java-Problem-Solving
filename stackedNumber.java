/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class stackedNumber {
    public static void main(String[] args) {
        int n = 10;
        int result = isStacked(n);
        System.out.println(result);
    }
    
    static int isStacked(int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum = sum + i;
            if(sum==n){
                return 1;
            }
        }
        return 0;
    }
}
