package dropdowns;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@role=\"button\"])[2]")).click();
		WebElement ele = driver.findElement(By.id("month"));
		Select s= new Select(ele);
		s.selectByIndex(2);
		Thread.sleep(6000);
		s.selectByIndex(5);
		
		List<WebElement> allOptions = s.getOptions();
		System.out.println(allOptions.size());
		for(WebElement b:allOptions)
		{
			System.out.println(b.getText());
		}
		System.out.println(s.isMultiple());
		if(s.isMultiple())
		{
			Thread.sleep(3000);
			s.deselectAll();
		}
		driver.close();

	}

}
