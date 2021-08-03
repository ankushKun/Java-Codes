import java.util.*;

public class TriangularNum {
    static int n;

    public static void main(String[] args) {
        getnum();
        dispnum();
    }

    public static void getnum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        n = sc.nextInt();
    }

    public static int check(int n) {
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum += i;
            if (sum == n) {
                return 1;
            }
            if (sum > n) {
                return 0;
            }
        }
        return 0;
    }

    public static void dispnum() {
        if (check(n) == 1) {
            System.out.println("it is a triangular number");
        } else {
            System.out.println("it is not a triangular number");
        }
    }
}
