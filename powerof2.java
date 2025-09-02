import java.util.Scanner;

public class PowerOfTwoCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        int number = scanner.nextInt();
        
        
        if (isPowerOfTwo(number)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }

    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
}
