package Files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializeExample {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream oi = new ObjectInputStream(new FileInputStream("C:\\Users\\santh\\Desktop\\JavaPrograms\\JavaPrograms\\Java Files\\text.txt"));
	Student s =(Student)oi.readObject();
	System.out.println(s.id+" "+s.name+" "+s.marks);
	}

}
