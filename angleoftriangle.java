import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>0&&b>0&&c>0&&a+b+c==180)
            System.out.println("Valid");
        else
            System.out.println("Not Valid");
    }
}
