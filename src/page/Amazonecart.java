package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Amazonecart {
	WebDriver driver;
	public Amazonecart(WebDriver driver)
	{
		this.driver=driver;
	}
	public void mobileclick()
	{
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[5]")).click();
	}
	public void searchmobile()
	{
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung");
	}
	public void click()
	{
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
	}
	
	
	
	
	
	
	
}
