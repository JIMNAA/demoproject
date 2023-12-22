package testngdemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepicker {
WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.trivago.in/en-IN/lm?themeId=280&search=200-64981&sem_keyword=trivago&sem_creativeid=598703244840&sem_matchtype=e&sem_network=g&sem_device=c&sem_placement=&sem_target=&sem_adposition=&sem_param1=&sem_param2=&sem_campaignid=12420192376&sem_adgroupid=126823053068&sem_targetid=aud-1678683578339:kwd-5593367084&sem_location=9148989&cipc=br&cip=9119000005&gad_source=1&gclid=Cj0KCQiAgqGrBhDtARIsAM5s0_l9ZRw6d6lhfsHrhkjZPAAoUjtiv4Wk1xCuoeoPZKCWtufoi0b5i_MaAm2lEALw_wcB");
	}
	@Test
	public void  datepickertest()
	{
	driver.findElement(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/div[2]/div/div[3]/div/div/fieldset/button[1]")).click();
		datepickermethod("December 2023","28");
		datepickermethod("march 10","20");
	}
	public void datepickermethod(String expmonth,String expdate)
	{
		while(true)
		{
		String month=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/h3")).getText();	
		if(month.equals(expmonth))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/button[2]/span")).click();
		}
		List<WebElement>alldates=driver.findElements(By.xpath("//*[@id=\"__next\"]/div[1]/main/div[1]/div[2]/div/div[3]/div/div[2]/div/div/div/div[2]/div/div[1]/div[2]/button/time"));
		for(WebElement datelements:alldates)
		{
			String date=datelements.getText();
			if(expdate.equals(expdate))
			{
				datelements.click();
				break;
			}
		}
	}
	}
	
}	
	
	
	
	
	
	

