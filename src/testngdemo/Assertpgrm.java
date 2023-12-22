package testngdemo;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertpgrm {
	ChromeDriver driver;

@BeforeTest
public void setup()
{
driver=new ChromeDriver();
driver.get("https://www.google.com");
}
	@Test
	public void test()
	{
		String expetTitle ="googl";
	String actualTitle =driver.getTitle();
	Assert.assertEquals(actualTitle,expetTitle);
	System.out.println("title="+actualTitle);
	if(actualTitle.equalsIgnoreCase(expetTitle))
	{
	System.out.println("pass");
	}
	
	else
	{
		System.out.println("fail");
	}
		
	
	}
}
	
	
	

