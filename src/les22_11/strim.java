package les22_11;
import java.io.*;
import static java.lang.System.out; 

public class strim {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
     FileInputStream st= new FileInputStream("test.txt");
     out.print("\n___________������ � �������� ������ �� ������_____________\n");
     while(st.available()!=0)// ���� ��� ����� ����� ������ �� ��������!
     {
    	 int b=st.read();
    	 char ch=(char)b;
    	 out.print(ch);
     
     }
     st.close();
     FileOutputStream so= new FileOutputStream("out.txt");// ������ � ����!
    String d="������";
    byte[] bytes= d.getBytes();
     so.write(bytes);
     so.close();
     
     BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
     String s=null;
     out.print("\n___________������ � BufferedReader ������ �� �������_____________\n");
     while ((s=reader.readLine())!=null)
     {
     out.println(s);
       }
	  reader.close();
	  
	PrintWriter write=new PrintWriter("out1.txt");
	write.printf("%s %d %c", "������",100,'�');
	write.close();  
	}
/*������� ��������� �������  ����� ����  ��� �� ���������� ������ ���������, ��� ��������  ���� ��� ����������! ��� ��������� � ������� ������� � ���������� ���������� �������� � ����� � ���. ����!  */
}
