package demo3;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGParameters {
	@Test
	@Parameters({"MyName"})
	public void tets(String name){
		System.out.println("Name is : "+name);
	}

}
