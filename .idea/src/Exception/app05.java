package Exception;

/**
 * Created by PC on 01.03.2016.
 */
public class app05 {
    public static void main(String[] args) {
        try{
           int area = area(-10,200);
            System.out.println(area);
        }catch (IllegalArgumentException e){
            System.out.println("bad "+e);

        }
        System.out.println("next");
    }

    public static int area(int i, int i1) {
        if(i<0||i1<0){
            throw new IllegalArgumentException("a | b < 0");
        }
        int x = i*i1;
    if(x<0){
        System.out.println("fef");}
        return x;
    }
}
