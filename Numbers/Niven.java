public class Niven {
    public static void main(String[] args) {
        for (int i = 1; i <= 25; i++) {
            if (isNiven(i)) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();

    }

    public static boolean isNiven(int x) {
        int sumOfDigits = SOD(x);
        if (sumOfDigits == 0)
            return false;
        else if (x % sumOfDigits == 0) {
            return true;
        }
        return false;
    }

    public static int SOD(int x) {
        int sum = 0;
        for (int i = x; i > 0; i /= 10) {
            sum += i % 10;
        }
        // System.out.println(sum);
        return sum;
    }
}
