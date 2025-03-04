package javaConcept;


interface Animal{
	int age = 12;
	void sound();
}

interface Pet{
	void pet();
}

class Dog implements Animal,Pet{
	public void sound(){
		System.out.println("The dog is barking loudly");
	}
	public void pet(){
		System.out.println("The dog is a friendly pet animal.");
	}
	
	
}
public class InterfaceImplementation {
	public static void main(String args[]) {
    
    
    Pet obj1;
    obj1 = new Dog();
    obj1.pet();
    
    Animal obj;
    obj = new Dog();
    obj.sound();
    
    System.out.println("The Dog is "+ Animal.age + "years old and it is a wonderful pet!");
    
	}
}
