package Exception;

/**
 * Created by PC on 04.03.2016.
 */
public class SimpleExeotion extends Exception {
    private int x;
    public SimpleExeotion() {
    }

    public SimpleExeotion(String message, int x) {
        super(message);
        this.x = x;
    }
public int val(){
    return x;
}
    public String getMessage(){
        return "Message "+x+" "+super.getMessage();
    }//аналог тустринга
    public SimpleExeotion(String message) {
        super(message);
    }
}
        class InheritingExeptions {
            public static void f()throws SimpleExeotion{
                System.out.println("ПРобуждаем SimpleEx with f()");
                   throw new SimpleExeotion();
            }
            public static void g()throws SimpleExeotion{
                System.out.println("ПРобуждаем SimpleEx with g()");
                throw new SimpleExeotion("Make in g()");
            }
            public static void h()throws SimpleExeotion{
                System.out.println("ПРобуждаем SimpleEx with h()");
                throw new SimpleExeotion("Make in h()",47);
            }

            public static void main(String[] args) {
                //InheritingExeptions sed = new InheritingExeptions();
                try {
                    f();

                } catch (SimpleExeotion e) {
                   e.printStackTrace(System.out);
                }try {
                    g();
                } catch (SimpleExeotion e) {
                    e.printStackTrace(System.out);

                }
            try {
                h();
            } catch (SimpleExeotion e) {
                e.printStackTrace(System.out);
                System.out.println("e.val()= "+e.val());
            }
            }


}
