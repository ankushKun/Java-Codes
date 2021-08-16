import java.util.Scanner;

public class CircularPrime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number > ");
        int original = sc.nextInt();
        int backup = shift(original);
        while (true) {
            System.out.println(backup);
            if (isPrime(backup)) {
                if (backup == original) {
                    System.out.println("IS A CIRCULAR NUMBER");
                    break;
                }
                backup = shift(backup);
            } else {
                System.out.println("IS NOT A CIRCULAR NUMBER");
                break;
            }
        }

    }

    public static int shift(int num) {
        String numString = Integer.toString(num);
        String numShifted = numString.charAt(0) + "";
        String rest = "";
        for (int i = 1; i < numString.length(); i++) {
            rest += numString.charAt(i);
        }
        numShifted = rest + numShifted;
        return Integer.parseInt(numShifted);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

}
