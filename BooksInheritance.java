import java.util.Scanner;

class Book{
	String bookname,author;
	Scanner sc = new Scanner(System.in);
	void input() {
		System.out.println("Enter bookname");
		bookname = sc.nextLine();
	}
	void childrenbook() {
		System.out.println("Enter author:");
		author = sc.nextLine();
	
	}
}
class Other extends Book{
	String bookname1,author2;
	void input1() {
		System.out.println("Enter Second Book name:");
		bookname1 = sc.nextLine();
		}
	void book2() {
		System.out.println("Enter author:");
		author2 = sc.nextLine();
	
}
}
public class BooksInheritance {
	public static void main(String[] args) {
		Other bk = new Other();
			bk.input();
			System.out.println("Entered Bookname is:" +bk.bookname);
			bk.childrenbook();
			System.out.println("Entered Author name is:" +bk.author);
			bk.input1();
			System.out.println("Entered Other Bookname is:" +bk.bookname1);
		    bk.book2();
			System.out.println("Entered Author name is:" +bk.author2);
	}

}
