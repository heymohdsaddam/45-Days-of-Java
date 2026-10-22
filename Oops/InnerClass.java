class A {
    public void show(){
        System.out.println("In A");
    }
    
}
public class InnerClass {

    public static void main(String[] args) {
        A obj = new A();
        obj.show();
    }
}