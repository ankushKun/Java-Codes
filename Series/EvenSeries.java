
import java.util.*;

public class EvenSeries {

    static long n;
    static float S, k;

    EvenSeries() {
        n = 1;
        S = 0.0f;
        k = 0.0f;
    }

    public static void main(String[] args) {
        accept();
        disp();
    }

    public static void accept() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter float (2.0 < S < 7.0) : ");
            S = sc.nextFloat();
            if (S >= 2.0 && S <= 7.0) {
                break;
            } else {
                System.out.println("Input doesnot match the conditions");
            }
        }
    }

    public static long fact(long x) {
        long f = x;
        while (x > 0) {
            f *= x;
            x--;
        }
        return f;
    }

    public static void disp() {
        while (k <= S) {
            k += Math.pow(2, n) / fact(n);
            n++;
        }
        System.out.println(n);
    }
}
