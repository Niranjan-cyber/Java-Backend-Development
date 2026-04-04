package m_userinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class finally_bfr {
    public static void main(String[] args) throws Exception{
        int num = 0;
        BufferedReader bf = null;

        try 
        {
            //InputStreamReader in = new InputStreamReader(System.in);
            //bf = new BufferedReader(in);
            bf = new BufferedReader(new InputStreamReader(System.in));
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        finally{
            System.out.println("hi");
            bf.close();
        }
    }
}
