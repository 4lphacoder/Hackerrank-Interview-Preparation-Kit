// SOLUTION OF JUMPING ON THE CLOUDS PROBLEM

import java.util.*;

public class jumpingOnTheClouds{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int idx=0;idx<n;idx++)
            arr[idx] = scn.nextInt();

        // STARTING COMPUTATIONS
        int counter = 0;        // THIS VARIABLE HOLDS NUMBER OF JUMPS NEED TO MAKE
        for (int idx=0;idx<n;) {
            int value1 = idx+1 < n ? arr[idx+1] : -1;        // -1 IS ASSIGNED FOR BOUNDARY VALUE CONDITION REACHED
            int value2 = idx+2 < n ? arr[idx+2] : -1;         // ELSE 0 OR 1 IS ASSIGNED FROM ARRAY
            
            if(value2 == 0)         
                idx += 2;
            else if(value1 == 0)    
                idx += 1;
            else if(value1 == -1 )  
                break;
            
            // INCREMENTING COUNTER 
            counter += 1;
        }

        System.out.println(counter);

        scn.close();
    }
}