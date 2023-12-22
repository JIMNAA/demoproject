package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazone {
       ChromeDriver driver;
     
	
	@Before
	public void setup() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.Amazon.in");
		driver.manage().window().maximize();
		//Thread.sleep(10000);
	}
	@Test
	public void testamazone()
	{
		//driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("phones");
		
		//driver.findElement(By.xpath("//*[@id='nav-xshop']/a[5]")).click();
		//driver.findElement(By.xpath("//*[@id='nav-signin-tooltip']/div/a")).click();
		//driver.findElement(By.xpath("//*[@id='ap_customer_name']")).sendKeys("jimna");
		//driver.findElement(By.xpath("//*[@id='ap_phone_number']")).sendKeys("9744106461");
		//driver.findElement(By.xpath("//*[@id='ap_password']")).sendKeys("97mn@weA");
		//driver.findElement(By.xpath("//*[@id='continue']")).click();
		
		driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
		driver.navigate().back();
		//driver.navigate().forward();
		//driver.navigate().refresh();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']/i")).click();
		//driver.navigate().to("https://www.rediffmail.com");
		
		
		
		
		
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

