class A {
    public void show_1() {
        System.out.println("In A");
    }
}

class B extends A {
    public void show_2() {
        System.out.println("In B");
    }
}

public class Casting_Object {
    public static void main(String[] args) {

        A obj_1 = (A) new B();
        // upcasting A obj_1 = new B();
        obj_1.show_1();

        B obj_2 = (B) obj_1;
        // downcasting B obj_2 = (B) obj_2;
        obj_2.show_2();

    }

}
