package IO;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Катя on 28.11.2015.
 */
public class OnlyExt implements FilenameFilter {
    String ext;

    public OnlyExt(String ext) {
        this.ext = "." + ext;
    }

    public boolean accept(File dir, String name) {
        return name.endsWith(ext);
    }
}

