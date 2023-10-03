package ClassConcept;

// using multithreading, a single program can do multiple work at same time
// in java multithreading can be achieved using two ways
// implementing Runnable interface
// inheriting (extends) Thread class

class Calculation2 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println("Calc2 " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
        System.out.println();
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println("Calc2 " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println(e);
                }
            }
        }
    }
}

class Calculation3 extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Calc3 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        Calculation2 cal = new Calculation2();
        // Starting the thread
        cal.start();

        Calculation3 cal3 = new Calculation3();
        cal3.start();
    }
}
