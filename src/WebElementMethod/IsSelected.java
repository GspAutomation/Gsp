package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
driver.get("file:///C:/Users/patil/Desktop/webelement/checkbox.html");
driver.manage().window().maximize();
Thread.sleep(2000);
   WebElement marathi = driver.findElement(By.id("i1"));
  boolean status = marathi.isSelected();
		  System.out.println(status);
		  
		  marathi.click();
		  boolean status2 = marathi.isSelected();
		  System.out.println(status2);
	  
}
}
