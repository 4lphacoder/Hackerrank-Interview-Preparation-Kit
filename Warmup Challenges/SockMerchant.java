// PROBLEM - SOCK MERCHANT
// TIME COMPLEXITY OF FOLLOWING SOLUTION - N^2 + N
import java.util.*;

public class SockMerchant {
    public static void main(String args[]) {
        // TAKING INPUT
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int idx=0;idx<n;idx++)
            arr[idx] = scn.nextInt();

        // COMPUTING SOLUTION
        int pairOfSocks = 0;
        Arrays.sort(arr);       // SORTING ARRAY IN ASCENDING ORDER
        int counter = 0;
        for(int idx=0;idx<n;idx++) {
            if (idx == n-1 || arr[idx] != arr[idx+1]) {
                counter += 1;
                pairOfSocks += counter/2;
                counter = 0;
            }
            else
                counter += 1;
        }
        // PRESENTING OUTPUT
        System.out.println(pairOfSocks);
    }
}