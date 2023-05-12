/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class GuthrieSequence {
    public static void main(String[] args) {
        int [] arr = {8,4,2,1};
        int result = GuthrieSequence(arr);
        System.out.println(result);
        
    }
    
    static int GuthrieSequence(int []a){
//      Creating a new array of the same size as the original array
        int [] arr2 = new int[a.length];
//      Copying the first element of the original array to the copy array because the 1st number is the defining number
        arr2[0] = a[0] ;
//      Filing up all the empty spaces of the copy array by following the alogorithm
        for(int i=0; ; i++){
            
            if(arr2[i] == 1){
                break;
            }
            else if(arr2[i]%2==0){
                arr2[i+1] = arr2[i]/2;
            }
            else{
                arr2[i+1] = (arr2[i]*3)+1;
            }
        }
//      Checking if the original array and copy array are the same. If not same then return 0;
        for(int j=0; j<a.length; j++){
            if(a[j]!=arr2[j]){
                return 0;
            }
        }
        
        return 1;
        }
    }

