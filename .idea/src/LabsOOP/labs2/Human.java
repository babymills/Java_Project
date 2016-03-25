package LabsOOP.labs2;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Катя on 22.11.2015.
 */
public abstract class Human {
    abstract void By();
    private boolean sex;
    private String name;
    private String surname;
    private float weight;
    private float height;

    public Human(boolean sex, String name, String surname, float weight, float height) {
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.weight = weight;
        this.height = height;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {

        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return
                "Имя " + name  +
                ", Фамилия " + surname  +
                ", вес=" + weight +
                ", рост=" + height ;
    }
    public Human() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите пол человека: 1- Мужчина, 0- Женщина");
        int s = scanner.nextInt();{
        if (s == 1) {
            sex=true;
        }else{
            sex=false;
        }}


        System.out.println("Введите имя");
       this.name = scanner.next();
        System.out.println("Введите фамилию");
        this.surname = scanner.next();
        System.out.println("Введите вес");
       this.weight = scanner.nextFloat();
        System.out.println("Введите рост");
        this.height = scanner.nextFloat();
    }
    public boolean Speak(Human h1){
        if (isSex() == true) {
            if (h1.isSex() == false)
                return true;
            else {
                if (Math.random() <= 0.5) {
                    return true;
                } else return false;}
        }else return true ;    }

    public boolean Tolerate(Human h1) {
        if (isSex() == true) {
            if (h1.isSex() == false) {
                if (Math.random() < 0.7)
                    return true;
                else return false;
            }else{
                if (Math.random() < 0.05)
                    return true;
                else return false; }}
        else {
            if (h1.isSex() == true) {
                if (Math.random() < 0.7)
                    return true;
                else return false;
            }else{
                if (Math.random() < 0.056)
                    return true;
                else return false;}}};
    public boolean SpendTime(Human h1){
        if(Math.abs(getHeight()-h1.getHeight())>getHeight()*0.1&&Math.random()<0.85){
            return  true;}else {
            if(Math.random()<0.95)return true;
        }return false;
    };

    public void relation(Human h1){
        if((this.Speak(h1)==true) && (this.Tolerate(h1)==true) && (this.SpendTime(h1)==true)){
            System.out.println("Отличная совместимость");

            if (isSex()!=h1.isSex()) {

              makeChildren(h1);

            }
            else{
                if(isSex()==h1.isSex())

                    System.out.println("Плохо");
            }

        }
        else{
            System.out.println("Плохая совместимость");
        }
    }
    public Human makeChildren(Human h2) {
        float childHeight;
        float childWeight;
        Human child;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Назовите дитя");
        String childName  = scanner.nextLine();



        Random random = new Random();
        childHeight = (float) (this.getHeight() + 0.1 * h2.getHeight() - this.getHeight());
        childWeight = (float) (this.getWeight() + 0.1 * h2.getWeight() - this.getWeight());
        if (random.nextDouble() <= 0.5) {
            child = new Woman(false, childName, h2.getSurname(), childWeight, childHeight);
            System.out.println("Поздравляем у вас девочка "+child);
        } else {
            child = new Men(true, childName, h2.getSurname(), childWeight, childHeight);
            System.out.println("Поздравляем у вас мальчик "+child);
        }

        return child;



    }




}
