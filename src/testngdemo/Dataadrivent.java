package testngdemo;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dataadrivent {

	
	WebDriver driver;
    
    
  @BeforeTest
  public void beforetest()
  {
	  driver=new ChromeDriver(); 
	  
  }
	@Test
	public void test() throws Exception
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\DELL\\Desktop\\New folder\\booksheet.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFSheet sh=wb.getSheet("sheet1");
		int rowcount=sh.getLastRowNum();
		for(int i=1;i<=rowcount;i++)
		{
			String username=sh.getRow(i).getCell(0).getStringCellValue();
			String password=sh.getRow(i).getCell(1).getStringCellValue();
			System.out.println("username="+username);
			System.out.println("password="+password);
			driver.get("https://www.facebook.com");
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("pass")).sendKeys(password);
        driver.findElement(By.name("login")).click();

		}
		
		
	}
	
	
}
