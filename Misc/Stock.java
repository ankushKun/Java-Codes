import java.util.Scanner;

class Stock {
    static String title, author, pub;
    static int noc;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        getData();
        System.out.println();
        System.out.print("Enter title you wish to buy > ");
        String t = sc.next();
        System.out.print("Enter author > ");
        String a = sc.next();
        System.out.print("Enter publisher > ");
        String p = sc.next();
        System.out.print("Enter number of copies you wish to buy > ");
        int n = sc.nextInt();
        purchase(t, a, p, n);
    }

    public static void purchase(String t, String a, String p, int n) {
        if (n > noc) {
            System.out.println("Stock Underflowing");
        } else if (noc <= 0) {
            System.out.println("Out of stock");
        } else {
            noc -= n;
            System.out.println("TITLE : " + t + "\nAUTHOR : " + a + "\nPUBLISHER : " + p + "\nSTOCK LEFT : " + noc);
        }

    }

    public static void getData() {
        System.out.print("Enter title > ");
        title = sc.next();
        System.out.print("Enter author > ");
        author = sc.next();
        System.out.print("Enter publisher > ");
        pub = sc.next();
        System.out.print("Enter number of copies > ");
        noc = sc.nextInt();
    }
}