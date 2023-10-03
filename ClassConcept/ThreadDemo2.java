package ClassConcept;

// using runnable interface

class Calculation4 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            System.out.println("Calc4 " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Calculation5 implements Runnable {
    @Override
    public void run() {
        for (int i = 100; i <= 200; i++) {
            System.out.println("Calc5 " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class ThreadDemo2 {
    public static void main(String[] args) {
        Calculation4 cal4 = new Calculation4();
        Calculation5 cal5 = new Calculation5();
        Thread t1 = new Thread(cal4);
        Thread t2 = new Thread(cal5);
        t1.start();
        t2.start();
    }
}
