package test;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.WebDriver;

public class Amazonecartpage2 {

	WebDriver driver;
	String parent;
	public Amazonecartpage2(WebDriver driver){
		{
			this.driver=driver;
			
		}
	}
	public void scrllpage()
	{
		JavasriptExcutor js=(JavasriptExcutor) driver;
		js.excutescript("window.scrollby(0,600)");
		
	}
	public void childwindow()
	{
		parent=driver.getWindowHandle();
		Set<String> totalwindow= driver.getWindowHandles();
		for(String handle:totalwindow)
		{
			if(!handle.equalsIgnoreCase(parent)) {
			
				driver.switchTo().Window.handle();
			}
		}
		
	}
	
	}
	
	
	
	
	
	
	
	
	
}
