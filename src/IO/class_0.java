package IO;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by pc on 18.01.2016.
 */
public class class_0 {
    public static void main(String[] args) throws IOException {

        InputStream inFile   = new FileInputStream("D:\\IdeaProjects\\javaSchool\\src\\D.txt");

        readFullyByByte(inFile);
        System.out.print("\n\n\n");

        InputStream inUrl = new URL("http://vk.com").openStream();

        readFullyByByte(inUrl);
        System.out.print("\n\n\n");

        InputStream inArray = new ByteArrayInputStream(new byte[] {65, 66, 67, 68, 69});
        readFullyByByte(inArray);
        System.out.print("\n\n\n");
    }

    public static void readFullyByByte(InputStream in) throws IOException {
        while (true) {
            int oneByte = in.read();
            if (oneByte != -1) {
                System.out.print((char) oneByte);
            } else {
                System.out.print("\n" + "end");
                break;
            }
        }
    }
}

