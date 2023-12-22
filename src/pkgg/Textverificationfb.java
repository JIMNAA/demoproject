package pkgg;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textverificationfb {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String text= driver.getPageSource();
		if(text.contains("search"))
		{
		System.out.println("text is present");
		}
		
		else
		{
			System.out.println("text is not present");

		}
		driver.quit();
	}

}
