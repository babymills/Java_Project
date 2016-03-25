package Exception;
public class App00001 {
    public static void main(String[] args) {

        System.out.println("f;before");
        try {
            f();
        }catch (Exception e){
            /*finally {
            System.out.println("f:finally");
        }*/
            System.out.println("catch");}
        System.out.println("f:after");
    }
    private static void f() {
        System.out.println("g:before");
        try {
            g();
        } catch (Error e) {
            System.out.println("g:catch");
        }
        System.out.println("g:after");
    }
    private static void g() {
        throw new Error();
    }
}
//g before g cath