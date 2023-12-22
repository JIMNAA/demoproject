package pkgg;

import org.openqa.selenium.chrome.ChromeDriver;

public class TextVerification {

	public static void main(String[] args) {

	ChromeDriver driver=new ChromeDriver();	
		
		driver.get("https://www.google.com");
		String src=driver.getPageSource();//get pagesource//words
		if(src.contains("im  feeling lucky"))
		{
		System.out.println("text is present");
		}
		
		else
		{
			System.out.println("text is not present");

		}
	}

}
