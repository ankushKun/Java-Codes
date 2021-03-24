import java.io.*;

public class recursivePow {
    public static void main(String[] args) {
        System.out.println(pow(5, 2));
    }

    public static long pow(int m, int n) {
        if (n != 0)
            return (m * pow(m, n - 1));
        else
            return 1;
    }

}