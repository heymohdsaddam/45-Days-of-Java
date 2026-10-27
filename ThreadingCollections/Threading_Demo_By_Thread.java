package ThreadingCollections;

class A1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hey");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B1 extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threading_Demo_By_Thread {
    public static void main(String[] args) {
        A1 a = new A1();
        B1 b = new B1();
        System.out.println(a.getPriority());
        b.setPriority(Thread.MAX_PRIORITY);
        a.start();
        b.start();
    }
}
