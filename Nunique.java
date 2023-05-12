/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class Nunique {
    public static void main(String[] args) {
         int [] arr = {7,3,3,2,4};
         int n = 10;
         int result = uniqueN(arr,n);
         System.out.println(result);
    }
    static int uniqueN(int [] arr, int n){
        int sum = 0;
        int count = 0;
        for(int i = 0; i<arr.length; i++) {
            for(int j = 0; j<arr.length; j++){
                if(i==j){
                    continue;
                }
            sum = arr[i] + arr[j];
                if(sum == n){
                    count++;
                }
            }
        }
        System.out.println(count);
        if(count == 2) {
            return 1;
        }
        return 0;
    }
}
