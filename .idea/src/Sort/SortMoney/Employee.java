package Sort.SortMoney;

/**
 * Created by Катя on 27.10.2015.
 */
class Employee implements Comparable<Employee> {
    private String name;

    public Employee(int money, String name) {
        this.money = money;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }

    private int money;
    public  int compareTo(Employee e){
        if(money < e.money) return -1;
        if(money > e.money) return 1;
        return 0;

    }


}
