package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Buttontextcheck {

	
	 ChromeDriver driver;
	  String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
		
		@Before
		public void setup()
		{
			driver=new ChromeDriver();
			driver.get(baseurl);
			
		}
		@SuppressWarnings("unlikely-arg-type")
		@Test
	public void test()
	{
		WebElement button=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]"));	
		button.getAttribute("value");
		if(button.equals("check availability"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

		}
		
		
	}
		
	
	
	
	
	
	
	
}
