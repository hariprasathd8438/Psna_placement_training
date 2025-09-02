import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(Character.isLetter(ch))
            System.out.println("ALPHABET");
        else if(Character.isDigit(ch))
            System.out.println("NUMBER");
        else
            System.out.println("SPECIAL CHARACTER");
    }
}
