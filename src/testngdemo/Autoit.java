package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Autoit {

	ChromeDriver driver;
	String baseurl="https://www.ilovepdf.com/pdf_to_word";

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.get(baseurl);
	}	
	
	@Test
	public  void filetest()
	{
	driver.get("https://www.ilovepdf.com/pdf_to_word");
	driver.findElement(By.xpath("//*[@id=\"pickfiles\"]")).click();;
	Thread.sleep(3000);
	Runtime.getRuntime().exec("C:\\Users\\DELL\\Downloads\\doc.au3");
	Thread.sleep(4000);
	
	}
	
	
}
