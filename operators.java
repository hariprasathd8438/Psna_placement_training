import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        char c=sc.next().charAt(0);
        int b=sc.nextInt();
         int result = 0;
        if(c=='+')
            result=a+b;
        
        else if(c=='-')
        result=a-b;
        else if(c=='*')
        result=a*b;
        else if(c=='/')
            result=a/b;
        else
            result=a%b;
        System.out.println(result);
    }
}
