package testngdemo;

import org.junit.Test;
import org.testng.annotations.Parameters;

public class Parameterisation {

	@Parameters("a")
	@Test
	public void test(String a)
	{
		System.out.println("value="+a);
	}
	}
	
	
	
	
	
	
	
	
	

