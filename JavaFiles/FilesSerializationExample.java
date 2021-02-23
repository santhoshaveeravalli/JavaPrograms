package Files;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {
	int id;
	String name;
	float marks;
public Student(int id,String name,float marks) {
		super();
		this.id = id;
		this.name= name;
		this.marks = marks;
	}
	 
}
public class FilesSerializationExample {

	public static void main(String[] args) throws IOException {
		Student s = new Student(101,"Santhu",990.09f);
		FileOutputStream fo = new FileOutputStream("C:\\Users\\santh\\Desktop\\JavaPrograms\\JavaPrograms\\Java Files\\text.txt");
		ObjectOutputStream o = new ObjectOutputStream(fo);
		o.writeObject(s);
		
		o.close();
	}

}
