package ClassConcept;

import java.io.*;

// Serialization is the process of writing object to file
// Deserialization is the process of reading object from file

// Two classes are used
// ObjectOutputStream: to write the object
// ObjectInputStream: to read the object

class Rectangle implements Serializable {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void calcArea() {
        System.out.println("Area = " + (this.length * this.breadth));
    }

    public void calcPeri() {
        System.out.println("Perimeter = " + (2 * (this.length + this.breadth)));
    }
}

public class SerializationDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(20, 30);

        try {
            // NOTE: Serialization
            // Opening file for writing
            FileOutputStream fos = new FileOutputStream("csit.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(rect);
            System.out.println("Object written to file");
            oos.close();
            fos.close();

            // NOTE: Deserialization
            FileInputStream fis = new FileInputStream("csit.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Rectangle r2 = (Rectangle) ois.readObject();
            r2.calcArea();
            r2.calcPeri();
            ois.close();
            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        }

    }
}
