/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class SumSafe {
    public static void main(String[] args) {
        int [] a = {5,-2,1};
        int result = sumSafe(a);
        System.out.println(result);
    }
    
    static int sumSafe(int [] a){
        int sum = 0;
        for(int i = 0; i<a.length; i++){
            sum = sum + a[i];
        }
        
        for(int j = 0; j<a.length; j++){
            if(a[j]== sum){
                return 0;
            }
        }
        
        return 1;
    }
}
