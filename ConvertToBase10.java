/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

import static com.mycompany.maharishiuniversity.isLegalNumber.isLegalNumber;

/**
 *
 * @author Asus
 */
public class ConvertToBase10 {
    public static void main(String[] args) {
        int [] a = {1,1,2};
        int base = 3;
        int result = ConvertToBase10(a,base);
        System.out.println(result);
    }
    
    static int ConvertToBase10(int [] a, int base){
        double sum =0;
        for(int i = 0; i<a.length; i++){
            if(a[i]>base){
                return 0;
            }
            
        }
        int k =0;
        for(int j = base-1; j>=0; j--){
                System.out.println("a[j]"+a[j]);
            sum = sum + (a[j]*Math.pow(base, k));
            k++;
            }
        int total = (int) sum;
        return total;
    }
   
}
