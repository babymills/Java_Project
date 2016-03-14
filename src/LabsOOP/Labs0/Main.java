package LabsOOP.Labs0;

/**
 * Created by Катя on 27.10.2015.
 */
public class Main {
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