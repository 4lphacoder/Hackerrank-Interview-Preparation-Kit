// SOLUTION OF REPEATED STRING PROBLEM

import java.util.*;

public class RepeatedString {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        // TAKING INPUT VALUES
        String str = scn.nextLine();
        long n = scn.nextLong();
        // COMPUTING SOLUTION
        long counter = 0;
        // CREATING A DP WITH CELL MEANING AT IDX = COUNTER OF A'S IN STR TILL
        // INDEX = IDX
        int FreqOfAInStr[] =  new int[str.length() + 1];
        for(int idx=1;idx<=str.length();idx++) {
            if( str.charAt(idx-1) == 'a' ) 
                FreqOfAInStr[idx] = FreqOfAInStr[idx-1] + 1;
            else 
                FreqOfAInStr[idx] = FreqOfAInStr[idx-1];
        }
        counter = (n/str.length()) 
                    * FreqOfAInStr[str.length()] 
                    + FreqOfAInStr[(int) (n%str.length()) ];
        // PRESENTING OUTPUT
        System.out.println(counter);
        scn.close();
    }    
}