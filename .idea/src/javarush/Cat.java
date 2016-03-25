package javarush;

/**
 * Created by pc on 29.01.2016.
 */
public class Cat {
    public static int count = 0;
    public static int fightCount = 0;

    protected String name;
    protected int age;
    protected int weight;
    protected int strength;

    public Cat(String name, int age, int weight, int strength) {
        count++;

        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Cat anotherCat) {
        fightCount++;

        int agePlus = this.age > anotherCat.age ? 1 : 0;
        int weightPlus = this.weight > anotherCat.weight ? 1 : 0;
        int strengthPlus = this.strength > anotherCat.strength ? 1 : 0;
        int score = agePlus + weightPlus + strengthPlus;
        if (score >= 2 ? true : false) {
            System.out.println("Win");
            return true;
        }else

            System.out.println("Lose");
            return false;
    }
}