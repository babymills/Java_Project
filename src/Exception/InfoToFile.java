package Exception;

import java.io.File;
import java.io.IOException;

/**
 * Created by привет on 28.03.2016.
 */
public class InfoToFile {
    public static void main(String[] args) throws IOException {
        File f = new File("C://idea//d.txt");
        System.out.println(f.getAbsoluteFile());
        System.out.println(f.canRead());
        System.out.println(f.getPath());
        System.out.println(f.getCanonicalFile());
        System.out.println(f.lastModified());

    }
}
