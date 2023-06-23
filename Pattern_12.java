//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        
        int spaces = 2*(n-1);
        // code here
        
        for(int i=1; i<=n; i++) {
            
            for(int num=1; num<=i; num++) {
                System.out.print(num+" ");
            }
            
            for(int space=1; space<=spaces; space++) {
                System.out.print(" ");
            }
            
            for(int space=1; space<=spaces; space++) {
                System.out.print(" ");
            }
            
            for(int num=i; num>0; num--) {
                System.out.print(num+" ");
            }
            
            spaces-=2;
            System.out.println();
        }
    }
}
