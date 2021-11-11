package corejava;

public class VariableSample {
	//Global Variable
	static int a = 100;
	static int b = 50;
	
	public static void  add() {
		//Local Variable
		//int a = 190;
		int b = 80;
		  System.out.println("The Addition of two values are: "+(a + b));//? 
		  }
	
	public static void main(String[] args) {
		//a is variable
		//= is operator
		//90 is value of variable
		//int is DATATYPE
	System.out.println("The Mul of two values are: " +(a * b));
	add();
	
	}
}
