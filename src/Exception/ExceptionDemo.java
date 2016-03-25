package Exception;

/**
 * Created by pc on 14.01.2016.
 */
public class ExceptionDemo extends myException {


    ExceptionDemo(int a) {
        super(a);
    }

    static void compute(int a) throws myException{
        System.out.println("Вызван сомрат" +a+")");
        if(a>10)
            throw new myException(a);
        System.out.println("NORM");
    }
    public static void main(String[] args) {
try{
    compute(1);
    compute(20);
}catch (myException e){
    System.out.println("Perehvacheno "+e);
}}
}
