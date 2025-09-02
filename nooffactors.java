import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new  Scanner(System.in);
        int f=sc.nextInt();
        int count=0;
        for(int i=1;i<=f;i++){
            if(f%i==0)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
