package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbloginpage {

	WebDriver driver;
	/*By fbemail=By.id("email");
	By fbpassword=By.id("pass");
	By fblogin=By.name("login");
	*/
	@FindBy(name="login")
	WebElement loginbutton;
	@FindBy(name="email")
	WebElement emailfield;
	@FindBy(name="pass")
	WebElement password;
	
	
	public Fbloginpage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
}
	    public void clickbutton()//public void setvalues(String email,String password)
	{
		//driver.findElement(fbemail).sendKeys(email);
	    	loginbutton.click();
		//driver.findElement(fbpassword).sendKeys(password);
	}
	
      public void  setvalues(String UN, String pwd)
	{
		emailfield.sendKeys(UN);
		password.sendKeys(pwd);
    	  //driver.findElement(fblogin).click();
	}
}
