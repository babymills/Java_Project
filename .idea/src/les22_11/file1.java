package les22_11;
import java.io.*;
import java.util.Date;

import static java.lang.System.out;
public class file1 {

	public static Date a;
	public static final String FileName=".\\test.txt"; 
	public static final String dirName=".";
	public static File[] files;
	public static void main(String[] args) {
		File f1=new File(FileName);
	if (!f1.exists())
		{
			out.printf("File %s doesn't exist",f1.getAbsolutePath());
		}
		else 
		{
			out.println("___________________________������ � �������________________");
			a=new Date(f1.lastModified());
			out.printf("File %s  Date: %s Size :%d\n",f1.getName(),a.toString(),f1.length());
           
	     }
	
		File d1=new File(dirName);
		
	if (!d1.exists())
		{
			out.printf("Dir %s doesn't exist",d1.getAbsolutePath());
		}
	else
	{
		if (d1.isDirectory())
			out.println("___________________________������ � �������________________");
			out.println(d1.getName());
			 files= d1.listFiles();// ������ ������ � �����
		for (File file:files)
		{
			if(file.isDirectory()) //�������� ���� ����� 
			out.println(file.getName().toUpperCase());
			else
			out.println(file.getName().toLowerCase());
			/*�������!
	������� ���������� ���������� � ������ ����� � ������� � ������!   
	����� ���������� ���������� �������, ����� ���������� � ��������� ������������!*/
				
		}
	}
		
	}
	
}

