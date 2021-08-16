/*
 * We take an integer X
 * The sum of the digits of X is found recursively till a single digit is obtained.
 * If the single digit integer obtained is equal to 1, then the number X is a Magik number.
 */

import java.util.Scanner;

public class MagikNo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to be checked : ");
        int num = sc.nextInt();// take int input from the user
        int numBackup = num;
        while (numBackup > 9) {// loops and keeps finding the sum till a single digit is reached
            numBackup = sumOf(numBackup);
        }
        if (numBackup == 1) {
            System.out.println(num + " is a Magik number");
        } else {
            System.out.println(num + " is not a Magik number");
        }
    }

    public static int sumOf(int x) {// finds the sum of all digits in a number and returns the result
        int sum = 0;
        while (x > 0) {
            sum += x % 10;
            x /= 10;
        }
        return sum;
    }
}
