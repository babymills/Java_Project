package RAZNOE;

/**
 * Created by PC on 10.03.2016.
 */
public class Aaaa {
    public static int x =1;

    public void x(){
        System.out.println("AAAA");
    }

    public int B() {
      return 0;
    }
}
class B extends Aaaa{
    public B(){
        System.out.println("B");
    }
    public void x(){
        System.out.println("BBBBB");
    }
}
class main{
    public static void main(String[] args) {
        Aaaa a = new B();
       System.out.println(Aaaa.x);
        System.out.println(new Aaaa().B());
        a.x();
    }
}