package LabsOOP;

/**
 * Created by Катя on 19.10.2015.
 */
public class Student {
    private  int id;
    private  String fullName;
    private int age;
    private String address;
    private  int phone;
    private String faculty;
    private  int course;
    private  String group;

    public Student(int id, String fullName, int age, String address, int phone, String faculty, int course, String group) {
        this.id = id;
        this.fullName = fullName;
        this.age = age;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Студент: " +
                "id:" + id +
                ", ФИО: " + fullName +
                ", возраст: " + age +
                ", адресс: " + address +
                ", телефон: " + phone +
                ", Школа: " + faculty +
                ", курс: " + course +
                ", группа: " + group +
                ".";
    }

    public static void main(String[] args) {
        Student[] students = {
        new Student(1, "Луценко Максим Сергеевич", 21, "Харьков", 12123, "IT School", 1, "java"),
        new Student(2, "Нелидова Яна Николаевна", 27, "Харьков", 23123, "IT School", 1, "java"),
        new Student(3, "Рубан Наталия Владиславна", 19, "Харьков", 134123, "IT School", 2, "QA"),
        new Student(4, "Маслов Павел Дмитреевич", 43, "Харьков", 1213223, "IT School", 1, "QA"),
        new Student(5, "Лужкко Петр Андреевич", 32, "Харьков", 2342123, "IT School", 2, "java"),
        };
        System.out.println("Список студентов группы java:");
        for(Student student:students){
        if("java".equals(student.getGroup())){
            System.out.println(student.toString());
        }
}
        System.out.println("Список студентов группы QA:");
        for(Student student:students){
            if("QA".equals(student.getGroup())){
                System.out.println(student.toString());
    }}
        System.out.println("Список всех студентов:");
    for(int i=0;i<students.length;i++)
        System.out.println(students[i]);
        System.out.println("Старше 30 лет");
        for(Student student:students){
            if(student.getAge()>30){
                System.out.println(student.toString());

            }
        }
        System.out.println("На 2 курсе java");
        for(Student student:students){
            if(2==student.getCourse()& "java".equals(student.getGroup()))
            {
                System.out.println(student.toString());
    }}}}