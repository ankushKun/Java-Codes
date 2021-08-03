import java.util.Scanner;

public class yearDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter long int not less than 5 digits");
            long data = sc.nextLong();
            if (data < 10000) {
                System.out.println("Input must not be less than 5 digits");
                continue;
            } else {
                long year = data % 10000;// extract last 4 digits
                data /= 10000;// we are left with the rest digits (number of days)

                int monthdays[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // number of days in each month
                int monthint = 0; // position of month starting from 0
                boolean isLeap = ((year % 4) == 0);
                if (isLeap)
                    monthdays[1] = 29;// 29 days in feb if leap year
                for (int i = 0; i < data; i++) {// loop to count days, and decuct from data
                    if (i < monthdays[monthint]) {
                        continue;
                    } else if (data < monthdays[monthint]) {
                        break;
                    } else {
                        monthint++;
                        data -= monthdays[monthint];
                    }
                }
                String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
                        "September", "October", "November", "December" };
                System.out.println(data + " " + months[monthint] + " " + year);// print the date
                break;
            }
        }

    }
}
