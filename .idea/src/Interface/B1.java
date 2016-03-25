package Interface;

/**
 * Created by pc on 12.01.2016.
 */
public class B1 implements A1.NestedIf,A1.Nov {
    public boolean isNotNegative(int x){
        return x< 0 ? false : true;//если значение х меньше 0 то фолс,больше тру
    }

int c = 4;
    @Override
    public int xo(int d) {
        System.out.println("Привет из метода ХО "+(d+c));
        return 0;
    }
}
