import java.util.*;
class security_wages{
  String n[];
  int w[];
  int N=0;
  public static void main(String[] args){

  }

  void get(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter value of N : ");
    N = sc.nextInt();
    n = new String[N];
    w = new int[N];
  }

  void accept(){
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<N;i++){
      System.out.print("Enter name "+(i+1)+" : ");
      n[i] = sc.nextLine();
      System.out.print("Enter hours worked : ");
      w[i] = sc.nextInt();
    }

  }
}
