package packag.p2;
import packag.p1.Prottection;


/**
 * Created by pc on 12.01.2016.
 */
public class OtherPackage {
    OtherPackage(){
        Prottection p = new Prottection();
        System.out.println("Construtor bassic Class");
       // System.out.println("n = "+p.n);
        //System.out.println("n_pri = "+p.n_pri);
        //System.out.println("n_pro = "+p.n_pro);
        System.out.println("n_pub = "+p.n_pub);
    }
}
