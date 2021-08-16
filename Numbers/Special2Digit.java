import java.util.*;

public class Special2Digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a 2 digit number : ");
        int inp = sc.nextInt();
        if (inp >= 10 && inp <= 99) {
            int sum = SOD(inp);
            int prod = POD(inp);
            System.out.println("Sum of digits : " + sum);
            System.out.println("Product of digits : " + prod);
            System.out.println("Sum + Product : " + (int) (sum + prod));

            if (sum + prod == inp) {
                System.out.println("Special 2-Digit number");
            } else {
                System.out.println("Not a special 2-Digit number");
            }
        } else {
            System.out.println("Not a special 2-Digit number");
        }
    }

    public static int SOD(int x) {
        int sum = 0;
        for (int i = x; i > 0; i /= 10) {
            sum += i % 10;
        }
        return sum;
    }

    public static int POD(int x) {
        int prod = 1;
        for (int i = x; i > 0; i /= 10) {
            prod *= i % 10;
        }
        return prod;
    }
}
