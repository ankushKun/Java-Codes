import java.util.*;
public class SquareMatrix{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int k=0;
    System.out.println("Enter the size of the matrix = ");
    int n = sc.nextInt();
    int m[][] = new int[n][n];
    int r1 = 0 , r2 = n-1;
    int c1 = 0 , c2 = n-1;
    while(k<n*n){
      for(int i=c1;i<=c2;i++){
        m[r1][i] = k+1;
        k++;
      }
      for(int i=r1+1;i<=r2;i++){
        m[i][c2] = k+1;
        k++;
      }
      for(int i=c2-1;i>=c1;i--){
        m[r2][i] = k+1;
        k++;
      }
      for(int i=r2-1;i>r1;i--){
        m[i][c1] = k+1;
        k++;
      }
      c1++;c2--;
      r1++;r2--;
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(m[i][j]+"\t");
      }
      System.out.println();
    }
  }
}
