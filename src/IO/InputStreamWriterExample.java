package IO;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * Created by привет on 29.03.2016.
 */
public class InputStreamWriterExample {
    public static void main(String[] args) throws Exception{

    Writer out = new BufferedWriter(new OutputStreamWriter(
            new FileOutputStream("outfilename"), "UTF8"));
    out.write("asdf");
    out.close();

}}
