package javaConcept;

class Calc {
    public int add(int a, int b) {
        return a + b;
    }
}

class AdvCalc extends Calc {
    public int add(int a, int b) {// Same method name and parameters as in parent class, but different behavior
        return a + b + 1; // Overridden method with different behavior
    }
}

public class MethodOverriding{
    public static void main(String[] args) {
        Calc obj = new AdvCalc();
        int r1 = obj.add(2, 4);
        System.out.println(r1);
    }
}
