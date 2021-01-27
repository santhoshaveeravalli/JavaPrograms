class animal{
	animal(String type){
		System.out.println("Animal Type:" +type);
	}
}
class bird extends animal{

	bird(String type) {
		super("Lion");
		
		System.out.println("Birds Can't fly  " +type);
		}
	
}
public class SuperConstructor {

	public static void main(String[] args) {
	bird bd = new bird("Kiwi");
	
	}

}
