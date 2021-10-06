package WebElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver_win32/chromedriver.exe" );
  ChromeDriver driver = new ChromeDriver();
  driver.get("https://www.selenium.dev/downloads/");
  WebElement seleniumServerLink = driver.findElement(By.partialLinkText("3.141.59"));
 boolean status = seleniumServerLink.isDisplayed();
 System.out.println(status);
}
}
