import java.util.Scanner;

public class Abundant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inp = sc.nextInt();
        int sum = sumOfFactors(inp);
        if (sum > inp) {
            System.out.println("It is an abundant number");
        } else {
            System.out.println("It is not an abundant number");
        }

    }

    public static int sumOfFactors(int x) {
        int sum = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                sum += x;
            }
        }
        return sum;
    }
}