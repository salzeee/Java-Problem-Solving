/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class Nupcount {
    
    public static void main(String[] args) {
        
        int n = 5;
        int [] arr = {2,3,1,-6,8,-3,-1,2};
        int result = ncount(arr,n);
        System.out.println(result);
    }
    
    static int ncount(int[]arr, int n) {
        int Psum=0;
        int upcount=0;
        for (int i =0; i<arr.length; i++) {
            Psum = Psum + arr[i] ;
            
            if(Psum > n) {
                upcount++;
                System.out.println( "The Partial Sum is: "+Psum);
            }
        }   
        
        return upcount;
    }
    
}
