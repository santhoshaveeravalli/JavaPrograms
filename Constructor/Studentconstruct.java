class Stu_detail{
	int id;
	String sub1,sub2;
	Stu_detail(int id, String sub1, String sub2){
		System.out.println("Entered Id:" +id);
		System.out.println("Subject1:" +sub1);
		System.out.println("Subject2:" +sub2);
	}
}
class Civil extends Stu_detail{
	Civil(int id, String sub1, String sub2){
		super(23,".Net","AWS");
		System.out.println("Id:" +id);
		System.out.println("Sub1:" +sub1);
		System.out.println("Sub2:"+sub2);
	}
	
}
public class Studentconstruct {

	public static void main(String[] args) {
		Civil cv = new Civil(12,"Java","GCP");
		
		

	}

}
