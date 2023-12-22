package junit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdwn {
     ChromeDriver driver;
	String baseurl="https://www.rediff.com";
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get(baseurl);
	}
	@Test
	public void dropdwnntest()
	{
		driver.findElement(By.xpath("//*[@id='signin_info']/a[2]")).click();
		WebElement dayelement=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select day=new Select(dayelement);
		day.selectByValue("02");
		WebElement monthelement=driver.findElement(By.xpath("//*[@name='DOB_Monthda']"));
		Select month=new Select(monthelement);
		day.selectByValue("MAY");
		
		
		
}
	




}