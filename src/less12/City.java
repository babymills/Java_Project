package less12;

/**
 * Created by Катя on 26.10.2015.
 */
enum City{
    Kh("1",10,6000),Lviv("2",3000,11),Kiev("3",7000,20);
    private String numb;
    private int people;
    private int obj;


    City(String numb, int obj, int people) {
        this.numb = numb;
        this.obj = obj;
        this.people = people;
    }

    @Override
    public String toString() {
        return "Город" +
                "='" + numb + '\'' +
                ", населенние=" + people +
                ", обьектов=" + obj + super.toString();
    }
}
class office{
    private int sotr;
    private String Director;
    City sd;

    public office(int sotr, City sd, String director) {
        this.sotr = sotr;
        this.sd = sd;
        Director = director;
    }

    @Override
    public String toString() {
        return "Офис{" +
                "сотрудников=" + sotr +
                ", Директорr='" + Director + '\'' +
                ", " + sd +
                '}';
    }
}