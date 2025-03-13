package javaConcept;


class Num1 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
}

class Num2 extends Thread{
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println(i);
		}
	}
}
public class PriorityThread {
   public static void main(String[] args) {
	   Num1 obj1 = new Num1();  
	   Num2 obj2 = new Num2();
	   obj1.setPriority(3);
	   System.out.println("priority of Num1 = "+obj1.getPriority());
	   obj2.setPriority(Thread.MAX_PRIORITY);
	   System.out.println("priority of Num1 = "+obj2.getPriority());
       obj1.start();
      
       obj2.start();  
  }
}
