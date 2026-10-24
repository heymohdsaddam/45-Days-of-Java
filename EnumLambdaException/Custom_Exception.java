package EnumLambdaException;

class MyException extends Exception {
    public MyException(String string) {
        super(string);
    }
}

public class Custom_Exception {
    public static void main(String[] args) {
        int i = 18;
        int j = 20;
        try {
            j = i / j;
            if (j == 0) {
                throw new MyException("Ho gaya panga");
            }
        } catch (MyException e) {
            j = 1; // ye ho gaya sahi
            System.out.println(e.getLocalizedMessage() + " lekin " + "theek hi hai!!");

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage() + " lekin " + "ye chalega chahe kuch bhi ho!!");
        }
    }
}
