package javaConcept;

@FunctionalInterface
interface Lambada{
	void show(int a, int b);
}
public class LambadaExpression {
     public static void main(String[] args) {
		Lambada obj = (int a, int b) -> System.out.println(" sum by lambada Expresion = " + (a+b));
		
		obj.show(4, 5);
	
     
     }
}
