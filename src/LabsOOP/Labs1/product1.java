package LabsOOP.Labs1;

/**
 * Created by Катя on 27.10.2015.
 */
public class product1 extends Main{
    private double weight;

    @Override
    public String toString() {
        return "Вид1: " +super.toString()+
                " Вес= " + weight +" грамм" ;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public product1(String name, int price, String form, String color, double weight) {
        super(name, price, form, color);
        this.weight = weight;
    }



    @Override
    public void by() {

    }
}


