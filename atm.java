import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

       int a = sc.nextInt();
        int[] n = {500, 100, 50, 20, 10, 5, 2, 1};
        int[] c = new int[8];

        for (int i = 0; i < n.length; i++) {
            c[i] = a / n[i];
            a = a % n[i];
        }

        System.out.println("Total number of notes:");
        for (int i = 0; i < n.length; i++) {
            System.out.println(n[i] + " : " + c[i]);
        }
    }
}

    
    
