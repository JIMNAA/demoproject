package page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Fbnewpageclick {
	

		WebDriver driver;
	public Fbnewpageclick(WebDriver driver)
		{
			this.driver=driver;
		}
		public void  setcreatepage() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]/a")).click();
		}
		public void setbusinesspage() throws InterruptedException {
			Thread.sleep(2000);

driver.findElement(By.xpath("//[@id='content']/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div")).click();
		}
		
}