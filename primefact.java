import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

       
        for (int i = 2; i <= n / i; i++) {
            int count = 0;
            while (n % i == 0) {
                n /= i;
                count++;
            }
            if (count > 0) {
                System.out.println(i + "->" + count);
            }
        }

       
        if (n > 1) {
            System.out.println(n + "->1");
        }

        sc.close();
    }
}
