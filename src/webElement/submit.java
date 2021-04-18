package webElement;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class submit {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(" https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.id("email")).sendKeys("user");
		driver.findElement(By.name("password")).sendKeys("user");
		driver.findElement(By.id("last")).submit();
		driver.findElement(By.xpath("//img[@class=\"user-image\"]")).click();
		driver.findElement(By.xpath("//a[@class=\"btn btn-default btn-flat\"]"));
		driver.findElement(By.xpath("//a[@class=\"btn btn-success btn-flat btn-sm\"]"));
		
		
		
		
				

	}

}
