import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int star = 1; 
        
        for(int row = 0; row < n; row++){
           int val = 5;
            
            for(int cst = 0; cst < star; cst++){
                System.out.print(val + " ");
                val += 5;
            }
            System.out.println();
            star++;
        }
        
        
    }
}