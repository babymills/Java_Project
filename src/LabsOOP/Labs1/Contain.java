package LabsOOP.Labs1;

import java.util.Arrays;
import java.util.Collections;

/**
 * Created by Катя on 15.11.2015.
 */
public class Contain  {
    private Main[]containPastry;
    private int countMain = 0;

    @Override
    public String toString() {
        return "Contain{" +
                "containPastry=" + Arrays.toString(containPastry) +
                ", countMain=" + countMain +
                '}';
    }

    public Main[] getContainPastry() {
        return containPastry;
    }

    public void setContainPastry(Main[] containPastry) {
        this.containPastry = containPastry;
    }

    public int getCountMain() {
        return countMain;
    }

    public void setCountMain(Main p2, int countMain) {
        this.countMain = countMain;
    }

    public Contain(Main[] containPastry, int countMain) {

        this.containPastry = containPastry;
        this.countMain = countMain;

    }
    public void add(Main v){
        if(countMain<containPastry.length){
            containPastry[countMain]=v;
            System.out.println("Продукт добавлен ");
            countMain++;

        }


    }

    public void Index(int index){
        if (index>=0&&index<containPastry.length-1){
            System.out.println(containPastry[index].toString());
        } else {
            System.out.println("Такого элемента нет");
        }
    }
    public void SortByPrice(){


    }}

