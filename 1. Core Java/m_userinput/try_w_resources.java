package m_userinput;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class try_w_resources {
    public static void main(String[] args) throws Exception {
        int num = 0;
        //BufferedReader bf= null;

        // try with resources closes automatically 
        // in finally you know what u r closing
        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))){
            num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
    }
}
