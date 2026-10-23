package EnumLambdaException;

/*  Type of Interface
    1- Normal Interface
    2- Functional Interface / SAM aka Single Abstract Method
    3- Marker Interface / Blank Interface
 */

@FunctionalInterface
interface SAM {
    public void show(); // when using @FunctionalInterface you can't declare any method except one
}

public class Types_Of_Interface_And_Lambda_Expression {
    public static void main(String[] args) {
        SAM obj1 = new SAM() {
            public void show() {
                System.out.println("In A");
            }
        };
        obj1.show();

        SAM obj2 = () -> {
            System.out.println("In Lamda A");
        };
        obj2.show();

        SAM obj3 = () -> System.out.println("In One Liner Lamda A");
        obj3.show();

    }
}
