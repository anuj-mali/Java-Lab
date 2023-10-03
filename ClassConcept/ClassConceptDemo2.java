package ClassConcept;

// SECTION: Box Class
class Box {
    // instance variable
    private int length;
    private int breadth;
    private int height;

    // constructor
    public Box(int length, int breadth, int height) {
        this.length = length;
        this.breadth = breadth;
        this.height = height;
    }

    // method
    public void displayBox() {
        System.out.println("Length = " + this.length);
        System.out.println("Breadth = " + this.breadth);
        System.out.println("Height = " + this.height);
    }

    public int calcVolume() {
        return (this.length * this.breadth * this.height);
    }
}

public class ClassConceptDemo2 {
    public static void main(String[] args) {
        Box b1 = new Box(10, 20, 30);
        b1.displayBox();
        System.out.println(b1.calcVolume());
    }
}
