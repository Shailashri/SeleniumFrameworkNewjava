package demo3;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoIT {
	public static void main(String[] args) throws IOException, InterruptedException {
		test();
	}
	public static void test() throws IOException, InterruptedException{

		System.setProperty("webdriver.chrome.driver","E:/Selenium/SeleniumTestNG1/lib/chromedriver/chromedriver.exe");

		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.tinyupload.com/");
		driver.findElement(By.name("uploaded_file")).click();
 Runtime.getRuntime().exec("H:/FileUploadScript");
	Thread.sleep(3000);
	 driver.close();
	}	
}
