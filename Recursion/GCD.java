import java.util.*;
public class GCD{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a : ");
    int a = sc.nextInt();
    System.out.print("Enter b : ");
    int b = sc.nextInt();
    System.out.println("GCD of a and b = "+gcd(a,b));
  }
  public static long gcd(long a,long b){
    if(b==0){
      return a;
    }else{
      return(gcd(a,a%b));
    }
  }
}
