package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class AnnotationSampleTwo {
  @Test//Actuall Test Case
  public void f() {
	  System.out.println("@Test f");
  }
 
  @Test//Actuall Test Case
  public void abc() {
	  System.out.println("@Test abc");
  }
  
  @Test//Actuall Test Case
  public void z() {
	  System.out.println("@Test z");
  }
  
   @BeforeClass//pre-condition
  public void beforeClass() {
 System.out.println(" @BeforeClass");
  }

  @AfterClass//post-condition
  public void afterClass() {
	  System.out.println(" @AfterClass");
  }

}
