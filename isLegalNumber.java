/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class isLegalNumber {
    public static void main(String[] args) {
        int [] a = {3,2,1};
        int base = 4;
        int result = isLegalNumber(a,base);
        System.out.println(result);
    }
    
    static int isLegalNumber(int [] a, int base){
        for(int i = 0; i<a.length; i++){
            if(a[i]>base){
                return 0;
            }
        }
        return 1;
    }
}
