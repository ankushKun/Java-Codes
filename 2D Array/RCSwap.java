import java.util.*;
public class RCSwap{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String dda[][] = new String[4][4];
    for(int i=0;i<dda.length;i++){
      for(int j=0;j<dda[i].length;j++){
        System.out.print("Enter int for position "+i+","+j+" : ");
        dda[i][j]=sc.next();
      }
    }
    //print the array
    System.out.println("\nUNCHANGED");
    for(int i=0;i<dda.length;i++){
      for(int j=0;j<dda[i].length;j++){
        System.out.print(dda[i][j]+"\t");
      }
      System.out.println();
    }
    System.out.println("\nSwapping R1 and R4");
    //swapping 1st and 4th row
    for(int i=0;i<4;i++){
      String temp = dda[i][0];
      dda[i][0] = dda[i][3];
      dda[i][3] = temp;
    }
    //print the array
    for(int i=0;i<dda.length;i++){
      for(int j=0;j<dda[i].length;j++){
        System.out.print(dda[i][j]+"\t");
      }
      System.out.println();
    }
    //swapping 1st and 4th col
    for(int i=0;i<4;i++){
      String temp = dda[0][i];
      dda[0][i] = dda[3][i];
      dda[3][i] = temp;
    }
    System.out.println("\nSwapping C1 and C4");
    //print the array
    for(int i=0;i<dda.length;i++){
      for(int j=0;j<dda[i].length;j++){
        System.out.print(dda[i][j]+"\t");
      }
      System.out.println();
    }

  }

}
