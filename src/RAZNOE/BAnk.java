package RAZNOE;

/**
 * Created by Катя on 26.10.2015.
 */
public class BAnk {
    private String nameBank;

    public BAnk(String nameBank) {
        this.nameBank = nameBank;
    }

    public String getNameBank() {
        return nameBank;
    }

    public void setNameBank(String nameBank) {
        this.nameBank = nameBank;
    }

    class account{
        private int numb;
        private int money;

        public account(int numb, int money) {
            this.numb = numb;
            this.money = money;
        }

        public int getNumb() {
            return numb;
        }

        public void setNumb(int numb) {
            this.numb = numb;
        }

        public int getMoney() {
            return money;
        }

        public void setMoney(int money) {
            this.money = money;
        }
        public void add(int sum){
            sum=getMoney()+ sum;
            setMoney(sum);

        }

        @Override
        public String toString() {
            return "account =" + numb +
                    ", money=" + money +"$, "+ "name Bank="+ nameBank+
                    '}';
        }

    }
}
