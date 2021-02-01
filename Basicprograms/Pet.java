class Pets {
	     static String Pettype;
		 static String name;
		 int age;
		 String Color;
}
class PetBreed {
	    String breedname;
}
public class Pet {
		// TODO Auto-generated method stub
       		public static void main(String[] args) {
       			PetBreed Pug = new PetBreed();
       			Pug.breedname = "PUG";
			Pets dog = new Pets();
			Pets.Pettype = "dog";
			Pets.name = "Tommy";
			dog.age = 12;
			dog.Color= "White";
			System.out.println("PetType:" +Pets.Pettype);
			System.out.println("Name:" +Pets.name);
			System.out.println("Age:" +dog.age);
			System.out.println("Color:" +dog.Color);
			System.out.println("*******************************************************");
			Pets cat = new Pets();
			Pets.Pettype = "Cat";
			Pets.name = "Kitty";
			cat.age = 5;
			cat.Color= "Black";
			System.out.println("PetType:" +Pets.Pettype);
			System.out.println("Name:" +Pets.name);
			System.out.println("Age:" +cat.age);
			System.out.println("Color:" +cat.Color);
			System.out.println("*******************************************************");
			System.out.println("Pug Name:" +Pug.breedname);
		}		
		
	}

