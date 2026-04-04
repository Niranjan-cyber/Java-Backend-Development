package m_userinput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class demo {
    public static void main(String[] args) throws IOException {
        // int num = System.in.read();  // reads the ascii value
        // System.out.println(num);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num1 = Integer.parseInt(bf.readLine()); // gives string
        System.out.println(num1);

        bf.close();
    }
}
