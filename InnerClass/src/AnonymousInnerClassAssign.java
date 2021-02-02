interface Person{
	int age = 28;
	void getPerson();
}
public class AnonymousInnerClassAssign {

	public static void main(String[] args) {
		Person p = new Person() {

			@Override
			public void getPerson() {
				System.out.println(age);
				
			}
			
		};
		p.getPerson();

	}

}
