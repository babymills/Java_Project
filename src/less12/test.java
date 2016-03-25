package less12;

/**
 * Created by Катя on 26.10.2015.
 */
public class test {
    public static void main(String[] args) {
        office a = new office(12,City.Kh,"Boris");
        System.out.println(a.toString());
        City b[] = City.values();
        for(City v :b){
            System.out.println(v);

    }
}}