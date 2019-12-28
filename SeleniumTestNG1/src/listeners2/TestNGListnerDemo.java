package listeners2;

import org.testng.SkipException;
import org.testng.annotations.Test;

//kkk @Listeners(listeners2.TestNGListeners2.class)
public class TestNGListnerDemo { 
	@Test
public void test1(){
	System.out.println("I am inside Test1 ");
}

@Test
public void test2(){
System.out.println("I am inside Test2 ");

//String projectPath=System.getProperty("user.dir");
//System.out.println(projectPath);
//System.setProperty("webdriver.chrome.driver",projectPath+"/lib/chromedriver/chromedriver.exe");
//WebDriver driver=new ChromeDriver();

//System.setProperty("webdriver.chrome.driver","E:/Selenium/SeleniumTestNG1/lib/chromedriver/chromedriver.exe");
  //WebDriver driver=new ChromeDriver();
}
@Test
public void test3(){
System.out.println("I am inside Test3 ");
throw new SkipException("This test is skipped");
}
}
