package EnumLambdaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_With_Resource_Alone {

    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter number : ");
        // here when we initiate a instance of object inside the try paranthesis it will
        // auto close resource after executing the try block
        try (BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
            int i = Integer.parseInt(bf.readLine());
            System.out.println("This is your number : " + i);
        } catch (Exception e) {
            // If number is input then it will show
            System.out.println("Please input correctly!");
        }
    }
}
