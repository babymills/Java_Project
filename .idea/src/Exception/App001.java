package Exception;

/**
 * Created by PC on 04.03.2016.
 */
public class App001 extends RuntimeException{
    public App001() {
    }

    public App001(String sd) {
        super(sd);
    }
}
 class App002 extends Exception{
     public App002() {
     }

     public App002(String message) {
         super(message);
     }
 }
class Demo{
    public static int f(int c) throws App001{
       // c = 0;
    //    return c;
        System.out.println(c);
     throw new App001("Зараженный метод из App001");
    }
    public static void g() throws App002 {
        throw new App002("Зараженный метод из App002");
    }
    public static void main(String[] args) {
        try {

            System.out.println(f(2));
        } catch (App001 app001) {
            app001.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            g();
        } catch (App002 app002) {
            app002.printStackTrace();
        }

    }
}