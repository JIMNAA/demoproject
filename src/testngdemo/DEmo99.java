package testngdemo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DEmo99 {
ChromeDriver driver;
 String baseurl="https://demo.guru99.com/test/simple_context_menu.html#google_vignette";
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
		driver.get(baseurl);
	}
	
	@Test
	public void test()
	{
		//Actions action = new Actions(driver);

		//WebElement link = driver.findElement(By.cssSelector(".context-menu-one"));
	//	action.contextClick(link).perform();
		//WebElement element = driver.findElement(By.cssSelector(".context-menu-icon-copy"));
	//	element.click();
		
		Actions action1 = new Actions(driver);
		WebElement linkElement =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		action1.doubleClick(linkElement).perform();
		Alert alert = driver.switchTo().alert();
		System.out.println("Alert Text\n" +alert.getText());
		alert.accept();  
	
	}
	
	
	
}
