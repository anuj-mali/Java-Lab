package ClassConcept;

// it is like a abstract class
// difference is that it contains abstract methods only
// instance variable are declared as constant (final keyword)
// does not have constructor and normal method
// object cannot be created
// declared using interface keyword
// accessed through implements keyword

interface Calculations {
    // abstract method
    void sum(int x, int y);

    void diff(int x, int y);

    void div(int x, int y);
}

class Calculator implements Calculations {
    @Override
    public void sum(int x, int y) {
        System.out.println(x + y);
    }

    @Override
    public void diff(int x, int y) {
        System.out.println(x - y);
    }

    @Override
    public void div(int x, int y) {
        System.out.println(x / y);
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.sum(1, 2);
        calc.diff(20, 10);
        calc.div(20, 4);

        // using interface reference
        Calculations calc2;
        calc2 = calc;
        calc2.sum(23, 12);
    }
}
