package testngdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class Testng {
	
	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	String list;
@BeforeTest
public void setup()
{
	 driver=new ChromeDriver();
	
	
}
	@BeforeMethod
	public void urlload()
	{
		driver.get(baseurl);
	}
	@Test(groups="smoke")
	public void test1()
	{
	driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@gmail.com");	
		
	}
	@Test(groups="sanity")
	public void test2()
	{
	 driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("12345");	
		
	}
	@Test(groups= {"smoke","sanity"})
	public void test3()
	{
		List<WebElement> linkdetail=driver.findElements(By.tagName("a"));
		System.out.println("link details="+linkdetail.size());
	}
		
	
	
	
	
	@AfterMethod
	public void test()
	{
		System.out.println("name and email");
		
	}

	
	
	
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

