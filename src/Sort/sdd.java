import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Катя on 19.10.2015.
 */
public class sdd {
    public static void main(String[] args) throws IOException {
        BufferedReader reader  = new BufferedReader(new InputStreamReader(System.in));
        int[] ab = new int[5];
        for(int i =0;i<ab.length;i++){
            ab[i]=(Integer.parseInt(reader.readLine()));
        }

        Arrays.sort(ab);
        for(Object x:ab)
        System.out.println(x);
    }}
