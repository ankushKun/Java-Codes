import java.util.Scanner;

public class DecToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number");
        int in = sc.nextInt();
        System.out.println("Hexadecimal = " + hexOf(in));
    }

    public static String hexOf(int dec) {
        String hex = "";
        char hexes[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
        for (int i = dec; i > 0; i /= 16) {
            hex = hexes[i % 16] + hex;
        }
        return hex;
    }
}
