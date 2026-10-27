package EnumLambdaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Try_With_Resources_With_Finally {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = null;
        System.out.println("Enter a number : ");
        try {
            bf = new BufferedReader(new InputStreamReader(System.in));
            int i = Integer.parseInt(bf.readLine());
            System.out.println("This is your number : " + i);
        } catch (Exception e) {
            System.out.println("If something is happen it shows!!");
        } finally {
            System.out.println("This will invoke any how if there is a exception or not!!");
            // it will majorly used for closing the resources
            bf.close();
            // closing the resources is important so that there should be no waiting for
            // resources
            System.out.println("Resource is closed!!");
        }

    }
}
