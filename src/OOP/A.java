package OOP;

/**
 * Created by pc on 12.01.2016.
 */
public class A {
    String name;
        int weight;
    int age;
    int strength;
int c1;
int c2;

    public A(String name, int weight, int age, int strength) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.strength = strength;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getC1() {
        return c1;
    }

    public void setC1(int c1) {
        this.c1 = c1;
    }

    public int getC2() {
        return c2;
    }

    public void setC2(int c2) {
        this.c2 = c2;
    }
    //    static int c() {
//        return 0;
//    }


//    void dd(){
//        c1 = weight+age+strength;
//        System.out.println(c1);
//    }
//    void dd1(){
//
//        c2 = weight+age+strength;
//        System.out.println(c2);
//    }
public boolean fight(A anotherCat){
    int CatPower = this.age + this.weight + this.strength;
    int anotherCatPower = anotherCat.age + anotherCat.weight + anotherCat.strength;
    return CatPower > anotherCatPower;
}
}
