import java.util.*;

public class Salesman{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String sales[][] = new String[3][4];

    for(int i=0;i<sales.length;i++){
      System.out.print("Enter Name of salesman "+(i+1)+" : ");
      sales[i][0] = sc.nextLine();

      for(int j=1;j<sales[i].length;j++){
        System.out.print("Enter Sales of product "+(j)+" : ");
        sales[i][j] = sc.nextLine();
      }
    }
    for(int i=0;i<sales.length;i++){
      int total=0;
      for(int j=1;j<sales[i].length;j++){
        total+=Integer.parseInt(sales[i][j]);
      }
      System.out.println("Name : "+sales[i][0]+", Sales : "+total);
    }
  }
}
