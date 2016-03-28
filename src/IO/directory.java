package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.regex.Pattern;

/**
 * Created by привет on 28.03.2016.
 */
public final  class directory {
    public static File[] local(File dir,final String regex){
        return dir.listFiles(new FilenameFilter() {
            private Pattern pattern = Pattern.compile(regex);
            @Override
            public boolean accept(File dir, String name) {
                return pattern.matcher(new File(name).getName()).matches();
            }
        });
    }
    public static File[] local(String path,String regex){
        return local(new File(path),regex);
    }
    public static  class TreeInfo implements  Iterable<File>{
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();
        @Override
        public Iterator<File> iterator() {return files.iterator();

        }

           void  addAll(TreeInfo other){
            files.addAll(other.files);
            dirs.addAll(other.files);
        }
        public String toString(){
            return "dirs: ";
        }

    }
}
