package LabsOOP.Labs1;

/**
 * Created by Катя on 15.11.2015.
 */
public class Pastry {
    public static void main(String[] args) {
        Main[] biscuit = new Main[4];
        biscuit[0]= new product1("Coconut",45,"round","white",0.09);
        biscuit[1]= new product1("ChocolateMuffin",50,"round","brown",0.1);
        biscuit[2]= new product2("Carnaval",54,"square","pink","cherry");
        biscuit[3]= new product2("Sunrise",100,"round","yellow","orange");

for(Main v:biscuit) {
    System.out.println(v);
}
        int v = Main.averagePrice(biscuit);
        System.out.println("Средняя цена печенек: "+v+"$");
        System.out.println("Новый контейнер :");
Main[]pech= new Main[5];
 Contain cont = new Contain(pech,0);
        cont.add(biscuit[0]);
        cont.add(biscuit[3]);
        cont.add(biscuit[3]);



         System.out.println("Контейнер с новыми продуктами: " + cont.toString());


    }
}
