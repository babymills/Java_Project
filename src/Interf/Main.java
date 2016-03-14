package Interf;

/**
 * Created by IT_School on 18.10.2015.
 */
public class Main {
    public static void main(String[] args) {
        Shape s[]=new Shape[3];
        s[0]=new Circle("black",10,10,5);
        s[1]=new Rectangle("yellow",10,10,50,50);
        s[2]=new Circle("green",10,10,5);
        for(int i=0;i<s.length;i++)
            s[i].draw();
    }
}
