package Collection;

import javafx.scene.effect.SepiaTone;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


/**
 * Created by привет on 13.04.2016.
 */
class Holder3{
    public static void main(String[] args) {
        List<Iee> list = new ArrayList<>();
        list.add(new Iee("gfg","fgfgf"));
        System.out.println(list);
    }

}
class Iee {
    public Iee(String... s) {
        this.s = s;
    }

    String []s;

    @Override
    public String toString() {
        return "Iee{" +
                "s=" + Arrays.toString(s) +
                '}';
    }
}