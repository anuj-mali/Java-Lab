package ClassConcept;

import java.io.*;

// NOTE: Uses two classes for reading and writing
// FileReader: to read data from file
// FileWriter: to write data into file
public class CharacterStreamDemo {
    public static void main(String[] args) {
        try {
            // ANCHOR: Write into file using character stream
            FileWriter fw = new FileWriter("csit.txt");
            String msg = "Written using file character stream";
            fw.write(msg);
            System.out.println("Written successfully");
            fw.close();

            // ANCHOR: Read from file using character stream
            FileReader fr = new FileReader("csit.txt");
            int res;
            while ((res = fr.read()) != -1) {
                System.out.print((char) res);
            }
            fr.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
