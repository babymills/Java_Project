package LabsOOP.Labs1;

/**
 * Created by Катя on 27.10.2015.
 */
public abstract class Main {
    private String name;
    private int  price;
    private String form;
    private String color;

public abstract void by();
    public Main(String name, int price, String form, String color) {
        this.name = name;
        this.price = price;
        this.form = form;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public static int averagePrice(Main[] price){
        int c = 0;
        for(int i=0;i<price.length;i++){
            c+=price[i].getPrice();

        }
        return c/price.length;



    }

    @Override
    public String toString() {
        return
                "Название= " + name  +
                ", Цена=" + price +"$"+
                ", Форма=" + form  +
                ", Цвет=" + color ;
    }
}
