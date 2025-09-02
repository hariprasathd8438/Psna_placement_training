import java.util.Scanner;

public class DivideWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

       
        if (divisor == 0) {
            System.out.println("Division by zero is not allowed.");
            sc.close();
            return;
        }

        int quotient = 0;
        int positiveDividend = dividend < 0 ? -dividend : dividend;
        int positiveDivisor = divisor < 0 ? -divisor : divisor;

       
        while (positiveDividend >= positiveDivisor) {
            positiveDividend -= positiveDivisor;
            quotient++;
        }

        
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0)) {
            quotient = -quotient;
        }

        System.out.println(quotient);

        sc.close();
    }
}
