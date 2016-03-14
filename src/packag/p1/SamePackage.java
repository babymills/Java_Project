package packag.p1;

/**
 * Created by pc on 12.01.2016.
 */
class SamePackage {
    SamePackage(){
        Prottection p = new Prottection();
        System.out.println("Construtor this package");
        System.out.println("n = "+p.n);
        //System.out.println("n_pri = "+p.n_pri);
        System.out.println("n_pro = "+p.n_pro);
        System.out.println("n_pub = "+p.n_pub);
    }
}
