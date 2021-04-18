package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Method {
 public WebDriver driver;
 @BeforeMethod
 public void openApp()
 {
	 driver= new ChromeDriver();
	 driver.get("https://www.facebook.com/");
 }
    
  @Test
  public void login()
  {
	  driver.findElement(By.name("email")).sendKeys("abcd");
	  driver.findElement(By.name("pass")).sendKeys("efgh");
	  driver.findElement(By.name("login")).click();
	  String title = driver.getTitle();
	  Reporter.log(title, true);
	  String url = driver.getCurrentUrl();
	  Reporter.log(url, true);
	 }
  
  @AfterMethod
  public void closeApp()
  {
	  driver.close();
  }
  
}

