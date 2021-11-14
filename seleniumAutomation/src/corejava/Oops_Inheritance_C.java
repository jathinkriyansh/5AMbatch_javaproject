package corejava;

public class Oops_Inheritance_C  {
	
	public static void mul() {
		int a = 190;
		int b = 80;
		System.out.println("The Addition of two values are: " + (a * b));
	}

	public static void main(String[] args) {
		//CLASSNAME referenceName = new CLASSNAME();
		Oops_Inheritance_B  abc = new Oops_Inheritance_B();

		mul();
//		add();
//		sub();
		abc.sub();
		abc.add();
	}

}
