package LabsOOP.Labs1;

/**
 * Created by Катя on 27.10.2015.
 */
public class product2 extends Main {
    protected String filler;

    public product2(String name, int price, String form, String color, String filler) {
        super(name, price, form, color);
        this.filler = filler;
    }

    @Override
    public String toString() {
        return "Вид2: " + super.toString()+
                ", Начинка=" + filler ;
    }

    public String getFiller() {
        return filler;
    }

    public void setFiller(String filler) {
        this.filler = filler;
    }

    @Override
    public void by() {

    }
}
