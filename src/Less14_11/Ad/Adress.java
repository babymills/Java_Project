package Less14_11.Ad;

/**
 * Created by IT_School on 14.11.2015.
 */
public class Adress implements Comparable {
    private String name;
    private int age;

    public Adress(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Object o) {
        return this.age-((Adress)o).age;
       // return this.name.compareTo(((Adress)o).name);
    }

    @Override
    public String toString() {
        return "Person" +
                "name='" + name + '\'' +
                ", age=" + age;
    }
}
