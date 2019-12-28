package demo3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumWait 
{
	
	public static void main(String[] args) {
		seleniumWaits();
	}
public  static void seleniumWaits() {
	System.setProperty("webdriver.chrome.driver","E:/Selenium/SeleniumTestNG1/lib/chromedriver/chromedriver.exe");
WebDriver driver=new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

driver.get("https://google.com");
driver.findElement(By.name("q")).sendKeys("Automation step by step");
driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);


driver.close();
driver.quit();
}
}
