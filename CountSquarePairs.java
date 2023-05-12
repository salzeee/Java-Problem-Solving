
package com.mycompany.maharishiuniversity;

/**
 *
 * @author Asus
 */
public class CountSquarePairs {
    public static void main(String[] args) {
        int [] a = {11,5,4,20};
        int result = CountSquarePairs(a);
        System.out.println(result);
    }
    
    static int CountSquarePairs(int[] a) {
    int len = a.length;
    int count = 0;
//   Selecting each value in array and comparing it with others
    for(int i = 0; i < len; i++) {
        for(int j = 0; j < len; j++) {
//      Not comparing it with itself, if x>y and if both the values are less than 1     
            if(a[i] == a[j] || a[i]>a[j] ||  a[i] < 1 || a[j] < 1) {
                continue;
            }
            int sum =0;
            sum = a[i] + a[j];
            System.out.printf("a[i] = %d and a[j] = %d and sum = %d",a[i], a[j], sum );
            System.out.println();
            if(isPerfectSquare(sum) == 1) {
                count++;
               
            }
        }
    }
    return count;
}

//    returns 1 if prefect square else returns 0
    static int isPerfectSquare(int s) {
        double temp = Math.sqrt(s);
        double ps = temp%1;
        if(ps == 0){
            
            return 1;
        }
        return 0;
    }
}
