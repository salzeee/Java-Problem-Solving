/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class PrimeCount {
    public static void main(String[] args) {
        int start = 1;
        int end = 1;
        int result = PrimeCount(start,end);
        System.out.println(result);
    }
    
    static int PrimeCount(int start, int end){
        int count=0;
        
        if(end <= 2) {
        return 0;
        }
        
        if (start<0) {
            start =2;
        }
        for(int i = start; i<=end; i++) {
            boolean flag = true;
            for(int j=2; j<i; j++){
                if(i%j==0) {
                    flag = false;
                }
                
            }
            if(flag == true) {
                count++;
            }
            
            
        }
        return count;
    }
}
