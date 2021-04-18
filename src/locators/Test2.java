package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("ghag");
		driver.findElement(By.name("password")).sendKeys("hjgvghjghv");
		driver.findElement(By.linkText("submit")).click();
		
		}

}
