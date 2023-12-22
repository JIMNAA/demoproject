package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.Fbloginpage;
import page.Fbnewpageclick;

public class Fblogintest {
WebDriver driver;
@BeforeTest
public void setup()
{
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	
	
}
@Test
public void testlogin()
{	
	Fbloginpage ob=new Fbloginpage(driver) ;
	ob.setvalues("abcde@gmail.com","123erfg");
	ob.clickbutton();
	
}
//@Test
//public void testnew() throws Exception
{	
	//Fbnewpageclick ob1=new Fbnewpageclick(driver);
	//ob1.setcreatepage();
	//ob1.setbusinesspage();
}}