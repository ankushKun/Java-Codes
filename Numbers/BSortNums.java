import java.util.Scanner;

public class BSortNums {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.println("enter the index number of the student");
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < (9 - i); j++) {
                if (a[j] > a[j + 1]) {
                    int t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }
        System.out.println("The index numbers in ascending order are:");
        for (int i = 0; i < 10; i++) {

            System.out.println(a[i]);
        }
        sc.close();
    }
}