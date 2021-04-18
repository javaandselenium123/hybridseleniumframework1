package synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
       driver.findElement(By.id("username")).sendKeys("admin");
       driver.findElement(By.name("pwd")).sendKeys("manager");
       driver.findElement(By.xpath("//div[text()=\"Login \"]")).click();
       String title = driver.getTitle();
       System.out.println(title);
       String url = driver.getCurrentUrl();
       System.out.println(url);
       if(title.equals("actiTIME - Login"))
       {
    	   System.out.println("HP is displayed");
       }
       else
       {
    	   System.out.println("fail");
       }
       driver.close();
       
       
	}

}
