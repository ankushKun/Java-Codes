import java.io.*;
public class roll58 {
  public static void main(String[] args) throws IOException{

    DataInputStream din = new DataInputStream(new FileInputStream("student.dat"));
    DataOutputStream dout = new DataOutputStream(new FileOutputStream("New.dat"));
    do{
      int roll = din.readInt();
      double perc = din.readDouble();

      if(perc>58){
        dout.writeInt(roll);
        dout.writeDouble(perc);
      }
    }while(din.available()>0);

  }
}
