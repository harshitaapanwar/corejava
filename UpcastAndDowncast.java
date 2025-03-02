package javaConcept;
class Upclass {
    public void show() {
        System.out.println("In A show");
    }
}

class Downclass extends Upclass {
    public void show2() {
        System.out.println("In B show");
    }
}

public class UpcastAndDowncast{
    public static void main(String[] args) {
    	Upclass obj = (Upclass) new Downclass(); // Upcasting
        obj.show(); 

        Downclass obj1 = (Downclass) obj; // Downcasting
        obj1.show2(); 
    }
}
