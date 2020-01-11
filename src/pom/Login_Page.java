package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic_methods.Excel;
import generic_methods.Framework_Constants;

public class Login_Page {
	
	
	//Declaration
	@FindBy(name = "username")
	private WebElement setUsername;
	
	@FindBy(name = "pwd")
	private WebElement setPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement clickLogin;
	
	
	// initialization
	public Login_Page(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	// utilization
	String un = Excel.getData("Sheet1", 1, 0);
	String pwd = Excel.getData("Sheet1", 1, 1);
	public void login_Actitime() throws InterruptedException{
		setUsername.sendKeys(un);
		setPassword.sendKeys(pwd);
		clickLogin.click();
		Thread.sleep(1000);
	}
}
