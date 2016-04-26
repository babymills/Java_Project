package Collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by привет on 20.04.2016.
 */
public class IsEmptyDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<>();
        while (true){
            String n = reader.readLine();
            if(n.isEmpty())break;
            list.add(n);
        }
        System.out.println(list);

    }}
