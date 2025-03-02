package javaConcept;

public class WrapperClass {
    public static void main(String[] args) {
        // Boxing
        int num = 7;
        Integer num1 = new Integer(num); 
        Integer num2 = Integer.valueOf(num); 
        System.out.println("Boxing: " + num1);

        // Autoboxing
        Integer num3 = num;
        System.out.println("Autoboxing: " + num3);

        // Unboxing
        Integer num4 = new Integer(10); 
        int num5 = num4.intValue(); 
        System.out.println("Unboxing: " + num5);

        // Auto-unboxing
        int num6 = num4;
        System.out.println("Auto-unboxing: " + num6);

        // Parsing a String to Integer
        String str = "12";
        int num7 = Integer.parseInt(str);
        System.out.println("Parsing String to Integer: " + num7);
    }
}
