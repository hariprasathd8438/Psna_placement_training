import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 1; row <= n; row++) {
            int num = (row % 2 == 0) ? 2 : 1;  

            for (int i = 1; i <= row; i++) {
                System.out.print(num);
                num += 2;  
            }

            System.out.println();  
        }
    }
}
