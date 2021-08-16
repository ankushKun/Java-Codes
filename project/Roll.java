import java.io.*;

public class Roll {

    public static void main(String[] args) throws IOException {
        DataInputStream din = new DataInputStream(new InputStreamReader("student.dat"));
        DataOutputStream dout = new DataOutputStream(new OutputStreamReader("New.dat"));
        do {
            int roll = din.readInt();
            double marks = din.readDouble();
            if (marks > 80) {
                dout.writeInt(roll);
                dout.writeDouble(marks);
            }
        } while (din.available() > 0);
    }

}