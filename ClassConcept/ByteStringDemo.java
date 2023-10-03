package ClassConcept;

import java.io.*;

// NOTE: File Stream
// Stream is a sequence of data.
// It is used for reading and writing data.
// ByteStream: to read and write data through sequence of byte, two classes are used
// FileInputStream:  to read data from file through byte stream
// FileOutputStream: to write data into file through byte stream
public class ByteStringDemo {
    public static void main(String[] args) {
        // ANCHOR: Write into file using byte stream
        try {
            FileOutputStream fos = new FileOutputStream("csit.txt");
            String msg = "This is file handling class";

            // Converting to bute
            byte[] b1 = msg.getBytes();
            fos.write(b1);
            System.out.println("Content written successfully");
            fos.close();

            // ANCHOR: Reading from file using byte stream
            FileInputStream fis = new FileInputStream("csit.txt");
            int res;
            while ((res = fis.read()) != -1) {
                System.out.print((char) res);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
