/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class Inertial {
    
    public static void main(String[] args) {
        int [] arr = {1,1,1,1,1,1,2};
        int result = isInertial(arr);
        System.out.println(result);
    }
    
    static int isInertial(int []a) {
        
        if (a.length<2){
            return 0;
        }
        
        boolean odd = false;
        int max =0;
//      checking for atleat one odd value
        for(int i=0; i<a.length; i++){
            
            
            if(a[i]%2!=0){
                odd=true;
            }            
            
        }
//        finding the max value
        for(int i = 0; i<a.length; i++) {
            if(max<a[i]){
                max = a[i];
            }
        }
        
        System.out.println(max);
        System.out.println(odd);
        
//        if there is at least one odd value and the max is even
        if(odd==false || max%2!=0){
            return 0;
        }
//        if any single one of the odd value is greater than the max value
        for(int j=0; j<a.length; j++) {
            
            if(a[j]%2!=0){
                if(a[j]>max){
                    return 0;
                }
            }
        }
        
        return 1;
    }
    
}


