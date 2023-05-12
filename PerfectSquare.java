
package com.mycompany.maharishiuniversity;


public class PerfectSquare {
    
    public static void main(String[] args) {
        
        int n=6;
        int result = nextPerfectSquare(n);
        System.out.println(result);
        n =36;
        result = nextPerfectSquare(n);
        System.out.println(result);
        n =0;
        result = nextPerfectSquare(n);
        System.out.println(result);
        n = 9;
        result = nextPerfectSquare(n);
        System.out.println(result);
        
    }
    
    static int nextPerfectSquare(int n ){
        
        
            if(n==0){
                return 1;
            }
            
            else if(n<0){
                return 0;
            }
            
            else {
                
                double sqroot = Math.sqrt(n);
//                If number is whole number then we need to add + 1.
                if(sqroot %1 == 0) {
                    sqroot = sqroot +1;
                }
                
                double celing =  Math.ceil(sqroot);
                int intceling = (int) celing;
                int nextPS = intceling*intceling;
            
                    return nextPS;
            }
            
        
         } 
    
}
