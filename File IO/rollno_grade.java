import java.io.*;
public class rollno_grade {
    static String fname="stu.dat";
    public static void main (String[] args) throws IOException{
        DataInputStream din = new DataInputStream(new FileInputStream(fname));
        DataOutputStream dout = new DataOutputStream(new FileOutputStream("student.dat"));
        String grade="";
        do{
            int roll = din.readInt();
            System.out.println("Roll No : "+roll);
            dout.writeInt(roll);
            int phy = din.readInt();
            int chem = din.readInt();
            int bio = din.readInt();
            int comp = din.readInt();

            double perc = (phy+chem+bio+comp)/4.0;
            dout.writeDouble(perc);
            if(perc>=90){
                grade="A";
            }
            else if(perc>=70){
                grade="B";
            }
            else if(perc>=60){
                grade="C";
            }
            else if(perc>=40){
                grade="D";
            }
            else if(perc<40){
                grade="E";
            }
            System.out.println("Grade : "+grade);

        }while(din.available()>0);
    }
}
