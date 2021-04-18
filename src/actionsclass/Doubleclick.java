package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Doubleclick {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.name("addresstype"));
		Select s=new Select(ele);
		s.selectByVisibleText("Testing");
		
		driver.findElement(By.xpath("(//a[text()=\"Selenium Training\"])[2]")).click();
		
		WebElement ele1 = driver.findElement(By.xpath("//i[@class=\"fa fa-plus\"]"));
		Actions a =new Actions(driver);
		a.doubleClick(ele1).perform();
		driver.close();
		

	}

}
