package Enum.Values.Valuesof;

/**
 * Created by pc on 18.01.2016.
 */
enum Apple {
    Red(1),Del(2),Switch,GoldenDel(4);
private int price;

    Apple(int price) {
        this.price = price;
    }
    Apple(){//без указания параметров
        price=-1;
    }

    public int getPrice() {
        return price;
    }
}

