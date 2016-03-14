package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;

/**
 * Created by Катя on 28.11.2015.
 */
public class DirListOnly  {
    public static void main(String args[]) {
        String dirname = "D:\\IdeaProjects\\javaSchool\\src";
        File f1 = new File(dirname);
        FilenameFilter only = new OnlyExt("txt");//фильтрует по типу файла
        String s[] = f1.list(only);
        for (int i=0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }
}
