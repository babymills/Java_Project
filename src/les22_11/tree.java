package les22_11;
import java.io.*;
import java.util.*;
import static java.lang.System.out; 

public class tree {
	
	public static void showDir(File f, int lavel)
	{
		if(f.isDirectory())
		{
			StringBuilder sd= new StringBuilder();
			for(int i=1; i<lavel;i++)
			sd.append("   ");
			out.printf("%s%s\n",sd.toString(),f.getName().toUpperCase());
			File[] files=f.listFiles();
			for (File file: files)
			{
				if(file.isDirectory())
					showDir(file, lavel+1);
			}
			for (File file: files)
			{
				if(file.isFile())
					out.printf("%s%s %s",sd.toString(),file.getName().toLowerCase(),new Date(file.lastModified()).toLocaleString());
			}
		}
	}
	public static void showDir(File f)
	{
		showDir( f, 0);
	}
	public static void showDir(String path)
	{
		File f=new File(path);
		if(f.exists()) 
		showDir( f);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     showDir(".");
	}

}
