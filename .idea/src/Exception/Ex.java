package Exception;

import java.util.Random;

/**
 * Created by pc on 14.01.2016.
 */
public class Ex {
    public static void main(String[] args){
        int a= 0;
        int b=0;
        int c =0;

            try{
        a= b/c;}
catch (Exception e){//общий обработчик исключений
        System.out.println(e);
    }
/*
Throwable->Exception->RuntimeException(AriphmeticException and ...)
         |_>Error
*/



    }
}
