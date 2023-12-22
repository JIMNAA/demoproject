package testngdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Automationexrs {
   ChromeDriver driver;
   
	String baseurl="https://automationexercise.com/";
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}	
		
	@Test
	public void test()
	{
		//login
		driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[4]/a")).click();                 
		
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")).sendKeys("jimna");
		driver.findElement(By.xpath("//*[@id='form']/div/div/div[3]/div/form/input[3]")).sendKeys("jimna93@gmail.com");
					
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click(); 	
		driver.findElement(By.xpath("//*[@id='name']")).sendKeys("jimna"); 	
		//signup
		
		//driver.findElement(By.xpath("//*[@id='email']")).sendKeys("jimna93@gmail.com"); 	
		
		driver.findElement(By.xpath("//*[@id='password']")).sendKeys("123456st"); 	
		driver.findElement(By.xpath("//*[@id='first_name']")).sendKeys("jimnaa"); 	
		
	  
		driver.findElement(By.xpath("//*[@id='last_name']")).sendKeys("aa");
	
		driver.findElement(By.xpath("//*[@id='company']")).sendKeys("luminar");
		driver.findElement(By.xpath("//*[@id=\"address1\"]")).sendKeys("ahouse,oneline");
		driver.findElement(By.xpath("//*[@id='country']")).sendKeys("india");
		driver.findElement(By.xpath("//*[@id='state']")).sendKeys("kerala");
		driver.findElement(By.xpath("//*[@id='city']")).sendKeys("kannur");
		driver.findElement(By.xpath("//*[@id='zipcode']")).sendKeys("670741");
		driver.findElement(By.xpath("//*[@id=\"mobile_number\"]")).sendKeys("670741");
		
		
	WebElement dayele=driver.findElement(By.xpath("//*[@id='days']"));
		Select day=new Select(dayele);
		day.selectByValue("2");
		
		
		driver.findElement(By.xpath("//*[@id='form']/div/div/div/div[1]/form/button")).click();
		
	}		
	

	@BeforeMethod()
public void loginvalid()
	{
		String expurl="https://automationexercise.com/";
		WebElement signup=driver.findElement(By.xpath("//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a"));
		signup.click();
		WebElement email=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
		email.click();
		WebElement password=driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]"));
		password.click();
		String currenturl=driver.getCurrentUrl();
		if(currenturl.equals(expurl))
		{
			System.out.println("login is valid");
		}
		else
		{
			System.out.println("login is invalid");

		}
		
	
	}
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

