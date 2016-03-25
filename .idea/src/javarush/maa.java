package javarush;

/**
 * Created by pc on 29.01.2016.
 */
public class maa {
    public static void main(String[] args) {
        MyFile file = new MyFile();
        file.initialize("c:\\data\\a.txt");

       // String text = file.readText();
        file = new MyFile();
        file.initialize("c:\\data\\", "a.txt");
//
//        String text = file.readText();
//        MyFile file = new MyFile();
//        file.initialize("c:\\data\\a.txt");

        MyFile file2 = new MyFile();
        file2.initialize("a.txt");
        //String text = file2.readText();
    }
}
