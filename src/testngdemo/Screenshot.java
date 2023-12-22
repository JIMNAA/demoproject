package testngdemo;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Screenshot {

	ChromeDriver driver;
	 String baseurl="https://www.guru99.com/drag-drop-selenium.html";
		@BeforeTest
		public void setup()
		{
		driver=new ChromeDriver();
			driver.get(baseurl);
		}
		
		@Test
		public void test() throws Exception
		{
	File screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileHandler.copy(screenshot,new File("C:\\Users\\DELL\\Desktop\\Screenshot\\screenshot1"));
	WebElement banksbutton=driver.findElement(By.xpath("//*[@id='post-1210']/div/div/p[8]/img"));
	File banksecreenshot=banksbutton.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(banksecreenshot,new File("./Screenshot/bankscreenshot.png"));
	
		}
	
	
	
	
	
	
}
