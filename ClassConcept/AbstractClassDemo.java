package ClassConcept;

// its object cannot be created.
// it can have instance variable, constructor, normal method
// it can have abstract method: methods that do not have implementation part and
// are only declared
// normal class have to inherit abstract class and should provide implementation
// of abstract method
// abstract keyword is used.

abstract class Calculation {
    // instance variable
    private int x;
    private int y;

    // Constructor
    public Calculation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // normal method
    public void calcSum() {
        System.out.println("Sum is " + (this.x + this.y));
    }

    // abstract method
    public abstract void calcDiff(int x1, int x2);

    public abstract int calcMulti(int x1, int x2);
}

class Solution extends Calculation {
    private int x2;
    private int y2;

    public Solution(int x2, int y2) {
        super(x2, y2);
        this.x2 = x2;
        this.y2 = y2;
    }

    // normal method
    public void calcDiv() {
        System.out.println(x2 / y2);
    }

    // abstract method implementation
    @Override
    public void calcDiff(int x, int y) {
        System.out.println(x - y);
    }

    @Override
    public int calcMulti(int x, int y) {
        return x * y;
    }

}

public class AbstractClassDemo {
    public static void main(String[] args) {
        Solution sol = new Solution(30, 2);
        sol.calcDiff(20, 10);
        sol.calcDiv();
        sol.calcSum();
        System.out.println(sol.calcMulti(2, 3));

        // using reference of abstract class
        Calculation c1;
        c1 = sol; // dynamic method dispatch
        c1.calcDiff(20, 4);
    }
}
