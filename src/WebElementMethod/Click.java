package WebElementMethod;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Click {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe" );
		  ChromeDriver driver = new ChromeDriver();
		  driver.get("https://www.naukri.com/");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		 // WebElement seleniumServerLink = driver.findElement(By.partialLinkText("3.141.59"));
		//seleniumServerLink.click();
		 String w = driver.getWindowHandle();
		Set<String> ws = driver.getWindowHandles();
		System.out.println(w);
		System.out.println(ws);
		
		for(String wh:ws)
		{
			driver.switchTo().window(wh);
			driver.close();
		}
	}

}
