// PROBLEM - Counting Valleys
// TIME-COMPLEXITY OF SOLUTION - O(n)
import java.util.Scanner;

public class CountingValleys {
    public static void main(String args[]) {
        // TAKING INPUT FROM CONSOLE
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine(); // CLEARING LEFT-OVER NEW-LINE 
        String str = scn.nextLine();

        // COMPUTING OUTPUT
        int counter = 0;
        int state = 0;     // 0 --> FOR SEA LEVEL, +VE --> FOR MOUNTAIN, -VE FOR VALLEY
        for(int idx=0;idx<str.length();idx++) {
            if(str.charAt(idx) == 'U') 
                state += 1;
            else {
                counter = state == 0 ? counter + 1 : counter;
                state -= 1;
            }

        }
        // PRINTING RESULT
        System.out.println(counter);
        scn.close();
    }
}