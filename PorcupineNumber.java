/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class PorcupineNumber {
    public static void main(String[] args) {
        int n = 333;
        int nextPN = findPorcupineNumber(n); 
        System.out.println(nextPN);
    }
    
    static int findPorcupineNumber(int n) {
        int nextPrime;
//      Find the first prime number that ends with 9
        for(int i = n+1; ;i++){
            int result = isPrime(i);
            if (result == 1){
                nextPrime = i;
                if(nextPrime%10 == 9 ){
//                  Find the prime number immediate to the first prime number
                     for(int j = nextPrime +1; ;j++){
                         int result2 = isPrime(j);
                         if(result2 == 1){ 
                             int nextNextPrime = j;
//                            If the immediate prime number does not end with 9 
//                            If ends with any other number, braeks out of the second for loop and goes to loop 1
                             if(nextNextPrime%10!= 9){
                                 break;
                             }
                             else{
                                 return nextPrime;
                             }
                             
                         }
                     }
                }
               
            }
        }
        
    }
//    returns 1 if prime else returns 0
    static int isPrime(int num) {
        
        for(int i = 2; i<num-1; i++){
           if(num%i == 0){
               return 0;
           }
        }
        return 1;
        
        
    }
}
