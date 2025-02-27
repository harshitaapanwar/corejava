package javaConcept;

class Human{
	private int age;
	public Human() {
		age = 30;
		System.out.println("this is a constructor");
	}
	
	public int getAge() {
		return age; 
	}
	public void setAge(int age) {
	this.age=age;
	}
}

public class ConstructorConcept {

	public static void main(String[] args) {
		Human obj = new Human();
		Human obj1 = new Human();
		
		System.out.println("Age"+" : "+ obj1.getAge());

	}

}
