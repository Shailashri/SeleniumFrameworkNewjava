package demo3;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		//driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","E:/Selenium/SeleniumTestNG1/lib/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.katalon.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Test
	public void test1() throws Exception {
		driver.get("https://www.google.com/search?q=orangehrmdemo&rlz=1C1NHXL_enIN758IN758&oq=orangehrmdemo&aqs=chrome..69i57j0l2.9901j0j7&sourceid=chrome&ie=UTF-8");
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Web results'])[1]/following::h3[1]")).click();
		driver.findElement(By.id("frmLogin")).click();
		driver.findElement(By.id("divUsername")).click();
		driver.findElement(By.id("divUsername")).click();
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("asmin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOGIN Panel'])[1]/following::span[1]")).click();
		driver.findElement(By.id("txtUsername")).click();
		driver.findElement(By.id("txtUsername")).clear();
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("divLoginHelpLink")).click();
		driver.findElement(By.id("txtPassword")).click();
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='About'])[2]/following::li[5]")).click();
		driver.findElement(By.id("welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
