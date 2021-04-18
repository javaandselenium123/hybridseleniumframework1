package dropdowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		WebElement ele = driver.findElement(By.id("searchDropdownBox"));
		
		Select s = new Select(ele);
		s.selectByIndex(1);
		Thread.sleep(3000);
		s.selectByValue("search-alias=beauty-intl-ship");
		Thread.sleep(3000);
		s.selectByVisibleText("Deals");
		
		List<WebElement> ele1 = s.getOptions();
		System.out.println(ele1.size());
		for(WebElement b:ele1)
		{
			System.out.println(b.getText());
		}
		
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			s.deselectAll();
		}
		driver.close();
		
		
		

	}

}
