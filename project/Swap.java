import java.util.Scanner;

public class Swap {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word/words > ");
        System.out.println("Swapped Pairs : " + swappairs(sc.nextLine()));
    }

    public static String swappairs(String s) {
        String S_swapped = "";
        for (int i = 0; i < s.length() - 1; i += 2) {
            S_swapped += (char) s.charAt(i + 1);
            S_swapped += (char) s.charAt(i);
        }
        if (s.length() % 2 != 0) {
            S_swapped += s.charAt(s.length() - 1);
        }
        return S_swapped;
    }
}