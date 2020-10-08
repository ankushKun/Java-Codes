import java.util.*;
import java.io.*;
public class Marks{
  public static void main(String[] args) throws IOException{
    //Scanner sc = new Scanner(System.in);
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);
    System.out.print("Enter number of Students : ");
    //int n = sc.nextInt();
    int n = Integer.parseInt(br.readLine());
    String name[] = new String[n];
    int marks[][] = new int[n][3];
    for(int i=0;i<name.length;i++){
      System.out.print("Enter name of student "+(i+1)+" : ");
      //name[i] = sc.nextLine();
      name[i] = br.readLine();
      System.out.print("Enter marks in Physics : ");
      //marks[i][0] = sc.nextInt();
      marks[i][0] = Integer.parseInt(br.readLine());
      System.out.print("Enter marks in Chemistry : ");
      //marks[i][1] = sc.nextInt();
      marks[i][1] = Integer.parseInt(br.readLine());
      System.out.print("Enter marks in Bioogy : ");
      //marks[i][2] = sc.nextInt();
      marks[i][2] = Integer.parseInt(br.readLine());
    }
    for(int i=0;i<name.length;i++){
      int fm = 0;
      for(int j=0;j<marks[i].length;j++){
        fm+=marks[i][j];
      }
      int percent = (fm/3);
      System.out.println("Name : "+name[i]+"\t"+"Grade "+getGrade(percent));
    }

  }
  public static String getGrade(int p){
    if(p>=90){
      return "A";
    }else if(p>=75 && p<90){
      return "B";
    }else if(p>=60 && p<75){
      return "C";
    }else if(p>=50 && p<60){
      return "D";
    }else if(p>=40 && p<50){
      return "E";
    }else{
      return "F";
    }
  }
}
