/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;


public class StantonMeasure {
    public static void main(String[] args) {
        int [] arr = {1,4,3,2,1,2,3,2};
        int result = StantonMeasure(arr);
        System.out.println(result);
    }
    
    static int StantonMeasure(int [] a){
        int oneCount = 0;
        for(int i=0; i<a.length; i++){
            if(a[i]==1){
                oneCount++;
            }
        }
        int secondCount = 0;
        for(int j=0; j<a.length; j++){
            if(a[j]==oneCount){
                secondCount++;
            }
        }
        
        return secondCount;
    }
    
}
