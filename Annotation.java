package javaConcept;



class EcoBook{
	public void showTheBookName(){
		System.out.println("This is Economics Book");
	}
	
}

class Library extends EcoBook{
	@Override
	public void showTheBookName(){
		System.out.println("This is a Book");
	}
}
public class Annotation {
    public static void main(String[] args) {
		Library obj = new Library();
		obj.showTheBookName();
		}
}
