package testng;

import org.testng.annotations.Test;

public class PrioritySample {
	 @Test(priority = 1)
	  public void c () {
	  System.out.println(" @Test c");
	  }
	  @Test(priority = 2)
	  public void z () {
	  System.out.println(" @Test z ");
	  }
	  @Test(priority = 4)
	  public void h () {
	  System.out.println(" @Test h");
	  }
	  @Test(priority = 3)
	  public void abc () {
	  System.out.println(" @Test abc");
	  }

	}
