package javaConcept;


class Abc{
	public Abc(int a) {
		System.out.println("in int a");
	}
	
}

class Bcd extends  Abc{
	public Bcd(int b) {
		super(b);
		System.out.println("in int B");
	    
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		Bcd obj = new Bcd(4);

	}

}
