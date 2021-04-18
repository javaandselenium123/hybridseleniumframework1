package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemo {
     //declaration
	@FindBy(xpath="//a[text()=\"LOGIN\"]")
	private WebElement loginbtn;
	
	@FindBy(id="email")
	private WebElement usernametb;
	
	@FindBy(name="password")
	private WebElement passwordtb;
	
	//initialization
	public SkillraryDemo(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
   //utilization
	public void loginButton()
	{
		loginbtn.click();
	}

	public void usertextbox(String us)
	{
		usernametb.sendKeys(us);
	}

    public void passwordtextbox(String pwd)
    {
    	passwordtb.sendKeys(pwd);
    }
}
