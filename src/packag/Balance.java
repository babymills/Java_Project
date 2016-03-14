package packag;

/**
 * Created by pc on 12.01.2016.
 */
public class Balance {
    String name;
    int bal;

    public Balance(String name, int bal) {
        this.name = name;
        this.bal = bal;
    }
    void show(){
        if(bal<0)
            System.out.println("-->");
            System.out.println(name+": "+bal+"$");
    }

}
