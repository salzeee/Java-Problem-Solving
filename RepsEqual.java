/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class RepsEqual {
    public static void main(String[] args) {
        int [] arr = {3,2,0,5,3};
        int n = 32053;
        int result = repsEqual(arr,n);
        System.out.println(result);
    }
    
    static int repsEqual(int [] a, int n){
        int len = a.length;
        int[] arr2 = new int[len];
        int temp = n;
        int div = n;
        for(int i=len-1; i>=0; i--){
//          Getting the last digit from the remaining digits
            temp = div%10;
//          Getting the remaining digits after disgarding the last digit
            div = div/10;
            arr2[i] = temp;
        }
        
        for(int j = 0; j<arr2.length; j++){
//        If both array equal then number and the array are same
            if(a[j]!=arr2[j]){
                return 0;
            }            
        }
        return 1;
    }
}
