package Exception;

/**
 * Created by pc on 14.01.2016.
 */
public class myException extends Exception {
    private int detail;
    myException(int a){
        detail = a;
    }

    @Override
    public String toString() {
        return "myException{" +
                "detail=" + detail +
                '}';
    }
}
