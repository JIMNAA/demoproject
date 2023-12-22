package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobuttoncheck {
          ChromeDriver driver;
  String baseurl="https://register.rediff.com/register/register.php?FormName=user_details";
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	}
	@Test
	public void rodbtntest()
	
	{
		boolean rad=driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[24]/td[3]/input[1]")).isSelected();
		if(rad)
		{
		System.out.println("selected");
		}
		else
		{
			System.out.println(" not selected");

		}
		
		}
		
	}
	
	
	
	
	
	
	
	
	

