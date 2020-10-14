import java.util.*;
public class Automorphic{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a number : ");
    int n = sc.nextInt();
    int sq = n*n;
    int l=0;
    for(int i=n;i>0;i/=10){
      l++;
    }
    double sq_e = sq % Math.pow(10,l);
    if(sq_e==n){
      System.out.print("It is an Automorphic number");
    }else{
      System.out.print("It is not an Automorphic number");
    }
  }
}
