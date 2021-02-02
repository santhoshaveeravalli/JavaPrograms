class Animal1{
  static class Herbivorours {
	  void eat() {
		  System.out.println("Horse is an heribour");
	  }
	  static void food() {
			  System.out.println("Plant eating animal");
		  }
	  }
		  
  }

public class StaticInnerClassAssignment {

	public static void main(String[] args) {
	  Animal1.Herbivorours h = new Animal1.Herbivorours();
	  h.eat();
	  Animal1.Herbivorours.food();

	}

}
