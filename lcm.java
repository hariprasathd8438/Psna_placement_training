import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int num1=a;
        int num2=b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
        a=temp;
        }
        int gcd=a;
        int lcm=num1*num2/gcd;
        System.out.println(lcm);
        
        
    } 
}
