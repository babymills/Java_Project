package packag.p1;

/**
 * Created by pc on 12.01.2016.
 */
public class Prottection {
    int n =1;
    private  int n_pri =2;
    protected   int n_pro =3;
    public   int n_pub =4;
    public Prottection(){
        System.out.println("Construtor bassic Class");
        System.out.println("n = "+n);
        System.out.println("n_pri = "+n_pri);
        System.out.println("n_pro = "+n_pro);
        System.out.println("n_pub = "+n_pub);
    }
}
