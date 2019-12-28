package demo3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessChrome {

	public static void main(String[] args) {
		test(); 
	}
	public static void test(){
		System.setProperty("webdriver.chrome.driver","E:/Selenium/SeleniumTestNG1/lib/chromedriver/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--headless");
		
		WebDriver driver=new ChromeDriver(options);

		driver.get("https://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		driver.close();
		driver.quit();
		System.out.println("completed");
	}

}
