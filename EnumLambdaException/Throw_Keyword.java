package EnumLambdaException;

public class Throw_Keyword {
    public static void main(String[] args) {
        int i = 18;
        int j = 20;
        try {
            i = i / j;
            if (i == 0) {
                throw new ArithmeticException("Ho gaya Panga Bhai");
            }
        } catch (ArithmeticException e) {
            i = 1;
            System.out.println(e.getLocalizedMessage() + " lekin " + "Theek hai ab !!");
        }

    }
}
