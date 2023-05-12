/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class PerfectNumber {
    public static void main(String[] args) {
        int i = 1;
        int j = 3;
        int result = henry(i,j);
        System.out.println(result);
    }
    
    static int henry(int i, int j){
        int count = 0;
        int count2 = 0;
        int [] arr = new int [j];
        for(int k = 2; ; k++){
            int sum = 0;
            for(int q = 1; q<k; q++){
                if(k%q==0){
                    sum = sum + q;
                }
            }
            if(sum == k){
              count++;
              
            }
            
            if(count == i){
                if(count2 == 0){
                arr[0] = k;
                System.out.println("arr1 "+arr[0]);
                count2++;
                }     
            }
            
            if(count == j){
                arr[1] = k;
               System.out.println("arr2 "+arr[1]);
                break;
            }
        }
        
        int total = arr[0] + arr[1];
        return total;
    }
}
