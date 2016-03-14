package recursia;

/**
 * Created by pc on 22.02.2016.
 */
public class App00 {
    public static void main(String[] args) {
        f(1);
    }

    private static void f(int arg) {
        System.out.println(" "+arg);
        if(arg <7) {
            f(2 * arg);//рекурсия когда в методе вызывается метод
        }
    }
}
