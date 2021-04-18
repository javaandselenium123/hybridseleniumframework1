package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("(//a[text()=\"Men\"])[1]"));
		Actions a= new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[text()=\"Sweaters\"]")).click();
		driver.close();
		

	}

}
