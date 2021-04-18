package actionsclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WebElement block3 = driver.findElement(By.xpath("(//h1[@class=\"draghandle\"])[2]"));
		WebElement block4 = driver.findElement(By.xpath("(//h1[@class=\"draghandle\"])[4]"));
		
		Actions a= new Actions(driver);
		a.dragAndDrop(block3, block4).perform();
		driver.close();

	}

}
