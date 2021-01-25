import java.util.Scanner;

class Stud{
	void total(int sub1,int sub2) {
		System.out.println("Total =" +(sub1+sub2));
		}
	void total(float sub1,float sub2) {
		System.out.println("Total=" +(sub1+sub2));
	}
}
public class Methodoverloading {

	public static void main(String[] args) {
		Stud stu = new Stud();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Values:");
		stu.total(sc.nextFloat(),sc.nextFloat());

	}

}
