package EnumLambdaException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderDemo {
    public static void main(String[] args) throws NumberFormatException, IOException {
        System.out.println("Enter a number : ");
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int n = Integer.parseInt(bf.readLine());
        System.out.println(n);

        bf.close(); // it is good idea to close buffer
    }
}
