/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class GuthrieIndex {
    public static void main(String[] args) {
        int a = 42;
        int result = guthrieIndex(a);
        System.out.println(result);
    }
    
    static int guthrieIndex(int n){
        int count = 0;
        for(int i=0; ;i++){
           if(n==1){
            break;
           }
           else if(n%2==0){
               n = n/2;
               count++;
           }
           else{
               n = (n*3)+1;
               count++;
           }
        }
        return count;
    }
}
