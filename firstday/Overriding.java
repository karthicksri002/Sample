package firstday;

public class Overriding {

	public void eat(int i) {
		System.out.println("Human is eating");
	}
	public void eat(String i) {
		System.out.println("Human is eating");
	}

	public static void main(String args[]) {
		Overriding obj = new Boy();
		obj.eat(6);
		obj.eat("the snacks");
	}

}

class Boy extends Overriding {
	
	public void eat(int i) {
		System.out.println(i+"boy is eating");
	}
	public void eat(String i) {
		System.out.println("boy is eating "+i);
	}

}