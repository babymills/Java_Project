package packag;

/**
 * Created by pc on 12.01.2016.
 */
public class AccountBalance {
    public static void main(String[] args) {
        Balance current[] = new Balance[3];
        current[0] = new Balance("Max",111);
        current[1] = new Balance("Petr",222);
        current[2] = new Balance("Igg",333);
        for(int i = 0;i<3;i++)
            current[i].show();

    }
}
