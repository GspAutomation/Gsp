package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://www.instagram.com");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	driver.findElement(By.name("username")).sendKeys("gsp@gmail.com");
	Thread.sleep(2000);
	driver.findElement(By.name("password")).sendKeys("gsp");
	//Thread.sleep(2000);
	WebElement button = driver.findElement(By.xpath("//button[contains(@class,'L3NKy')]"));
	button.click();
	Point loc = button.getLocation();
	int xAxis = loc.getX();
    int yAxis = loc.getY();
	System.out.println("value of xAxis :"+xAxis);
	System.out.println("value of yAxis :"+yAxis);
	
}
}
