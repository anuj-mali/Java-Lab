package ClassConcept;

import java.io.*;

public class FileHandlingDemo {
    public static void main(String[] args) {
        // Creating new file
        try {
            File file = new File("csit.txt");
            if (!file.exists()) {
                file.createNewFile();
                System.out.println("Created new file");
            } else {
                System.out.println("File already exists");
            }

            // NOTE: File handling Methods
            System.out.println("File name is " + file.getName());
            System.out.println("File path is " + file.getPath());
            System.out.println("File absolute path is " + file.getAbsolutePath());
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
}
