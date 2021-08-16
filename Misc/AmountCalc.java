import java.util.Scanner;

public class AmountCalc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal > ");
        int p = sc.nextInt();
        int r = 0;
        while (r == 0) {
            System.out.println("1. n <= 1/2 years");
            System.out.println("2. 1/2 < n <=1 years");
            System.out.println("3. 1 < n <= 3 years");
            System.out.println("4. 3 < n years");
            System.out.print("Choose an option > ");
            int n = sc.nextInt();
            switch (n) {
                case 1:
                    r = 9;
                    break;
                case 2:
                    r = 10;
                    break;
                case 3:
                    r = 11;
                    break;
                case 4:
                    r = 12;
                    break;
                default:
                    System.out.println("Invalid Input try again");
                    r = 0;
                    continue;
            }
        }
        System.out.print("Enter Time (years) > ");
        double n = sc.nextDouble();
        double amt = p * Math.pow((1 + r / 100.0), n);
        System.out.println("Amount : " + amt);

    }

}
