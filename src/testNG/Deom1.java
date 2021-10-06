package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Deom1 {
  @Test
  public void b() {
	  int i=0;
	  int result=8/i;
	  Reporter.log("Hi I am From b", true);
  }
}
