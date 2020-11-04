import java.io.*;
import java.util.*;
public class file {
    
    static String fname="stu.dat";
    
    public static void main (String[] args) throws IOException{
        
        Scanner sc = new Scanner(System.in);
        DataOutputStream dout = new DataOutputStream(new FileOutputStream(fname));
        
        System.out.println("Enter number of students");
        int n= sc.nextInt();
        
        for(int i=0;i<n;i++){
            System.out.println("enter Roll no");
            dout.writeInt(sc.nextInt());
            System.out.println("enter marks in Physics");
            dout.writeInt(sc.nextInt());
            System.out.println("enter marks in Chemistry");
            dout.writeInt(sc.nextInt());
            System.out.println("enter marks in Biology");
            dout.writeInt(sc.nextInt());
            System.out.println("enter marks in Computer");
            dout.writeInt(sc.nextInt());
        }
    }
}

