import java.util.*;
class Convert{
    static int n;

    Convert() {
        n = 0;
    }

    void impnum(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number : ");
        n = sc.nextInt();
    }

    void extdigit(int e) {
        int l = e%10;
        num_to_words(l);
        n=e/10;
        if(n>0)
            extdigit(n);
    }

    void num_to_words(int n) {
        String nums[] = {"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        System.out.println(nums[n]);
    }

    public static void main(String[] args) {
        Convert c = new Convert();
        c.impnum();
        c.extdigit(n);
    }
}