import java.util.Scanner;

public class Library {
    static String name;
    static int price, day;
    static double fine;

    public static void main(String[] args) {
        input();
        cal();
        display();
    }

    static void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of the book > ");
        name = sc.next();
        System.out.print("Enter price > ");
        price = sc.nextInt();
        System.out.print("Enter number of days > ");
        day = sc.nextInt();
    }

    static void cal() {
        if (day >= 0 && day <= 7) {
            fine = day * 0.25;
        } else if (day > 7 && day <= 15) {
            fine = 7 * 0.25 + (day - 7) * 0.40;
        } else if (day > 15 && day <= 30) {
            fine = 7 * 0.25 + (15 - 7) * 0.40 + (day - 15) * 0.60;
        } else {
            fine = 7 * 0.25 + (15 - 7) * 0.40 + (30 - 15) * 0.60 + (day - 30) * 0.80;
        }
    }

    static void display() {
        System.out.println("NAME : " + name);
        System.out.println("PRICE : " + price);
        System.out.println("DAYS LATE : " + day);
        System.out.println("FINE : " + fine);
    }
}
