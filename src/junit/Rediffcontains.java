package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediffcontains {

	ChromeDriver driver;
	String baseurl="https://www.rediff.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
		
		
		
	}
	@Test
	public void contantest()
	{
		driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();
		                           
		
		driver.findElement(By.xpath("//*[@id='tblcrtac']/tbody/tr[3]/td[3]/input")).sendKeys("jimnaa" );
		driver.findElement(By.xpath("//*[contains(@name,'login']")).sendKeys("jimna93@gmail.com"); 
		driver.findElement(By.xpath("//*[contains(@name,'passwd']")).sendKeys("12346789@qw");
		driver.findElement(By.xpath("//*[contains(@name,'confirm_passwd']")).sendKeys("12346789@qw");
		driver.findElement(By.xpath("//*[contains(@name,'altemail']")).sendKeys("jimna93@gmail.com"); 
		
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[30]/td[2]/img")).click(); 
		//doubts in this contains();
		
	}
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

