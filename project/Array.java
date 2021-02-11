import java.util.Scanner;

public class Array {
    static int L, N[];
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter limit of Array > ");
        accept(sc.nextInt());
        readelements();
        System.out.print("What element do you want to search > ");
        search(sc.nextInt());
        display();
    }

    public static void accept(int m) {// accepts the limit and declare the array
        L = m;
        N = new int[L];
    }

    public static void readelements() {// inputs the elements of the array
        for (int i = 0; i < N.length; i++) {
            System.out.print("Enter element " + i + " of Array > ");
            N[i] = sc.nextInt();
        }
    }

    // searches n in the list of elements in the array.
    // If found displays the position in the array
    // otherwise prints an appropriate message.
    public static void search(int n) {
        for (int i = 0; i < N.length; i++) {
            if (N[i] == n) {
                System.out.println("Element '" + n + "' found at index " + i);
                return;
            }
        }
        System.out.println("Element '" + n + "' was not found");
    }

    public static void display() {// inputs the elements of the array
        System.out.println("The array is > ");
        for (int i = 0; i < N.length; i++) {
            System.out.print(N[i] + " ");
        }
        System.out.println();
    }
}