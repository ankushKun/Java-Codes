import java.util.*;

public class Date {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("Enter day number (1-365) : ");
            int d = sc.nextInt();
            System.out.print("Enter year : ");
            int y = sc.nextInt();
            System.out.print("Enter n (1-100): ");
            int n = sc.nextInt();

            if (d >= 1 && d <= 365 && y >= 1000 && y <= 9999 && n >= 1 && n <= 100) {
                boolean isLeap = (y % 4) == 0;
                int days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
                if (isLeap)
                    days[1] = 29;
                int mnth = 0;
                int dd = d;
                for (int i = 0; i < dd; i++) {
                    if (i < days[mnth]) {
                        continue;
                    } else if (dd < days[mnth]) {
                        break;
                    } else {
                        mnth++;
                        dd -= days[mnth];
                    }
                }
                String[] months = { "January", "February", "March", "April", "May", "June", "July", "August",
                        "September", "October", "November", "December" };
                System.out.println(dd + " " + months[mnth] + " " + y);
                ////////////////////////////////////
                if (d + n <= 365) {
                    dd += n - 1;
                    for (int i = 0; i < dd; i++) {
                        if (i < days[mnth]) {
                            continue;
                        } else if (dd < days[mnth]) {
                            break;
                        } else {
                            mnth++;
                            dd -= days[mnth];
                        }
                    }
                    System.out.println("Future date : " + dd + " " + months[mnth] + " " + y);
                } else {
                    mnth = 0;
                    dd = d + n - 1;
                    for (int i = 0; i < dd; i++) {
                        if (i < days[mnth]) {
                            continue;
                        } else if (dd < days[mnth]) {
                            break;
                        } else {
                            mnth++;
                            if (mnth == 12) {
                                dd -= 31;
                                break;
                            }
                            dd -= days[mnth];
                        }
                    }
                    y++;
                    days[1] = 28;
                    mnth = 0;
                    isLeap = (y % 4) == 0;
                    if (isLeap)
                        days[1] = 29;
                    dd -= 1;
                    for (int i = 0; i < dd; i++) {
                        if (i < days[mnth]) {
                            continue;
                        } else if (dd < days[mnth]) {
                            break;
                        } else {
                            mnth++;
                            dd -= days[mnth];
                        }
                    }
                    System.out.println("Future date : " + dd + " " + months[mnth] + " " + y);
                }
                break;
            } else {
                System.out.print("Invalid input, try again :(");
                continue;
            }
        }

    }
}
