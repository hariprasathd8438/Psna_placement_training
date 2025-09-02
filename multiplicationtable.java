import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int last=sc.nextInt();
        int table_no=sc.nextInt();
        for(int i=1;i<=last;i++)
        {
            System.out.println(i+" "+"*"+" "+table_no+" "+"="+" "+(i*table_no));
        }
     
    }
}
