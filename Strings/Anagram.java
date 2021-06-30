import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word : ");
        String s1 = sc.next();// word one input
        System.out.println("Enter another word : ");
        String s2 = sc.next();// word two input
        System.out.println(isAnagram(s1, s2));
    }

    public static boolean isAnagram(String a, String b) {
        if (a.length() == b.length()) { // both words must be of same length
            String joined = a + b; // append both words
            char alphabets[] = new char[26]; // create a char array too keep count of each alphabet in the joined string
            for (int i = 0; i < 26; i++) {
                alphabets[i] = 0; // initialize count for every char as 0
            }
            for (int i = 0; i < joined.length(); i++) {
                alphabets[Character.toLowerCase(joined.charAt(i)) - 97] += 1; // increment count of chars present by one
            }
            for (int i = 0; i < 26; i++) {
                // each character present must have a count of 2 if it is an anagram
                if (alphabets[i] != 0 && alphabets[i] != 2) {
                    return false;// if not return false
                }
            }
            return true; // return true if checks passed
        }
        return false; // return false if words are not of same length
    }
}
