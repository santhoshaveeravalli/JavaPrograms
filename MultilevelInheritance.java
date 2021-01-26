import java.util.Scanner;

class Mobile{
	String brand;
	Scanner sc = new Scanner(System.in);
	void input()
	{
		System.out.println("Enter Brand");
		brand = sc.nextLine();
	}

}
class Samsung extends Mobile{ 
	String model;
	void input2()
	{
		System.out.println("Entered model:");
		model= sc.nextLine();
	}
	void cases() {
	if(model.equals("A8"))
	{
		System.out.println("Mid Range Mobile");
	}
	else if(model.equals("Note"))
	{
		System.out.println("High end Mobile");
	}
	else {
		System.out.println("Normal range mobile");
	}
}
	
}

class Note extends Samsung{
	int price;
	void input3() {
		System.out.println("Enter Price of the Mobile");
		price = sc.nextInt();
	}
}
public class MultilevelInheritance {

	public static void main(String[] args) {
	     Note nt = new Note();
	     nt.input();
	     nt.input2();
	     nt.cases();
	     nt.input3();
	     
	     System.out.println("Entered Brand:" +nt.brand);
	     System.out.println("Model:" +nt.model);
	     System.out.println("Price:"+nt.price);

	}

}
