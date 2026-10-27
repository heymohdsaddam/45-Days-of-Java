package ThreadingCollections;

/**
 * Threading_Demo_By_Lambda
 */
public class Threading_Demo_By_Lambda {

    public static void main(String[] args) {
        Runnable a = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hey!");
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println("something went wrong!");
                }
            }
        };
        Runnable b = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Hello!");
                try {
                    Thread.sleep(300);
                } catch (Exception e) {
                    System.out.println("something went wrong!");
                }
            }
        };
        System.out.println();
        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b);
        a1.start();
        b1.start();
    }
}
