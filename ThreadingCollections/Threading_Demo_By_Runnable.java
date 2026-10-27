package ThreadingCollections;

class A implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hey");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println("something went wrong");
            }
        }
    }
}

class B implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(300);
            } catch (Exception e) {
                System.out.println("something went wrong");
            }
        }
    }
}

public class Threading_Demo_By_Runnable {
    public static void main(String[] args) {
        Runnable a = new A();
        Runnable b = new B();
        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b);
        a1.start();
        b1.start();
    }
}
