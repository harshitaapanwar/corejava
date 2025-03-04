package javaConcept;


class OuterClass {   //Outer class 
 public void show() {
     System.out.println("In show");
 }

 
 class NonStaticInnerClass{      // Non-static inner class 
     public void config() {
         System.out.println("In config");
     }
 }

 
 static class StaticInnerClass {    // Static inner class 
     public void take() {
         System.out.println("In take");
     }
 }
}


public class InnerClass {
 public static void main(String[] args) {
     
	 OuterClass obj = new OuterClass();    // Creating object of outer class 
     obj.show();


     OuterClass.NonStaticInnerClass obj1 = obj.new NonStaticInnerClass();        // Creating object of non-static inner class 
     obj1.config();

     // Creating object of static inner class 
     OuterClass.StaticInnerClass obj2 = new OuterClass.StaticInnerClass(); // Directly instantiated using outer class
     obj2.take();
 }
}
