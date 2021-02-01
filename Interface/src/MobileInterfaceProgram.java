interface Apple{
	void price();
}
interface Samsung{
	void os();
}
class Mobile implements Apple,Samsung {
	public void price() {
		System.out.println("Price-1099Usd");
	}
	public void os() {
		System.out.println("OS is Android");
	}
}
public class MobileInterfaceProgram {

	public static void main(String[] args) {
	 Mobile m = new Mobile();
	 m.price();
	 m.os();

	}

}
