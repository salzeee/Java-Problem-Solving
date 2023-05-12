/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class SumFactor {
    public static void main(String[] args) {
        int [] arr = {1,-1,1,-1,1,-1,1};
        int result = sumFactor(arr);
        System.out.println(result);
    }
    
    static int sumFactor(int a[]){
        int sum = 0;
//      Getting the sum of the elements of the array
        for(int i=0; i<a.length; i++){
            sum = sum + a[i];
        }
        int count=0;
//      Checking to see if any of the elements in the array equals to the sum value
        for(int j=0; j<a.length; j++){
            if(a[j]==sum){
                count++;
            }
        }
        return count;
    }
}
