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

@FunctionalInterface
interface Sam_Arg_One {
    public void see(int count);
}

@FunctionalInterface
interface Sam_Arg_Two {
    public void sum(int a, int b);
}

@FunctionalInterface
interface Sam_Arg_Return {
    public double average(double x1, double x2);
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

        Sam_Arg_One obj4 = count -> System.out.println("this is your count : " + count);
        obj4.see(7);

        Sam_Arg_Two obj5 = (a, b) -> System.out.println("Sum : " + (a + b));
        obj5.sum(5, 5);

        Sam_Arg_Return obj6 = (x1, x2) -> (x1 + x2) / 2;

        double average = obj6.average(4.5, 4.7);
        System.out.println("Average : " + average);

    }
}
