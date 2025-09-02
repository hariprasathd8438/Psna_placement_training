import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        for(int i=s;i<=e;i++)
        {
            if(i%2==0)
                System.out.print(i+" ");
        }
        sc.close();
    }
}
