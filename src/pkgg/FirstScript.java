package pkgg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {

	public static void main(String[] args) {
         //ChromeDriver  driver =new ChromeDriver(); //to launch site
		//driver.get("https://www.google.com");//to open a site
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazone.com");
		//ChromeDriver driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		
		//String expectTitle="Google";
		//String actualTitle=driver.getTitle();
		//System.out.println("title="+actualTitle);
		//if(actualTitle.equals(expectTitle))
		//{
			//System.out.println("pass");
	
		//}
		//else
		//{
		//System.out.println("fail");
		//}
	//}
		String actualtitle="Amazone";
		String expectedtitle=driver.getTitle();
		System.out.println("title="+actualtitle);
		if(actualtitle.equals(expectedtitle))
		{
		System.out.println("pass");
		}
		else
		{
			System.out.println("fail");

		}
	}	
		
		
		
		
		
		
	
	
}
 