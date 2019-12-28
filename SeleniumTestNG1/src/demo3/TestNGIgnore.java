package demo3;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;
@Ignore
public class TestNGIgnore {
	@Test
	//@Ignore
	public void test1(){
		System.out.println("I am inside Test1");
	}
	@Test
	public void test2(){
		System.out.println("I am inside Test2");
	}
}