package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args)
	{
		WebDriver driver=  new ChromeDriver();
        //driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.facebook.com/");
	    driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.close();
        
      }

}
