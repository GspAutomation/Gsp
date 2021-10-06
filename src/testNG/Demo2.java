package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo2 {
  @Test
  public void c() {
	  Reporter.log("I amfrom c", true);
  }
}
