package javaConcept;

class Obj {
    public Obj() {
        System.out.println("Obj is created");
    }

    public void show() {
        System.out.println("In show");
    }
}

public class AnonymousObject {
    public static void main(String[] args) {
        new Obj().show(); // Anonymous object can be used only once
    }
}
