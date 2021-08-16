import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter date in DDMMYY format > ");
        int ddmmyy = sc.nextInt();
        int yy = ddmmyy % 100;
        int mm = (ddmmyy / 100) % 100;
        int dd = ddmmyy / 10000;
        String months[] = { "Jan", "Feb", "Mar", "Apr", "May", "June", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" };

        boolean isLeap = (yy % 4 == 0);
        boolean dValid = false, mValid = false;
        if (mm >= 1 && mm <= 12) { // check if month is valid
            mValid = true;
        }

        if (mm == 2) { // if month is feb
            if (isLeap && dd >= 1 && dd <= 29) { // if leap year
                dValid = true;
            } else if (dd >= 1 && dd <= 28) { // if not leap year
                dValid = true;
            }
        }
        // for months having 31 days
        else if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            if (dd >= 1 && dd <= 31) {
                dValid = true;
            }
        }
        // for months having 30 days
        else if (mm == 4 || mm == 6 || mm == 8 || mm == 11) {
            if (dd >= 1 && dd <= 30) {
                dValid = true;
            }
        }

        if (mValid && dValid) {// print date if input is valid
            System.out.println(dd + " " + months[mm - 1] + " " + yy);
        } else { // show error
            System.out.println("INVALID DATE");
        }

    }
}