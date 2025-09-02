import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size=2*n-1;
        for(int row=1;row<=size;row++)
        {
            for(int col=1;col<=size;col++)
            {
                if(row==1||row==size||col==1||col==size||row+col==size+1||row==col)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
