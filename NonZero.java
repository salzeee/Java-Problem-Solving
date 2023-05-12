/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class NonZero {
    public static void main(String[] args) {
        int [] a= {1,3,4,8};
        int result = nonZero(a);
        System.out.println(result);
    }
    
    static int nonZero(int [] a){
        boolean flag = false;
        for(int i=0; i<a.length; i++){
            if(a[i]<0){
                flag = true;
                break;
            }
        }
        
        if(flag == true){
            return 0;
        }
        
        return 1;
    }
}
