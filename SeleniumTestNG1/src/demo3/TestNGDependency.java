package demo3;

import org.testng.annotations.Test;

public class TestNGDependency {
	@Test(dependsOnGroups={"sanity1.*"})
	//@Test(dependsOnMethods={"test2","test3"})
	public void test1(){
		System.out.println("I am inside Test1");
	}
	@Test(groups={"sanity1"})
	public void test2(){
		System.out.println("I am inside Test2");
	}

	@Test(groups={"sanity2"})
	public void test3(){
		System.out.println("I am inside Test3");
	}
}

