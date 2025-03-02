package javaConcept;

//Abstract class 
abstract class Car {
 public abstract void drive(); // Abstract method

 public void playMusic() { // Concrete method
     System.out.println("Playing music!");
 }
}

//Concrete class 
class WagonR extends Car {
 public void drive() { // Defining abstract method
     System.out.println("Driving...");
 }
}


public class AbstractKeyword {
 public static void main(String[] args) {
     Car obj = new WagonR(); // Object of the non-abstract class
     obj.drive();
     obj.playMusic();
 }
}
