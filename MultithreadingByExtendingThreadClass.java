package javaConcept;

class Table1 extends Thread{
    int result = 0;
    int n;

    
    public Table1(int n) {
        this.n = n;
    }

    
    public int get() {
        return result;
    }

    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}

class Table2 extends Thread{
    int result = 0;
    int n;

   
    public Table2(int n) {
        this.n = n;
    }

    
    public int get() {
        return result;
    }

    
    public void run() {
        for (int i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println(n + " * " + i + " = " + result);
        }
    }
}

public class MultithreadingByExtendingThreadClass {
    public static void main(String[] args) {
        
        Table1 obj1 = new Table1(2);  
        Table2 obj2 = new Table2(3);  
        obj1.start();  
        obj2.start();  
    }
}
