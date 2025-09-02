import java.util.Scanner;

public class MultiplyWithoutOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        int positiveA = Math.abs(a);
        int positiveB = Math.abs(b);

        int times = positiveB < positiveA ? positiveB : positiveA;
        int value = positiveB < positiveA ? positiveA : positiveB;

        for (int i = 0; i < times; i++) {
            result += value;
        }

     
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            result = -result;
        }

        System.out.println(result);

        
    }
}
