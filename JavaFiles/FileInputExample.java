package Files;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fi = new FileInputStream("C:\\Users\\santh\\Desktop\\JavaPrograms\\JavaPrograms\\Java Files\\Text.txt");
		BufferedInputStream bi = new BufferedInputStream(fi);
		int x = bi.read();
		while(x!= -1) {
			System.out.print((char)x);
			x= bi.read();
			
		}
       bi.close();
	}

}
