/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class Matches {
    public static void main(String[] args) {
        int [] a = {1,2,3,-5,-5,2,3,18};
        int [] p = {3,-2,3};
        int result = Matches(a,p);
        System.out.println(result);
    }
    
    static int Matches(int [] a, int [] p){
//      count2 keeps track of how many elements in P full fill the criteria
        int count2 = 0;
//      count3 moves the starting of the 2nd for loop to the next position
        int count3 = 0;
        int abs = 0;
        boolean noMatch = true;
        for(int i = 0; i<p.length; i++){ 
//          count keeps track of how many elements in a match +- from p
            int count = 0;
            if(p[i]<0){
                abs = p[i] * -1;
               
            }
            else {
                abs = p[i];
            }
            for(int j = count3; j<abs+count3; j++){
                if(p[i]>0){
                    if(a[j]>0){
                        System.out.println("a is " +a[j]);
                        count++;
                    }
                }
                if (p[i]<0){
                    if(a[j]<0){
                        System.out.println("a is " +a[j]);
                        count++;
                    }
                }
            }
            count3= count3 + abs;
            
            if(count == abs){
                System.out.println("abs" + abs);
                count2++;
            }
            
        }
        if(count2 == p.length){
            
            return 1;
        }
        else
            
            return 0;
    }
}
