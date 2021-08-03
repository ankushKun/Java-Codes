public class Telcall {
    int phone;
    String name;
    int n;
    double amt;

    Telcall(int phone, String name, int n) {
        this.phone = phone;
        this.name = name;
        this.n = n;
        this.amt = 500.0;
    }

    void compute() {
        if (n > 100 && n < 201) {
            amt += (n - 100);
        } else if (n > 200 && n < 301) {
            amt += (n - 200) * 1.20 + 99;
        } else if (n > 300) {
            amt += (n - 300) * 1.50 + 199;
        }
    }

    void display() {
        System.out.println("Phone Number\tName\tTotal Calls\tAmount");
        System.out.println(phone + "\t" + name + "\t" + n + "\t" + amt);
    }

    public static void main(String[] args) {
        Telcall call = new Telcall(1234567890, "Someones name", 50);
        call.compute();
        call.display();
    }
}
