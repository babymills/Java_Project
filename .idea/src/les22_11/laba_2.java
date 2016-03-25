package les22_11;
import java.io.*;

import static java.lang.System.out; 

public class laba_2 {

	public static final String sourceFileName= "sourse.txt";
	public static final String destFileName= "dest.txt";
	public static void main(String[] args) throws IOException {
		 
		BufferedReader reader = new BufferedReader(new FileReader(sourceFileName));
		// TODO Auto-generated method stub
		PrintWriter write=new PrintWriter(destFileName);
		 
		String s=null;
		int words=0, lines=0,chars=0;
	     while ((s=reader.readLine())!=null)
	     {
	    	 lines++;
	    	 String[] ws=s.trim().split("\\s");
	    	 words+=ws.length;
	    	 for(String l:ws)
	    		 chars+=l.length();
	    	   	 	    	 
	    	 write.println(s.toUpperCase());
	       }
		  reader.close();
		  write.close();
	out.printf("����������� �������� - %d; ����-%d;�����-%d\n",chars,words,lines);
	}

}
