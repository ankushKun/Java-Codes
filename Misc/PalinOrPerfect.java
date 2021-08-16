import java.util.Scanner;

public class PalinOrPerfect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int in = sc.nextInt();
        System.out.println("1. Check for Palindrome number");
        System.out.println("2. Check for Perfect number");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                if (isPalindrome(in))
                    System.out.println("It is a Palindrome number");
                else
                    System.out.println("It is not a Palindrome number");
                break;
            case 2:
                if (isPerfect(in))
                    System.out.println("It is a Perfect number");
                else
                    System.out.println("It is not a Perfect number");
                break;
            default:
                System.out.println("Invalid choice try again");
        }
    }

    public static boolean isPalindrome(int in) {
        int ni = 0;
        for (int i = in; i > 0; i /= 10) {
            ni = (ni * 10) + i % 10;
        }
        return (ni == in);
    }

    public static boolean isPerfect(int in) {
        int sum = 0;
        for (int i = 1; i < in; i++) {
            if (in % i == 0) {
                sum += i;
            }
        }
        return (sum == in);
    }
}
