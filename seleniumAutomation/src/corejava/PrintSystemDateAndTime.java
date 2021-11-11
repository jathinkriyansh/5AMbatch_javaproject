package corejava;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrintSystemDateAndTime {

	public static void main(String[] args) {
		
   Date d = new Date() ;
	System.out.println(d); //Sun Oct 24 08:14:34 IST 2021
	// print date on your format
	DateFormat df = new SimpleDateFormat("ddMMMyyyy_HHmmss") ;
	//convert the default system date to your own format
	System.out.println( df.format(d) );
	
	//Sun Oct 24 08:25:29 IST 2021
	//24Oct2021_082529

	
	
	}
	
	

}
