package javaConcept;


class AnnonymousInner {
 public void show() {
     System.out.println("In show");
 }
}


public class AnnonymousInnerClass {
 public static void main(String[] args) {
     
	 AnnonymousInner obj = new AnnonymousInner() {
         public void show() {
             System.out.println("In new show");
         }
     };

     obj.show(); 
 }
}
