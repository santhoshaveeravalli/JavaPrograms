package Files;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputExample 
{

	public static void main(String[] args) throws IOException 
	{
     FileOutputStream ft = new FileOutputStream("C:\\Users\\santh\\Desktop\\JavaPrograms\\JavaPrograms\\Java Files\\text.txt");
     BufferedOutputStream bt = new BufferedOutputStream(ft);
     ft.write(65);
	// ft.close();
	 String s = "\nThis is practise program\n";
	 byte[] str = s.getBytes();
	 ft.write(str);
	 //ft.close();
	 String s1 = "This is Buffered Output Stream";
	 byte[] st = s1.getBytes();
	 bt.write(st);
	 bt.close();
	 
	
	 
	}

}
