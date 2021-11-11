package corejava;

import javax.swing.text.AbstractDocument.Content;

public class stringAll {

	public static void main(String[] args) {
		String abc ; // string declaration
		abc = " Hi all, How are you?"; //Assign the value of string
		String a =  "3453464" ;
		
		String b = " selenium " ;
		String c=  "Automation" ;

		String d = b+c ;
		System.out.println(d);
	  System.out.println("uppercase: " + d.toUpperCase());
	  System.out.println("Lowercase: " + d.toLowerCase());
	
	  System.out.println(b.length());
	  System.out.println(b.charAt(4)); 
	  //Length: start from 1
	  //Index starts from 0 onwards
	  String e = "Apple" ;
	  String f = "apple" ;
      //equals: compare two string  length wise and decimal value wise and upper/Lower case wise
	  if (e.equals(f)) {
		  System.out.println("both are  matching");
       } else {
    	   System.out.println("both are NOT matching");
      }
	  
	
	  //equals: compare two string  length wise and( decimal value wise/ it will skip the Lower/upper cases)
	  //system will convert the upper case characters to lower case while compare the strings
	  if (e.equalsIgnoreCase(f)) {
		  System.out.println("both are  matching************");
       } else {
    	   System.out.println("both are NOT matching************");
      }
	  
	 String g = "Hi keerthi, how is selenium sessions going on?" ;
	  
	  //validate the keerthi text is present in a string or not?
	  if (g.contains("keerthi")) {
	System.out.println("the given text is present in string");	
	  } else {
		  System.out.println("the given text is NOT present in string");	
	  }
	   if (g.contentEquals("Hi keerthi, how is selenium sessions going on?")) {
	System.out.println("the given text is present in string*****************");	
	 } else {
	 System.out.println("the given text is NOT present in string********");	
			   }
	  //  student
	  //  gender-Male
	  //        -Female
	   
	//Nested if
	//   if (condition) {
	//	if (condition) {
	//	if (condition) {
			
	//	} else {

	//	}	
	//	} else {

	//	}
    //	} else {

	//}
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
