package javaConcept;


class A {
 public void show() {
     System.out.println("In A show");
 }
}

class B extends A {
 public void show() {
     System.out.println("In B show");
 }
}

class C extends A {
 public void show() {
     System.out.println("In C show");
 }
}

public class DynamicMethodDispatch  {
 public static void main(String[] args) {
     A obj; 
     obj = new A();
     obj.show(); 
     
     obj = new B();
     obj.show(); 
     
     obj = new C();
     obj.show(); 
 }
}
