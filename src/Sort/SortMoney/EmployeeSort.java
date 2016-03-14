package Sort.SortMoney;

import java.util.Arrays;

/**
 * Created by Катя on 27.10.2015.
 */
public class EmployeeSort {
    public static void main(String[] args) {
        Employee people []={
        new Employee(3223,"fg"),
        new Employee(33,"vhv"),
        new Employee(623,"f")};
        Arrays.sort(people);
        for(Employee p:people){
            System.out.println(p);
        }
    }
}
