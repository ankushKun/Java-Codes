import java.util.*;
public class Power{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a : ");
    int a = sc.nextInt();
    System.out.print("Enter b : ");
    int b = sc.nextInt();
    System.out.println("a^b = "+pow(a,b));
  }
  public static long pow(long a,long b){
    if(b==1){
      return a;
    }else{
      return(a*pow(a,b-1));
    }
  }
}
