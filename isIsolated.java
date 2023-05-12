/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class isIsolated {
    public static void main(String[] args) {
        long n = -1;
        int result = IsIsolated(n);
        System.out.println(result);
    }
    
    static int IsIsolated(long n){
        if(n<1 || n>2097151){
            return -1;
        }
        
        long square = n*n;
        long cube = n*n*n;
        long div = square;
        long div2 = cube;
        long rem = 0;
        long rem2 = 0;
        while(div>0){
            rem = div%10;
            div = div/10;
            
            while(div2>0){
                rem2 = div2%10;
                if(rem == rem2){
                    return 0;
                }
                div2 = div2/10;
            }
        }
        return 1;
    }
}
