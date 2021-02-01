abstract class Animal {
	Animal(){
		System.out.println("Animal");
	}
    abstract void type();
    abstract void work();
    abstract void age();
}

class Lion extends Animal {
	void type() {
    	System.out.println("Lion");
    }
    void work(){
    	System.out.println("Sleep");
    }
    void age(){
    	 System.out.println(12);
    }
}
class Tiger extends Animal {
	void type() {
    	System.out.println("Tiger");
    }
   	 void work(){
    	System.out.println("Run");
    }
    void age(){
    	 System.out.println(20);
    }
}

class chettah extends Animal {
	void type() {
    	System.out.println("Chettah");
    }
   	 void work(){
    	System.out.println("Hunt");
    }
    void age(){
    	 System.out.println(5);
    }
}

public class AbstractAnimal{  
public static void main(String args[]){ 
	Animal obj;
	obj = new Lion();
	obj.type();
	obj.work();
	obj.age();
	System.out.println("Above are detail of Lion");
	obj = new Tiger();
	obj.type();
	obj.work();
	obj.age();
	System.out.println("Above are detail of TIger");
	obj = new chettah();
	obj.type();
	obj.work();
	obj.age(); 
	System.out.println("Above are detail of Chettah");
	}  
	}  
