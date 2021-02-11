import java.util.Scanner;

public class Potential {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word/words >> ");
        String inp = sc.nextLine().toUpperCase();

        if (inp.endsWith(".") || inp.endsWith("?") || inp.endsWith("!")) {
            String words_arr[];
            int word_count = 1, word_pow_arr[];
            // LOOP TO GET THE NUMBE ROF WORDS IN A SENTENCE
            for (int i = 0; i < inp.length(); i++) {
                if (inp.charAt(i) == ' ') {
                    word_count++;
                }
            }
            words_arr = new String[word_count]; // to store words
            word_pow_arr = new int[word_count]; // to store POWER of words
            String wrd_str = "";
            int wrd_arr_count = 0;
            // Store each word in an array
            for (int i = 0; i < inp.length(); i++) {
                if (inp.charAt(i) == '.' || inp.charAt(i) == '!' || inp.charAt(i) == '?') {
                    words_arr[wrd_arr_count] = wrd_str;
                    break;
                }
                if (inp.charAt(i) == ' ') {
                    words_arr[wrd_arr_count] = wrd_str;
                    wrd_arr_count++;
                    wrd_str = "";
                } else {
                    wrd_str += (char) inp.charAt(i);
                }
            }

            // get POWER of each word
            for (int i = 0; i < words_arr.length; i++) {
                String word = words_arr[i];
                int pow = 0;
                for (int wi = 0; wi < word.length(); wi++) {
                    pow += (int) word.charAt(wi);
                }
                word_pow_arr[i] = pow;
            }

            // sorting both arrays according to POWER
            int n = word_pow_arr.length;
            for (int i = 0; i < n - 1; i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (word_pow_arr[j] > word_pow_arr[j + 1]) {
                        int temp = word_pow_arr[j];
                        word_pow_arr[j] = word_pow_arr[j + 1];
                        word_pow_arr[j + 1] = temp;
                        String temp_s = words_arr[j];
                        words_arr[j] = words_arr[j + 1];
                        words_arr[j + 1] = temp_s;
                    }
                }
            }

            // printing the arrays + powers
            for (int i = 0; i < words_arr.length; i++) {
                System.out.println(words_arr[i] + " = " + word_pow_arr[i]);
            }
            for (int i = 0; i < words_arr.length; i++) {
                System.out.print(words_arr[i] + " ");
            }
            System.out.println();

        } else {
            System.out.println("INVALID INPUT");
        }
    }

}