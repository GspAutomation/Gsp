package TestNgPractice;

import org.testng.annotations.Test;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Group {
@Test(groups = "F")
public void f()
{
	Reporter.log("f1", true);
}
@Test(groups = "I")
public void i()
{
	Reporter.log("i1", true);
}

@Test(groups = "F")
public void ff()
{
	Reporter.log("f2", true);
}

@Test(groups = "I")
public void ii()
{
	Reporter.log("i2", true);
}

}
