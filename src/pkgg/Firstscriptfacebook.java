package pkgg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Firstscriptfacebook {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.Facebook.com");
		
		String actualTitle="Facebook";
		String expetTitle=driver.getTitle();
		System.out.println("title="+actualTitle);
		if(actualTitle.equalsIgnoreCase(expetTitle))
		{
		System.out.println("pass");
		}
		
		else
		{
			System.out.println("fail");
	
			
		}
		
	}

}
