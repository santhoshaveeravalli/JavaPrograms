class Mobile{
	void os() {
		System.out.println("Android");
		Samsung s = new Samsung();
		s.price();
	}
    class Samsung{
    	void price() {
    		System.out.println("Price is 999Usd");
    	}
    }
}
public class InnerClassAssignment1 {

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.os();

	}

}
