package EnumLambdaException;

public class Exception_Demo {
    public static void main(String[] args) {

        System.out.println("Part-1 -> ");
        int i = 0;
        try {
            int j = 18 / i;
            System.out.println(j);
        } catch (Exception e) {
            System.out.println("Something went wrong, problem is : " + e.getLocalizedMessage());
        }
        System.out.println("Part 1 is completed!!");

        System.out.println("Part-2 ->");
        int[] arr = { 1, 2, 3, 4, 5 };
        try {
            System.out.println(arr[1]);
            System.out.println(arr[5]);
        } catch (Exception e) {
            System.out.println("Something went wrong, problem is : " + e.getLocalizedMessage());
        }
        System.out.println("Part-2 completed!!");

        System.out.println("Part-3 ->");

        try {

            int k = 14 / i;
            System.out.println(k);
            System.out.println(arr[3]);
            System.out.println(arr[6]);

        } catch (ArithmeticException e) {
            System.out.println("Dekh ke divide kro bhai !!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Limit me rahlo bhai!!");
        }
        System.out.println("Ho gya jo hona tha!!!");
    }
}
