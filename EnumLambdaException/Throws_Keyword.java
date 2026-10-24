package EnumLambdaException;

class A {
    public void divide(int i, int j) throws ArithmeticException {
        System.out.println(i / j);
    }
}

class B {
    public void show(int[] arr, int i) throws IndexOutOfBoundsException {
        System.out.println(arr[i]);
    }
}

class C {
    void run(int i, int j, int[] arr, int n) throws Exception {
        A a = new A();
        B b = new B();
        b.show(arr, n);
        a.divide(i, j);
    }
}

public class Throws_Keyword {
    public static void main(String[] args) {
        int i = 10;
        int j = 0;
        int[] arr = { 1, 2, 3, 4, 5 };
        int n = 5;
        try {
            C c = new C();
            c.run(i, j, arr, n);
        } catch (Exception e) {
            System.out.println("Got exception : " + e.getLocalizedMessage());
            e.printStackTrace(); // this will print all stack from bottom to top from where exceptions throws
        }

        // C c2 = new C();
        // c2.run(i, j, arr, n); //this will cause a exception
    }
}
