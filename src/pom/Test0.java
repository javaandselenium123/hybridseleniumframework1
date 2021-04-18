package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test0 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/");
		
		SkillraryDemo s= new SkillraryDemo(driver);
		s.loginButton();
		s.usertextbox("user");
		s.passwordtextbox("user");		
		
				

	}

}
