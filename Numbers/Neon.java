import java.util.Scanner;

public class Neon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int in = sc.nextInt();
        int sq = in * in;
        int sod = 0;
        for (int i = sq; i > 0; i /= 10) {
            sod += i % 10;
        }
        if (sod == in) {
            System.out.println("It is a Neon number");
        } else {
            System.out.println("It is not a Neon number");

        }
    }
}
