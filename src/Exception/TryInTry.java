package Exception;

/**
 * Created by pc on 14.01.2016.
 */
public class TryInTry {
    public static void main(String[] args) {
        try{
            int a = args.length;//нужно занести числа в аргументы
                       int b = 42/a;
        System.out.println("a = "+a);
        try {
            if (a == 1)
                a = a / (a - a);
            if (a == 2) {
                int c[] = {1};
                c[42] = 99;
            }
        }catch (Exception e){
            System.out.println("Выход за пределы массива "+e);
        }
        }catch (Exception e){
            System.out.println("Деление на ноль"+e);
        }
    }}

