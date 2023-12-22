package junit;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkscount {

	ChromeDriver driver;
	String baseurl="https://www.facebook.com";
	//String baseurl="https://www.amazon.in";

	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void linktest()
	{
	List<WebElement> linkdetail=driver.findElements(By.tagName("a"));
	System.out.println("link details="+linkdetail.size());
	for(WebElement element:linkdetail)
	{
		String link=element.getAttribute("href");
		String linktext=element.getText();
System.out.println(link+"----------"+linktext);
	}
	}
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

