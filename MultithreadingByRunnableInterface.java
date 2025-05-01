package javaConcept;

class First implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("hi");
     }
 }
}

class Second implements Runnable {
 public void run() {
     for (int i = 1; i <= 5; i++) {
         System.out.println("hi");
     }
 }
}

public class MultithreadingByRunnableInterface {
 public static void main(String[] args) {
     Runnable obj1 = new First();
     Runnable obj2 = new Second();

     Thread t1 = new Thread(obj1);
     Thread t2 = new Thread(obj2);

     t1.start();
     t2.start();
 }
}
