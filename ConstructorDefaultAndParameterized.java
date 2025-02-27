package javaConcept;


	class Constructor{
		private int age;
		
		public Constructor()    //Default
		{
			age = 12;
		}
		public Constructor(int a) //parameterized
		{
			age = a;
		}
		public int getAge() {
			return age;
		}
		public void SetAge(int age) {
			this.age = age;
		}
	}

	public class ConstructorDefaultAndParameterized {
		public static void main(String args[]) {
	    Constructor obj = new Constructor();
	    Constructor obj1= new Constructor(40);
	    
	    System.out.println("Age:"+ obj.getAge());
	    System.out.println("Age:"+ obj1.getAge());
	}
	}


