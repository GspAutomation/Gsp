package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
   
  @Test
  public void a() {
	  Reporter.log("hi I am From a", true);
  }
}
