/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class isDivisible {
    public static void main(String[] args) {
        int [] arr = {3,3,6,36,30};
        int div = 3;
        int result = isDivi(arr, div);
        System.out.println(result);
    }
    
    static int isDivi(int [] arr, int div){
        boolean flag = true;
        for(int i = 0; i<arr.length; i++){
         if(arr[i]%div!=0){
             flag = false;
         }
        }
        
        if(flag = true){
            return 1;
        }
        return 0;
    }
}
