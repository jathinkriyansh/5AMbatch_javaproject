package corejava;

import java.util.Scanner;

public class ScannerSample {
public static void main(String[] args) {
	
	int a; // = 90 ;
    int b; //= 80 ;
	String c;
	
	//use scanner function to get the data from console
	Scanner s = new Scanner(System.in);
	a = s.nextInt();
	b = s.nextInt();
	c = s.next();
	
	System.out.println("the results of add :  " +(a + b) );
	System.out.println("the results of Sub :  " +(a - b) );
	System.out.println("the results of Div :  " +(a / b) );
	System.out.println(c);
	
	
	
	
	
	
	
	
	
	
	
	}

}
