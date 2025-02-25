package com.rts.basics;

public class StaticMethod {
	
    public static void main(String[] args) {
      Dd obj1=new  Dd();
      Dd.name="Harshita";
      obj1.sub = "Maths";
      obj1.marks = 94;
      
      Dd obj2 = new Dd();
      Dd.name="Harshita";
      obj2.sub = "Maths";
      obj2.marks = 94;
      Dd.show(obj1);
       
    }
}

class Dd{
	int marks;
    String sub;
      static String name;
    public static void show(Dd obj1) {
        System.out.println(name); 
        System.out.println(obj1.sub+":"+obj1.marks); 
    }
}
