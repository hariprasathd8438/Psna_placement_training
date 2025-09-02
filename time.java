import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a= sc.nextLine();
        int hh=Integer.parseInt(a.split(":")[0]);
        int mm=Integer.parseInt(a.split(":")[1]);
        int ss=Integer.parseInt(a.split(":")[2]);
        if(hh>=0&&hh<=24&&mm>=0&&mm<=60&&ss>=0&&ss<=60)
            System.out.println("Valid");
        
            else
                System.out.println("Not Valid");
    }
}
