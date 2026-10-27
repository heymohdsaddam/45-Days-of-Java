package ThreadingCollections;

class Increment {
    private int count;

    synchronized void increment() { // synchronized : one thread one time
        count++;
    }

    int getCount() {
        return count;
    }

}

class Race_Condition_Problem {

    public static void main(String[] args) throws InterruptedException {
        Increment in = new Increment();
        Runnable a = () -> {
            for (int i = 0; i < 1000; i++) {
                in.increment();
            }
        };
        Runnable b = () -> {
            for (int i = 0; i < 1000; i++) {
                in.increment();
            }
        };
        Thread a1 = new Thread(a);
        Thread b1 = new Thread(b);

        a1.start();
        b1.start();

        a1.join();
        b1.join();
        // join : when two thread executed completely from next line there will only
        // thread that it main thread
        System.out.println("Estimated value : 2000 ");
        System.out.println("What get : " + in.getCount());
    }
}
