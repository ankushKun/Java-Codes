import java.util.Scanner;

public class Evil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int inp = sc.nextInt();
        String inpBin = binStr(inp);
        System.out.println("Binary equivalent : " + inpBin);
        int num1s = 0;
        for (int i = 0; i < inpBin.length(); i++) {
            if (inpBin.charAt(i) == '1') {
                num1s++;
            }
        }
        System.out.println("Number of 1s : " + num1s);
        if (num1s % 2 == 0) {
            System.out.println("It is an EVIL number");
        } else {
            System.out.println("It is NOT an evil number");
        }
    }

    public static String binStr(int x) {
        String bin = "";
        for (int i = x; i > 0; i /= 2) {
            bin = i % 2 + bin;
        }
        return bin;
    }
}
