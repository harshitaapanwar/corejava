package javaConcept;

class HumanAge {
 private int age;

 public int getAge() {
     return age;
 }

 public void setAge(int age) { 
     this.age = age; // this is used to refer to the instance variable
 }
}

public class ThisKeyword {
 public static void main(String[] args) {
     HumanAge obj = new HumanAge();
     obj.setAge(30);
     System.out.println("Age: " + obj.getAge()); 
 }
}
